package com.reviewservice.reviewservice.mapper;

import com.reviewservice.reviewservice.dto.ReviewDto;
import com.reviewservice.reviewservice.entity.Review;

public class ReviewMapper {
    public static ReviewDto mapToReview(Review review){
        return new ReviewDto(
                review.getId(),
                review.getComment(),
                review.getMarks()
        );
    }

    public static Review mapToUser(ReviewDto reviewDto){
        return new Review(
                reviewDto.getId(),
                reviewDto.getComment(),
                reviewDto.getMarks()
        );
    }
}
