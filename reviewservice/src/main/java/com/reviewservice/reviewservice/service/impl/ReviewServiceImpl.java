package com.reviewservice.reviewservice.service.impl;

import com.reviewservice.reviewservice.dto.ReviewDto;
import com.reviewservice.reviewservice.repository.ReviewRepository;
import com.reviewservice.reviewservice.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private ReviewRepository reviewRepository;

    @Override
    public ReviewDto createReview(ReviewDto reviewDto) {
        return null;
    }


}
