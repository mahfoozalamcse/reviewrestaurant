package com.mahfooz.restaurant.mappers;

import com.mahfooz.restaurant.domain.ReviewCreateUpdateRequest;
import com.mahfooz.restaurant.domain.dtos.ReviewCreateUpdateRequestDto;
import com.mahfooz.restaurant.domain.dtos.ReviewDto;
import com.mahfooz.restaurant.domain.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {

    ReviewCreateUpdateRequest toReviewCreateUpdateRequest(ReviewCreateUpdateRequestDto dto);

    ReviewDto toDto(Review review);

}