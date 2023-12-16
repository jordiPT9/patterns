package com.jordipt.paymentservice.infraction_red_light;

import com.jordipt.paymentservice.infraction.domain.ImageType;
import com.jordipt.paymentservice.infraction.domain.Infraction;

import java.sql.Timestamp;
import java.util.HashMap;

public class RedLightInfraction extends Infraction {
    public RedLightInfraction(String id, String licensePlate, Timestamp readDate, String expedient, String agentCode, String place, HashMap<ImageType, String> imageNames, String exportedDate) {
        super(id, licensePlate, readDate, expedient, agentCode, place, imageNames, exportedDate);
    }
}
