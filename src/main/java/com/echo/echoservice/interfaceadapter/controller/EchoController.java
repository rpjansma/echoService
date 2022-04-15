package com.echo.echoservice.interfaceadapter.controller;


import com.echo.echoservice.entities.dto.DollarCotationDTO;
import com.echo.echoservice.services.external.PTAX;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("api/v1")
@EnableWebMvc
public class EchoController {

    private static Logger logger = LoggerFactory.getLogger(EchoController.class);

    @Autowired
    PTAX ptaxService;

    @GetMapping
    public ResponseEntity<DollarCotationDTO> helloWorld() {
        var cotation = ptaxService.getDollarCotation("01-01-2021", "09-18-2021");

        return new ResponseEntity(cotation, HttpStatus.OK);
    }

}
