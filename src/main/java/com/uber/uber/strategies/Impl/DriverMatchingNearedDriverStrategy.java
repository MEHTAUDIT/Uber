package com.uber.uber.strategies.Impl;

import com.uber.uber.dto.RideRequestDto;
import com.uber.uber.entities.Driver;
import com.uber.uber.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return null;
    }
}
