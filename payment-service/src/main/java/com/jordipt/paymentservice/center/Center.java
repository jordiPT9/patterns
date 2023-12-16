package com.jordipt.paymentservice.center;

import com.jordipt.paymentservice.org_data.OrgType;

public class Center {
    private String name; // TODO: que sea el id?
    private OrgType orgType;

    public OrgType getOrgType() {
        return OrgType.WTP;
    }
}
