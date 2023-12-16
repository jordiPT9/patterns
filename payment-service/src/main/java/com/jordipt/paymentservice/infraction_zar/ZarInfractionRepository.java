package com.jordipt.paymentservice.infraction_zar;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ZarInfractionRepository {
    ZarInfraction findById(String id);

    List<ZarInfraction> findByIds(List<String> id);
}
