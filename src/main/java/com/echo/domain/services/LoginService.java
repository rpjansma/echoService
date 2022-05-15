package com.echo.domain.services;

import com.echo.domain.entities.dto.UserDto;

public interface LoginService {

    UserDto createUser(String username, String password);

    UserDto authenticateUser(String username, String password);

}
