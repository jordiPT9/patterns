package com.jordipt.paymentservice.infraction.domain.export_service;

import com.jordipt.paymentservice.infraction.domain.ImageType;
import com.jordipt.paymentservice.infraction.domain.Infraction;
import com.jordipt.paymentservice.infraction.domain.WtpContentService;
import com.jordipt.paymentservice.infraction.domain.WtpInfraction;
import com.jordipt.paymentservice.infraction.domain.WtpInfractionFileCreator;
import com.jordipt.paymentservice.org_data.OrgType;
import com.jordipt.paymentservice.org_data.WtpData;
import com.jordipt.paymentservice.org_data.WtpDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WtpExportService implements ExportService {
    private final WtpContentService wtpContentService;
    private final WtpInfractionFileCreator wtpFileCreator;
    private final WtpDataRepository wtpDataRepository;

    public WtpExportService(WtpContentService wtpContentService,
                            WtpInfractionFileCreator wtpFileCreator,
                            WtpDataRepository wtpDataRepository) {
        this.wtpContentService = wtpContentService;
        this.wtpFileCreator = wtpFileCreator;
        this.wtpDataRepository = wtpDataRepository;
    }

    @Override
    public String createExport(List<? extends Infraction> infractions, String centerName) {
        List<WtpInfraction> wtpInfractions = infractions.stream()
                .map(infraction -> WtpInfraction.builder()
                        .licensePlate(infraction.getLicensePlate())
                        .readingDate(infraction.getReadDate())
                        .expedient(infraction.getExpedient())
                        .agentCode(infraction.getAgentCode())
                        .place(infraction.getPlace())
                        .infractionImages(infraction.getImagesPaths())
                        .build())
                .collect(Collectors.toList());

        WtpData wtpData = wtpDataRepository.findByOrg(OrgType.WTP);
        String wtpTxtContent = wtpContentService.makeWtpTxtContent(wtpInfractions, wtpData);
        String fotosTxtContent = wtpContentService.makeFotosTxtContent(wtpInfractions, wtpData);

        List<String> infractionsImagesNames = infractions.stream()
                .map(infraction -> (infraction.getImagesPaths()).get(ImageType.MERGED))
                .collect(Collectors.toList());

        String fileName = wtpFileCreator.createExportFile(wtpTxtContent, fotosTxtContent, infractionsImagesNames, centerName);

        return fileName;
    }
}
