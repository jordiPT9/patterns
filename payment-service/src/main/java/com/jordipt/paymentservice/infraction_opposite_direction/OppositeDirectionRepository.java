package com.jordipt.paymentservice.infraction_opposite_direction;

import com.jordipt.paymentservice.infraction.domain.Infraction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OppositeDirectionRepository {
    OppositeDirectionInfraction findById(String id);

    List<Infraction> findByIds(List<String> infractionIds);
}
