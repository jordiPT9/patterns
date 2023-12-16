package com.jordipt.paymentservice.infraction_red_light;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RedLightRepository {
    RedLightInfraction findById(String id);

    List<RedLightInfraction> findByIds(List<String> infractionIds);
}
