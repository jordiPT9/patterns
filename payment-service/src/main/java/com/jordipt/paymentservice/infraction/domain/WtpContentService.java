package com.jordipt.paymentservice.infraction.domain;

import com.jordipt.paymentservice.org_data.WtpData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WtpContentService {

    // wtp.txt
    public String makeWtpTxtContent(List<WtpInfraction> infractions, WtpData wtpData) {
        return null;
    }

    // fotos.txt
    public String makeFotosTxtContent(List<WtpInfraction> infractions, WtpData wtpData) {
        return null;
    }
}
