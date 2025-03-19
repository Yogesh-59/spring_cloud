package com.example.user_service.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<String> users = new ArrayList<>();

    public List<String> getAllUsers() {
        return users;
    }

    public void addUser(String user) {
        users.add(user);
    }
}
