package com.jordipt.paymentservice.infrastructure;

import com.jordipt.paymentservice.domain.OrgData.OrgType;
import com.jordipt.paymentservice.domain.OrgData.WtpData;
import org.springframework.stereotype.Service;

@Service
public class WtpDataRepository {
    public WtpData findByOrg(OrgType orgType) {
        return null;
    }
}
