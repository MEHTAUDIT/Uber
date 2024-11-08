package com.uber.uber.services;

import com.uber.uber.dto.DriverDto;
import com.uber.uber.dto.RideDto;
import com.uber.uber.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);
    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();
    List<RideDto> getAllMyRides();
}
