package ru.example.springbootrest.service.user;

import ru.example.springbootrest.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity userEntity);
    List<UserEntity> findAll();
    UserEntity findById(Integer userId);
}
