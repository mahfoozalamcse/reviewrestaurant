package com.mahfooz.restaurant.mappers;

import com.mahfooz.restaurant.domain.dtos.PhotoDto;
import com.mahfooz.restaurant.domain.entities.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {
  PhotoDto toDto(Photo photo);
}
