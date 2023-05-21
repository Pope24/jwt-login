package com.jwtauthentication.controller;

import com.jwtauthentication.dto.response.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin("*")
public class AdminController {
    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return new ResponseEntity<>(new ResponseMessage("hello world"), HttpStatus.OK);
    }
}
