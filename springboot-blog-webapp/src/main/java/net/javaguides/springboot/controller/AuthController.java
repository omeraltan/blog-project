package net.javaguides.springboot.controller;

import net.javaguides.springboot.dto.RegistrationDto;
import net.javaguides.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // handle method to handle user registration request
    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        // this object holds form data
        RegistrationDto user = new RegistrationDto();
        model.addAttribute("user", user);
        return "register";
    }

    // handler method to handle user registration form submit request
    @PostMapping("/register/save")
    public String register(@ModelAttribute("user") RegistrationDto user){
        userService.saveUser(user);
        return "redirect:/register?success";
    }

}
