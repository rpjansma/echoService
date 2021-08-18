package com.echo.echoservice.web;


import com.echo.echoservice.entities.dto.UserDto;
import com.echo.echoservice.services.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public ResponseEntity authUser(@RequestBody UserDto userDto) {
        return ResponseEntity(loginService.authenticateUser(userDto), HttpStatus.OK);
    }
}
