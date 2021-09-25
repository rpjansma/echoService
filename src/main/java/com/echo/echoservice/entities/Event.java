package com.echo.echoservice.entities;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotNull
    private String title;
    private String description;

    @DateTimeFormat
    private LocalDateTime initialDate;
    @DateTimeFormat
    private LocalDateTime finalDate;

    @CreatedDate
    private LocalDateTime creationDate;
    @UpdateTimestamp
    private LocalDateTime updateDate;




}
