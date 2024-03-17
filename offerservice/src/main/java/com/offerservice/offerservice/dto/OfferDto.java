package com.offerservice.offerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OfferDto {
    private Long id;
    private String message;
    private String type;
    private Double price;
}
