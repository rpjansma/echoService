package com.echo.echoservice.entities.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class UserDto {


    private UUID id;
    private String userName;
    private String password;
}
