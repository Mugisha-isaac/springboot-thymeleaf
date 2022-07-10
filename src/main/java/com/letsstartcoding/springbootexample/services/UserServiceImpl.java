package com.letsstartcoding.springbootexample.services;

import com.letsstartcoding.springbootexample.model.Role;
import com.letsstartcoding.springbootexample.model.User;
import com.letsstartcoding.springbootexample.repository.UserRepository;
import com.letsstartcoding.springbootexample.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    @Autowired

    private UserRepository userRepository;

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(),registrationDto.getLastName(),registrationDto.getEmail(),registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
