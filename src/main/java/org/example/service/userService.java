package org.example.service;

import org.example.dto.User;
import org.example.entity.userEntity;

import java.util.List;

public interface userService {
    List<userEntity> getAllUsers();

    void addUser(User user);

    void deleteById(Long id);
    User findByUserName(String userName);

    Boolean isExistsUser(String userName);
}
