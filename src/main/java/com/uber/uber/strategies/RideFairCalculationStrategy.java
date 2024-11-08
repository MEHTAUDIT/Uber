package com.uber.uber.strategies;

import com.uber.uber.dto.RideRequestDto;

public interface RideFairCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
