package com.uber.uber.services.impl;

import com.uber.uber.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {


    @Override
    public double calculateDistance(Point src, Point dest) {
        return 0;
    }
}
