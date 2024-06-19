package com.picpay.delivery.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface ControllerExample {

    @GetMapping(value = "/v1/test")
    ResponseEntity<Object> postExample(
            @RequestParam("user") String param
    );

}
