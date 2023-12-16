package com.jordipt.paymentservice.domain.Infraction;

import java.sql.Timestamp;
import java.util.List;

public class ZarInfraction extends Infraction {
    private ZarInfractionStatus status;
    private String plateImage;
    private String contextImage;
    private Timestamp processedDate;
    private String deniedReason;
    private String licensePlateReadId;
    private String cameraId;
    private String zoneId;

    public ZarInfraction(String id,
                         String licensePlate,
                         Timestamp readDate,
                         String expedient,
                         String agentCode,
                         String place,
                         String exportedDate,
                         ZarInfractionStatus status,
                         String plateImage,
                         String contextImage,
                         Timestamp processedDate,
                         String deniedReason,
                         String licensePlateReadId,
                         String cameraId,
                         String zoneId,
                         List<String> imageNames) {
        super(id, licensePlate, readDate, expedient, agentCode, place, imageNames, exportedDate);
        this.status = status;
        this.plateImage = plateImage;
        this.contextImage = contextImage;
        this.processedDate = processedDate;
        this.deniedReason = deniedReason;
        this.licensePlateReadId = licensePlateReadId;
        this.cameraId = cameraId;
        this.zoneId = zoneId;
    }

    public ZarInfractionStatus getStatus() {
        return status;
    }

    public void setStatus(ZarInfractionStatus status) {
        this.status = status;
    }

    public String getPlateImage() {
        return plateImage;
    }

    public void setPlateImage(String plateImage) {
        this.plateImage = plateImage;
    }

    public String getContextImage() {
        return contextImage;
    }

    public void setContextImage(String contextImage) {
        this.contextImage = contextImage;
    }

    public Timestamp getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(Timestamp processedDate) {
        this.processedDate = processedDate;
    }

    public String getDeniedReason() {
        return deniedReason;
    }

    public void setDeniedReason(String deniedReason) {
        this.deniedReason = deniedReason;
    }

    public String getLicensePlateReadId() {
        return licensePlateReadId;
    }

    public void setLicensePlateReadId(String licensePlateReadId) {
        this.licensePlateReadId = licensePlateReadId;
    }

    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }
}
