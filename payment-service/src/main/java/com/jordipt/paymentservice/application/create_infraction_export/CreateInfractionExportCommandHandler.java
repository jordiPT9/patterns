package com.jordipt.paymentservice.application.create_infraction_export;

import com.jordipt.paymentservice.domain.ExportService.ExportService;
import com.jordipt.paymentservice.domain.ExportService.ExportServiceFactory;
import com.jordipt.paymentservice.domain.Infraction.Infraction;
import com.jordipt.paymentservice.domain.InfractionType;
import com.jordipt.paymentservice.domain.OrgData.OrgType;
import com.jordipt.paymentservice.infrastructure.ZarInfractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CreateInfractionExportCommandHandler {
    private final ExportServiceFactory exportServiceFactory;
    private final ZarInfractionRepository zarInfractionRepository;

    public CreateInfractionExportCommandHandler(ExportServiceFactory exportServiceFactory,
                                                ZarInfractionRepository zarInfractionRepository) {
        this.exportServiceFactory = exportServiceFactory;
        this.zarInfractionRepository = zarInfractionRepository;
    }

    public void execute(CreateInfractionExportCommand command) {
        OrgType orgType = getOrgType(command.centerName());
        List<Infraction> infractions = getInfractions(command.infractionIds(), command.infractionType());

        ExportService exportService = exportServiceFactory.get(orgType);
        String fileName = exportService.createExport(infractions, command.centerName());

        // Create export
        // Create audit log
    }

    private OrgType getOrgType(String centerName) {
        return null;
    }

    private List<Infraction> getInfractions(List<String> infractionIds, InfractionType type) {
        return infractionIds.stream()
                .map(id -> switch (type) {
                    case ZAR -> zarInfractionRepository.findById(id);
                    case RED_LIGHT -> zarInfractionRepository.findById(id);
                    case OPPOSITE_DIRECTION -> zarInfractionRepository.findById(id);
                    case GAUJE_CONTROL -> zarInfractionRepository.findById(id);
                    case SECTION_CONTROL -> zarInfractionRepository.findById(id);
                })
                .collect(Collectors.toList());
    }


}
