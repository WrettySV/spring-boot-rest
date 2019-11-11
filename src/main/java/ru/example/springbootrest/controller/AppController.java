package ru.example.springbootrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.example.springbootrest.entity.CreditEntity;
import ru.example.springbootrest.entity.UserEntity;
import ru.example.springbootrest.request.AddCreditRequest;
import ru.example.springbootrest.request.AddUserRequest;
import ru.example.springbootrest.repository.UserRepository;
import ru.example.springbootrest.service.credit.CreditService;
import ru.example.springbootrest.service.user.UserService;

import java.util.List;

@RestController(value = "users")
public class AppController {

    private final UserService userService;
    private final CreditService creditService;

    public AppController(UserService userService, CreditService creditService) {
        this.userService = userService;
        this.creditService = creditService;
    }

    @GetMapping("getusers")
    @ResponseBody
    public List<UserEntity> findAllUsers() {
        return userService.findAll();
    }

    @PostMapping(value = "/users")
    @ResponseBody
    public String addNewWebUser(@RequestBody AddUserRequest addUserRequest) {
        UserEntity user = new UserEntity();
        user.setName(addUserRequest.getName());
        user.setAge(addUserRequest.getAge());
        user.setBirthDate(addUserRequest.getBirthDate());

        UserEntity result = userService.createUser(user);
        if (result == null) return "Cannot add user";
        else {
            return "Success";
        }
    }

    @PostMapping (value = "/credits")
    @ResponseBody
    public String addNewCredit (@RequestBody AddCreditRequest addCreditRequest) {
        CreditEntity creditEntity = new CreditEntity();
        System.out.println(addCreditRequest.getIdUser());
        creditEntity.setAmount(addCreditRequest.getAmount());
        creditEntity.setTerm(addCreditRequest.getTerm());

        UserEntity userServiceById = userService.findById(addCreditRequest.getIdUser());
        if (userServiceById == null) {
            return "Cannot find user by id:" + addCreditRequest.getIdUser();
        }

        creditEntity.setUserByIdUser(userServiceById);
        CreditEntity credit = creditService.createCredit(creditEntity);
        if (credit == null) {
            return "Cannot create credit, see log for details";
        } else {
            return "Success added credit for client " + userServiceById.getName();
        }

    }
}