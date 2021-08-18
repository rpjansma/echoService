package com.echo.echoservice.entities.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class UserDto {


    private UUID id;

    @NotBlank
    private String userName;

    @NotBlank
    private String password;
}
