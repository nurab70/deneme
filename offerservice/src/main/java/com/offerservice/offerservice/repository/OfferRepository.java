package com.offerservice.offerservice.repository;

import com.offerservice.offerservice.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
