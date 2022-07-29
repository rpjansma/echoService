package com.echo.domain.entities.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class EventDTO {

    public String title;
    public String description;

    @DateTimeFormat
    public LocalDateTime initialDate;
    @DateTimeFormat
    public LocalDateTime finalDate;
}
