package com.echo.echoservice.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EchoController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity helloWorld() {
        return new ResponseEntity("Alou", HttpStatus.OK);
    }

}
