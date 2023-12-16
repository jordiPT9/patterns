package com.jordipt.paymentservice.infraction_zar;

import com.jordipt.paymentservice.infraction.domain.ImageType;
import com.jordipt.paymentservice.infraction.domain.Infraction;

import java.sql.Timestamp;
import java.util.HashMap;

public class ZarInfraction extends Infraction {
    private ZarInfractionStatus status;
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
                         Timestamp processedDate,
                         String deniedReason,
                         String licensePlateReadId,
                         String cameraId,
                         String zoneId,
                         HashMap<ImageType, String> imageNames) {
        super(id, licensePlate, readDate, expedient, agentCode, place, imageNames, exportedDate);
        this.status = status;
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
