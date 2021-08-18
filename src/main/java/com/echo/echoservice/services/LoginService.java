package com.echo.echoservice.services;

import com.echo.echoservice.entities.dto.UserDto;

public interface LoginService {

    UserDto createUser(String username, String password);

    UserDto authenticateUser(String username, String password);

}
