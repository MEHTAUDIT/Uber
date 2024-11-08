package com.uber.uber.services;

import com.uber.uber.dto.DriverDto;
import com.uber.uber.dto.RideDto;
import com.uber.uber.dto.RideRequestDto;
import com.uber.uber.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);
    RideDto cancelRide(Long rideId);

    RiderDto rateDriver(Long rideId, Integer rating);
    RiderDto getMyProfile();
    List<RideDto> getAllMyRides();

}

