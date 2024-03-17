package com.offerservice.offerservice.service;

import com.offerservice.offerservice.dto.OfferDto;

import java.util.List;

public interface OfferService {
    OfferDto createOffer(OfferDto offerDto);
    OfferDto getOfferById(Long offerId);
    List<OfferDto> getAllOffers();
    OfferDto updateOffer(Long offerId, OfferDto updatedOfferDto);
    void deleteOffer(Long offerId);
}