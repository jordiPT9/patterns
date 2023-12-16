package com.jordipt.paymentservice.infraction_gauje_control;

import com.jordipt.paymentservice.infraction.domain.Infraction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GaujeRepository {
    GaujeInfraction findById(String id);

    List<Infraction> findByIds(List<String> infractionIds);
}
