package com.example.demo.controller;

import com.example.demo.pojo.entity.User;
import com.example.demo.pojo.input.UserInput;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    /** the service for this controller**/
    @Autowired
    private UserService userService;

    /** get request to find every user**/
    @GetMapping("/user")
    public List<User> getAllUsers(){
        return  userService.findAll();
    }

    /** get request to find a user by id**/
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }

    /** post request to input a user in the database**/
    @PostMapping("/user")
    public User insertNewUser(@RequestParam UserInput userInput){
        return userService.save(userInput);
    }

    /** put request to update a user in the database**/
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable Integer id,
                           @RequestBody UserInput userInput){
        return userService.update(id, userInput);
    }

    /**delete request to delete a user from database**/
    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable Integer id){
        userService.delete(id);
        return true;
    }

    /**get request to find a user by first name and last name**/
    @GetMapping("/user/{firstName}&{lastName}")
    public List<User> findUserByFirstNameAndLastName(@PathVariable String firstName,
                                                     @PathVariable String lastName){
        return userService.findUserByFirstNameAndLastName(firstName, lastName);
    }






}
