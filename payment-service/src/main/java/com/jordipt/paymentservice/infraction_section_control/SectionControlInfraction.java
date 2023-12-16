package com.jordipt.paymentservice.infraction_section_control;

import com.jordipt.paymentservice.infraction.domain.ImageType;
import com.jordipt.paymentservice.infraction.domain.Infraction;

import java.sql.Timestamp;
import java.util.HashMap;

public class SectionControlInfraction extends Infraction {
    public SectionControlInfraction(String id, String licensePlate, Timestamp readDate, String expedient, String agentCode, String place, HashMap<ImageType, String> imageNames, String exportedDate) {
        super(id, licensePlate, readDate, expedient, agentCode, place, imageNames, exportedDate);
    }
}
