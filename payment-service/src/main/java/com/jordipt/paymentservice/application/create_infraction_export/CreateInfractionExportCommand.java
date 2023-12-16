package com.jordipt.paymentservice.application.create_infraction_export;

import com.jordipt.paymentservice.domain.InfractionType;

import java.util.List;

public class CreateInfractionExportCommand {
    private final String centerName;
    private final String currentUserName;
    private final InfractionType infractionType;
    private final List<String> infractionIds;

    public CreateInfractionExportCommand(String centerName,
                                         String currentUserName,
                                         InfractionType infractionType,
                                         List<String> infractionIds) {
        this.centerName = centerName;
        this.currentUserName = currentUserName;
        this.infractionType = infractionType;
        this.infractionIds = infractionIds;
    }

    public String centerName() {
        return centerName;
    }

    public String currentUserName() {
        return currentUserName;
    }

    public InfractionType infractionType() {
        return infractionType;
    }

    public List<String> infractionIds() {
        return infractionIds;
    }
}
