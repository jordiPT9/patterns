package com.jordipt.paymentservice.domain.Infraction;

import java.sql.Timestamp;
import java.util.List;

public class GaujeInfraction extends Infraction {
    public GaujeInfraction(String id, String licensePlate, Timestamp readDate, String expedient, String agentCode, String place, List<String> imageNames, String exportedDate) {
        super(id, licensePlate, readDate, expedient, agentCode, place, imageNames, exportedDate);
    }
}