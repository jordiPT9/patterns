package com.jordipt.paymentservice.infraction_section_control;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SectionControlRepository {
    SectionControlInfraction findById(String id);

    List<SectionControlInfraction> findByIds(List<String> infractionIds);
}
