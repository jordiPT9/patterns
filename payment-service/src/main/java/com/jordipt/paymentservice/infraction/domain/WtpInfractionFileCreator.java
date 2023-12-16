package com.jordipt.paymentservice.infraction.domain;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WtpInfractionFileCreator {
    public String createExportFile(String wtpFileContent,
                                   String fotosFileContent,
                                   List<String> imageNames,
                                   String centerName) {
        return "file.zip";
    }
}
