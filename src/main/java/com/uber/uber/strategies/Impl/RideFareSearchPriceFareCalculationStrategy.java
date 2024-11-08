package com.uber.uber.strategies.Impl;

import com.uber.uber.dto.RideRequestDto;
import com.uber.uber.strategies.RideFairCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSearchPriceFareCalculationStrategy implements RideFairCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
