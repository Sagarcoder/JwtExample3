package com.jwt.example.Services;

import com.jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User>store=new ArrayList<>();
    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Sagar Jadhav","sagarjadhav@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Nilesh Patil","nileshpatil@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Mahesh Shinde","maheshShinde@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Gokul kale","gokulkale@gmail.com"));

    }

    public List<User>getUsers(){
        return this.store;
    }







}
