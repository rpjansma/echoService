package com.echo.domain.services.impl;

import com.echo.domain.entities.dto.UserDto;
import com.echo.domain.services.LoginService;

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
