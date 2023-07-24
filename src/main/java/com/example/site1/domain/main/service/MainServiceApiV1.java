package com.example.site1.domain.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.site1.model.user.repository.UserRepository;

@Service
public class MainServiceApiV1 {
    @Autowired
    private UserRepository userRepository;

    public void getUserList(){
        
    }
}
