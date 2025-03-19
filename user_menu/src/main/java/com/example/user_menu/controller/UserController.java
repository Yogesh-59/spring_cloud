package com.example.user_menu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/user_menu")
public class UserController {
    private List<String> menu = new ArrayList<>(Arrays.asList("Home", "Profile", "Settings"));
    @GetMapping
    public List<String> getAllMenus() {

        return menu;
    }

    @PostMapping
    public ResponseEntity<String> addMenu(@RequestBody String item) {
        menu.add(item);
        return ResponseEntity.ok("Menu item added successfully");
    }
}
