package com.jordipt.paymentservice.domain;

import com.jordipt.paymentservice.domain.Infraction.WtpInfraction;
import com.jordipt.paymentservice.domain.OrgData.WtpData;
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
