package com.reviewservice.reviewservice.service;

import com.reviewservice.reviewservice.dto.ReviewDto;

public interface ReviewService {
    ReviewDto createReview(ReviewDto reviewDto);
}
