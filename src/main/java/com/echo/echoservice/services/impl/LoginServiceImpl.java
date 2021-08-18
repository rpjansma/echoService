package com.echo.echoservice.services.impl;

import com.echo.echoservice.entities.dto.UserDto;
import com.echo.echoservice.services.LoginService;

public class LoginServiceImpl implements LoginService {

    @Override
    public UserDto createUser(String username, String password){
        return UserDto.builder().userName("teste").password("teste").build();
    }

    @Override
    public UserDto authenticateUser(String username, String password) {
        return UserDto.builder().userName("teste").password("teste").build();
    }
}
