package com.jordipt.paymentservice.infraction.domain.export_service;

import com.jordipt.paymentservice.org_data.OrgType;
import org.springframework.stereotype.Service;

@Service
public class ExportServiceFactory {
    private final WtpExportService wtpExportService;

    public ExportServiceFactory(WtpExportService wtpExportService) {
        this.wtpExportService = wtpExportService;
    }

    public ExportService get(OrgType orgType) {
        return switch (orgType) {
            case WTP -> wtpExportService;
            case XALOC -> null;
            case BASE -> null;
        };
    }
}
