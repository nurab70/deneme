package com.offerservice.offerservice.controller;

import com.offerservice.offerservice.dto.OfferDto;
import com.offerservice.offerservice.service.OfferService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class OfferController {
    private OfferService offerService;
    @PostMapping
    public ResponseEntity<OfferDto> createOffer(@RequestBody OfferDto offerDto){
        OfferDto savedOffer = offerService.createOffer(offerDto);
        return new ResponseEntity<>(savedOffer, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<OfferDto> getOfferById(@PathVariable("id") Long offerId){
        OfferDto offerDto = offerService.getOfferById(offerId);
        return  ResponseEntity.ok(offerDto);
    }
    @GetMapping
    public ResponseEntity<List<OfferDto>> getAllOffers(){
        List<OfferDto> offers = offerService.getAllOffers();
        return ResponseEntity.ok(offers);
    }
    @PutMapping({"id"})
    public ResponseEntity<OfferDto> updateOffer(@PathVariable("id") Long offerId,
                                                  @RequestBody OfferDto updatedOffer){
        OfferDto offerDto = offerService.updateOffer(offerId, updatedOffer);
        return ResponseEntity.ok(offerDto);
    }
    @DeleteMapping({"id"})
    public ResponseEntity<String > deleteCourse(@PathVariable("id") Long offerId){
        offerService.deleteOffer(offerId);
        return ResponseEntity.ok("Course deleted successfully!.");
    }
}