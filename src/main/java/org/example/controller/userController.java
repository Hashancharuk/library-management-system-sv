package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.userEntity;
import org.example.service.userService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class userController {
     final userService service;
    @GetMapping("/get-all-users")
    public List<userEntity> getAllUsers(){
       return  service.getAllUsers();
    }
    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteById(id);
    }
    @GetMapping("/findByUserName/{userName}")
    public User findByUserName(@PathVariable String userName){
        return service.findByUserName(userName);
    }
    @GetMapping("/isExistsUser/{userName}")
    public Boolean isExistsUser(@PathVariable String userName){
      return service.isExistsUser(userName);
    }
}
