package ru.example.springbootrest.service.user;

import org.springframework.stereotype.Service;
import ru.example.springbootrest.entity.UserEntity;
import ru.example.springbootrest.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public UserEntity findById(Integer userId){
        return userRepository.findById(userId).orElse(null);
    }

}
