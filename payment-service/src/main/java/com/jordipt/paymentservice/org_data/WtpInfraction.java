package com.jordipt.paymentservice.org_data;

import com.jordipt.paymentservice.infraction.domain.ImageType;
import com.jordipt.paymentservice.infraction.domain.Infraction;

import java.sql.Timestamp;
import java.util.HashMap;

public record WtpInfraction(
        String licensePlate,
        Timestamp readingDate,
        String expedient,
        String agentCode,
        String place,
        HashMap<ImageType, String> infractionImagesPaths
) {
    public WtpInfraction(Infraction infraction) {
        this(
                infraction.getLicensePlate(),
                infraction.getReadDate(),
                infraction.getExpedient(),
                infraction.getAgentCode(),
                infraction.getPlace(),
                infraction.getImagesPaths()
        );
    }
}
