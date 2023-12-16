package com.jordipt.paymentservice.infraction.application.create_infraction_export;

import com.jordipt.paymentservice.infraction.domain.InfractionType;
import com.jordipt.paymentservice.shared.Command;

import java.util.List;

public record CreateInfractionExportCommand(
        String centerName,
        String currentUserName,
        InfractionType infractionType,
        List<String> infractionIds) implements Command {
}
