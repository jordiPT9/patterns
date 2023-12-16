package com.jordipt.paymentservice.infraction.domain;

import java.sql.Timestamp;
import java.util.HashMap;

public abstract class Infraction {
    protected String id;
    protected String licensePlate;
    protected Timestamp readDate;
    protected String expedient; // TODO: que sea el id?
    protected String agentCode;
    protected String place;
    protected String exportedDate;

    // TODO: podriamos mirar alguna manera de guardar el path completo para saber en que bucket está directamente
    protected HashMap<ImageType, String> imagesPaths;

    public Infraction(String id,
                      String licensePlate,
                      Timestamp readDate,
                      String expedient,
                      String agentCode,
                      String place,
                      HashMap<ImageType, String> imagesPaths,
                      String exportedDate) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.readDate = readDate;
        this.expedient = expedient;
        this.agentCode = agentCode;
        this.place = place;
        this.imagesPaths = imagesPaths;
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

    public HashMap<ImageType, String> getImagesPaths() {
        return imagesPaths;
    }

    public void setImagesPaths(HashMap<ImageType, String> imagesPaths) {
        this.imagesPaths = imagesPaths;
    }
}
