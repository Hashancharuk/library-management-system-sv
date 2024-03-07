package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Login;
import org.example.entity.loginEntity;
import org.example.repository.loginRepository;
import org.example.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class loginServiceImpl implements LoginService {
    final loginRepository repository;
    final ModelMapper mapper;
    @Override
    public void insertLoginData(Login login) {
        repository.save(mapper.map(login, loginEntity.class));
    }
}
