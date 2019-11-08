package ru.example.springbootrest.request;

import javax.persistence.*;
import java.sql.Date;

public class AddUserRequest {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name="seq",sequenceName="my_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    private int id;
    private String name;
    private Date birthDate;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
