package com.in28minutes.rest.web.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService userDaoService;

    public UserResource (UserDaoService userDaoService){
        this.userDaoService = userDaoService;
    }

    @GetMapping(path = "/user")
    public List<User> retrieveAllUser(){
        return userDaoService.findAll();
    }

    @GetMapping(path = "/user/{id}")
    public User retrieveUser(@PathVariable int id){
        return userDaoService.findOne(id);
    }

}
