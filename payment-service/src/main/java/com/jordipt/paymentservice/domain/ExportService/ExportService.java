package com.jordipt.paymentservice.domain.ExportService;

import com.jordipt.paymentservice.domain.Infraction.Infraction;

import java.util.List;

public interface ExportService {
    String createExport(List<Infraction> infractions, String centerName);
}
