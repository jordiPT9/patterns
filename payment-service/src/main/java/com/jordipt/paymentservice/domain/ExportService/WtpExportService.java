package com.jordipt.paymentservice.domain.ExportService;

import com.jordipt.paymentservice.domain.WtpInfractionFileCreator;
import com.jordipt.paymentservice.domain.Infraction.Infraction;
import com.jordipt.paymentservice.domain.Infraction.WtpInfraction;
import com.jordipt.paymentservice.domain.OrgData.OrgType;
import com.jordipt.paymentservice.domain.OrgData.WtpData;
import com.jordipt.paymentservice.domain.WtpContentService;
import com.jordipt.paymentservice.infrastructure.WtpDataRepository;
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
    public String createExport(List<Infraction> infractions, String centerName) {
        List<WtpInfraction> wtpInfractions = infractions.stream()
                .map(infraction -> WtpInfraction.builder()
                        .licensePlate(infraction.getLicensePlate())
                        .readingDate(infraction.getReadDate())
                        .expedient(infraction.getExpedient())
                        .agentCode(infraction.getAgentCode())
                        .place(infraction.getPlace())
                        .infractionImages(infraction.getImageNames())
                        .build())
                .collect(Collectors.toList());
        WtpData wtpData = wtpDataRepository.findByOrg(OrgType.WTP);
        String wtpTxtContent = wtpContentService.makeWtpTxtContent(wtpInfractions, wtpData);
        String fotosTxtContent = wtpContentService.makeFotosTxtContent(wtpInfractions, wtpData);
        List<String> infractionsImagesNames = infractions.stream()
                .map(infraction -> infraction.getImageNames().stream().findFirst().orElse(null))
                .collect(Collectors.toList());
        String fileName = wtpFileCreator.createExportFile(wtpTxtContent, fotosTxtContent, infractionsImagesNames, centerName);

        return fileName;
    }
}
