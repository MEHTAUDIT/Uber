package com.uber.uber.services;

import com.uber.uber.dto.DriverDto;
import com.uber.uber.dto.SignupDto;
import com.uber.uber.dto.UserDto;

public interface AuthService {

    String login(String username, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
