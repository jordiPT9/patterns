package com.jordipt.paymentservice.infraction.domain;

import java.sql.Timestamp;
import java.util.HashMap;

public class WtpInfraction {
    private String licensePlate;
    private Timestamp readingDate;
    private String expedient;
    private String agentCode;
    private String place;
    private HashMap<ImageType, String> infractionImagesPaths;

    private WtpInfraction() {
    }

    public static WtpInfractionBuilder builder() {
        return new WtpInfractionBuilder();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Timestamp getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(Timestamp readingDate) {
        this.readingDate = readingDate;
    }

    public String getExpedient() {
        return expedient;
    }

    public void setExpedient(String expedient) {
        this.expedient = expedient;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public HashMap<ImageType, String> getInfractionImagesPaths() {
        return infractionImagesPaths;
    }

    public void setInfractionImagesPaths(HashMap<ImageType, String> infractionImagesPaths) {
        this.infractionImagesPaths = infractionImagesPaths;
    }

    public static class WtpInfractionBuilder {
        private final WtpInfraction wtpInfraction = new WtpInfraction();

        private WtpInfractionBuilder() {
        }

        public WtpInfractionBuilder readingDate(Timestamp readingDate) {
            this.wtpInfraction.setReadingDate(readingDate);
            return this;
        }

        public WtpInfractionBuilder expedient(String expedient) {
            this.wtpInfraction.setExpedient(expedient);
            return this;
        }

        public WtpInfractionBuilder licensePlate(String licensePlate) {
            this.wtpInfraction.setLicensePlate(licensePlate);
            return this;
        }

        public WtpInfractionBuilder agentCode(String agentCode) {
            this.wtpInfraction.setAgentCode(agentCode);
            return this;
        }

        public WtpInfractionBuilder place(String place) {
            this.wtpInfraction.setPlace(place);
            return this;
        }

        public WtpInfractionBuilder infractionImages(HashMap<ImageType, String> infractionImages) {
            this.wtpInfraction.setInfractionImagesPaths(infractionImages);
            return this;
        }

        public WtpInfraction build() {
            return this.wtpInfraction;
        }
    }

}
