package org.praks.springframework.bowerybeerworks.services;

import org.praks.springframework.bowerybeerworks.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerId(UUID beerId);
}
