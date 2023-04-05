package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WinnerService {
 
    @Autowired
    private RestTemplate restTemplate;
 
    public void callCalculationMicroservice() {
        String url = "http://calculation-service/calculate";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
     
    }
}

