package com.uber.uber.services.impl;

import com.uber.uber.dto.RideDto;
import com.uber.uber.dto.RideRequestDto;
import com.uber.uber.dto.RiderDto;
import com.uber.uber.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {

        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return null;
    }
}
