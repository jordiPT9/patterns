package com.jordipt.paymentservice.infraction_section_control;

import com.jordipt.paymentservice.infraction.domain.Infraction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SectionControlRepository {
    SectionControlInfraction findById(String id);

    List<SectionControlInfraction> findByIds(List<String> infractionIds);
}
