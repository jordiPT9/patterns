package com.jordipt.paymentservice.infraction.application.create_infraction_export;

import com.jordipt.paymentservice.center.Center;
import com.jordipt.paymentservice.center.CenterRepository;
import com.jordipt.paymentservice.infraction.domain.Infraction;
import com.jordipt.paymentservice.infraction.domain.InfractionType;
import com.jordipt.paymentservice.infraction.domain.export_service.ExportService;
import com.jordipt.paymentservice.infraction.domain.export_service.ExportServiceFactory;
import com.jordipt.paymentservice.infraction_gauje_control.GaujeInfractionRepository;
import com.jordipt.paymentservice.infraction_opposite_direction.OppositeDirectionRepository;
import com.jordipt.paymentservice.infraction_red_light.RedLightRepository;
import com.jordipt.paymentservice.infraction_section_control.SectionControlRepository;
import com.jordipt.paymentservice.infraction_zar.ZarInfractionRepository;
import com.jordipt.paymentservice.shared.CommandHandler;
import com.jordipt.paymentservice.user.UserCenterChecker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateInfractionExportCommandHandler implements CommandHandler<CreateInfractionExportCommand> {
    private final UserCenterChecker userCenterChecker;
    private final ExportServiceFactory exportServiceFactory;
    private final CenterRepository centerRepository;
    private final ZarInfractionRepository zarInfractionRepository;
    private final RedLightRepository redLightRepository;
    private final OppositeDirectionRepository oppositeDirectionRepository;
    private final GaujeInfractionRepository gaujeInfractionRepository;
    private final SectionControlRepository sectionControlRepository;

    public CreateInfractionExportCommandHandler(
            UserCenterChecker userCenterChecker,
            ExportServiceFactory exportServiceFactory,
            CenterRepository centerRepository,
            ZarInfractionRepository zarInfractionRepository,
            RedLightRepository redLightRepository,
            OppositeDirectionRepository oppositeDirectionRepository,
            GaujeInfractionRepository gaujeInfractionRepository,
            SectionControlRepository sectionControlRepository
    ) {
        this.userCenterChecker = userCenterChecker;
        this.exportServiceFactory = exportServiceFactory;
        this.centerRepository = centerRepository;
        this.zarInfractionRepository = zarInfractionRepository;
        this.redLightRepository = redLightRepository;
        this.oppositeDirectionRepository = oppositeDirectionRepository;
        this.gaujeInfractionRepository = gaujeInfractionRepository;
        this.sectionControlRepository = sectionControlRepository;
    }

    @Override
    public void execute(CreateInfractionExportCommand command) {
        userCenterChecker.check(command.currentUserName(), command.centerName());
        Center center = centerRepository.findByName(command.centerName());
        List<? extends Infraction> infractions = getInfractions(command.infractionIds(), command.infractionType());

        ExportService exportService = exportServiceFactory.get(center.getOrgType());
        String fileName = exportService.createExport(infractions, command.centerName());

        // Create export
        // Create audit log
    }

    private List<? extends Infraction> getInfractions(List<String> infractionIds, InfractionType type) {
        return switch (type) {
            case ZAR -> zarInfractionRepository.findByIds(infractionIds);
            case RED_LIGHT -> redLightRepository.findByIds(infractionIds);
            case OPPOSITE_DIRECTION -> oppositeDirectionRepository.findByIds(infractionIds);
            case GAUJE_CONTROL -> gaujeInfractionRepository.findByIds(infractionIds);
            case SECTION_CONTROL -> sectionControlRepository.findByIds(infractionIds);
        };
    }
}
