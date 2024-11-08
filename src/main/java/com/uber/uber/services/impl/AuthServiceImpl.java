package com.uber.uber.services.impl;

import com.uber.uber.dto.DriverDto;
import com.uber.uber.dto.SignupDto;
import com.uber.uber.dto.UserDto;
import com.uber.uber.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String username, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }

}
