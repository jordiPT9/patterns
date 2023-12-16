package com.jordipt.paymentservice.domain.Infraction;

import java.sql.Timestamp;
import java.util.List;

public abstract class Infraction {
    protected String id;
    protected String licensePlate;
    protected Timestamp readDate;
    protected String expedient;
    protected String agentCode;
    protected String place;
    protected List<String> imageNames;
    protected String exportedDate;

    public Infraction(String id,
                      String licensePlate,
                      Timestamp readDate,
                      String expedient,
                      String agentCode,
                      String place,
                      List<String> imageNames,
                      String exportedDate) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.readDate = readDate;
        this.expedient = expedient;
        this.agentCode = agentCode;
        this.place = place;
        this.imageNames = imageNames;
        this.exportedDate = exportedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Timestamp getReadDate() {
        return readDate;
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

    public void setReadDate(Timestamp readDate) {
        this.readDate = readDate;
    }

    public String getExportedDate() {
        return exportedDate;
    }

    public void setExportedDate(String exportedDate) {
        this.exportedDate = exportedDate;
    }

    public List<String> getImageNames() {
        return imageNames;
    }

    public void setImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
    }
}
