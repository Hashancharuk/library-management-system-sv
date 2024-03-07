package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Login;
import org.example.repository.loginRepository;
import org.example.service.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
@RequiredArgsConstructor
public class loginController {
    final LoginService service;
    @PostMapping("/requestLogin")
    public Boolean validationLogin(@RequestBody Login login){
        return service.validationLogin(login);
    }
}
