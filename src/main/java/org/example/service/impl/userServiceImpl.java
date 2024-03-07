package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.userEntity;
import org.example.repository.userRepository;
import org.example.service.userService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class userServiceImpl implements userService {
    final userRepository repository;
    final ModelMapper mapper;
    public List<userEntity> getAllUsers(){
        return repository.findAll();
    }

    @Override
    public void addUser(User user) {
        userEntity entity = mapper.map(user, userEntity.class);
        repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    @Override
    public User findByUserName(String userName) {
        return mapper.map(repository.findByUserName(userName),User.class);
    }

    @Override
    public Boolean isExistsUser(String userName) {
       return repository.existsByUserName(userName);
    }

}
