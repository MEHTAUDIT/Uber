package com.uber.uber.strategies;

import com.uber.uber.dto.RideRequestDto;
import com.uber.uber.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto);
}
