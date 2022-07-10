package com.letsstartcoding.springbootexample.services;

import com.letsstartcoding.springbootexample.model.User;
import com.letsstartcoding.springbootexample.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
