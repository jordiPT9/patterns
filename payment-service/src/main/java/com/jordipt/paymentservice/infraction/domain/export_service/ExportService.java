package com.jordipt.paymentservice.infraction.domain.export_service;

import com.jordipt.paymentservice.infraction.domain.Infraction;

import java.util.List;

public interface ExportService {
    String createExport(List<? extends Infraction> infractions, String centerName);
}
