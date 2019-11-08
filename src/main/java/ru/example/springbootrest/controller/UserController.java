package ru.example.springbootrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.example.springbootrest.entity.UserEntity;
import ru.example.springbootrest.request.AddUserRequest;
import ru.example.springbootrest.repository.UserRepository;

import java.util.List;

@RestController(value = "users")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("get")
    @ResponseBody
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/users")
    @ResponseBody
    public String addNewWebUser(@RequestBody AddUserRequest addUserRequest) {

        UserEntity user = new UserEntity();
        user.setName(addUserRequest.getName());
        user.getAge(addUserRequest.getAge());
        user.getBirthDate(addUserRequest.getBirthDate());
        UserEntity save = userRepository.save(user);

        if (save == null) {
            return "Cannot add user";
        } else {
            return "Success";
        }
    }

}