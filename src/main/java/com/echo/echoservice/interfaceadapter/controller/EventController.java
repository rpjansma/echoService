package com.echo.echoservice.interfaceadapter.controller;


import com.echo.echoservice.entities.Event;
import com.echo.echoservice.entities.dto.EventDTO;
import com.echo.echoservice.services.EventServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class EventController {

    @Autowired
    EventServices eventServices;

    @GetMapping("/events")
    public ResponseEntity getAllEvents() {

        return new ResponseEntity(eventServices.getAllEvents(), HttpStatus.OK);
    }

    @PostMapping("/events")
    public ResponseEntity createNewEvent(@RequestBody EventDTO event) {

        return new ResponseEntity(eventServices.saveNewEvent(event), HttpStatus.OK);
    }

    @PutMapping("/events")
    public ResponseEntity editExistingEvent(@RequestBody EventDTO event) {

        return new ResponseEntity(eventServices.saveNewEvent(event), HttpStatus.OK);
    }


}
