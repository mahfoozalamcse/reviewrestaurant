package com.mahfooz.restaurant.services;

import com.mahfooz.restaurant.domain.GeoLocation;
import com.mahfooz.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}