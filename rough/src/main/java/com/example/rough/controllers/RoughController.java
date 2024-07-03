package com.example.rough.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RoughController {

    @PostMapping(value = "/listen", headers = {"content-type=text/plain"})
    @ResponseBody
    public ResponseEntity<String> handleValidation(
            @RequestParam(value = "validationToken", required = false) final String validationToken,
            @RequestBody(required = false) String body) {
        System.out.println("Received token "+validationToken);
        System.out.println("Received body "+body);
        return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body(validationToken);
    }

}
