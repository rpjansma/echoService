package com.echo.domain.services;

import com.echo.domain.entities.Event;
import com.echo.domain.entities.dto.EventDTO;
import com.echo.infrastructure.database.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServices {

    @Autowired
    EventRepository repository;

    public List<Event> getAllEvents() {

        List<Event> events = repository.findAll();

        return events;
    }

    public Optional<Event> getEventById(String id) {

        Optional<Event> event = repository.findById(id);

        return event;
    }

    public Event saveNewEvent(EventDTO eventDto) {

        Event event = Event.builder().title(eventDto.title).description(eventDto.description).initialDate(eventDto.initialDate).finalDate(eventDto.finalDate).build();
        repository.save(event);

        return event;
    }

    public Event editExistingEvent(Event event) {

        repository.save(event);

        return event;
    }
}
