package org.praks.springframework.bowerybeerworks.services;

import org.praks.springframework.bowerybeerworks.web.model.BeerDto;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerId(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Dallas Blonde")
                .beerStyle("Pale Ale")
                .build();
    }
}
