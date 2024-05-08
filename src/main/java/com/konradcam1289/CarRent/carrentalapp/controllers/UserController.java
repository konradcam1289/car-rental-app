package com.konradcam1289.CarRent.carrentalapp.controllers;


import com.konradcam1289.CarRent.carrentalapp.entity.User;
import com.konradcam1289.CarRent.carrentalapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;
    @PostMapping("/addUser")
    @ResponseBody
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }
}
