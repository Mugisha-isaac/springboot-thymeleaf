package com.letsstartcoding.springbootexample.services;

import com.letsstartcoding.springbootexample.model.User;
import com.letsstartcoding.springbootexample.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
