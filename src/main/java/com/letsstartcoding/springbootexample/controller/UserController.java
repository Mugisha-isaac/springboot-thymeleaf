package com.letsstartcoding.springbootexample.controller;

import com.letsstartcoding.springbootexample.services.UserService;
import com.letsstartcoding.springbootexample.services.UserServiceImpl;
import com.letsstartcoding.springbootexample.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserController {
    @Autowired
    private UserService userService;


    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();
    }
    @GetMapping
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new UserRegistrationDto());
        return "registration";
    }

    @PostMapping

    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){
        userService.save(registrationDto);
        return "redirect:/registration?success";
    }

}
