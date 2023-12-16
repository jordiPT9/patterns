package com.jordipt.paymentservice.domain.Infraction;

import java.sql.Timestamp;
import java.util.List;

public class RedLightInfraction extends Infraction {
    public RedLightInfraction(String id, String licensePlate, Timestamp readDate, String expedient, String agentCode, String place, List<String> imageNames, String exportedDate) {
        super(id, licensePlate, readDate, expedient, agentCode, place, imageNames, exportedDate);
    }
}
