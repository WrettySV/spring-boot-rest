/*
package ru.example.springbootrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.springbootrest.entity.UserEntity;
import ru.example.springbootrest.repository.UserRepository;


import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void createUsers(UserEntity user) {
        userRepository.save(user);
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public UserEntity findById(Integer userId){
        return userRepository.findById(userId).orElse(null);
    }

}
*/
