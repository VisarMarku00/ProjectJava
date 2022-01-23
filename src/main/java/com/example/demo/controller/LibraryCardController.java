package com.example.demo.controller;

import com.example.demo.pojo.entity.LibraryCard;
import com.example.demo.pojo.entity.User;
import com.example.demo.pojo.input.LibraryCardInput;
import com.example.demo.service.LibraryCardService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryCardController {

    /** the service for this controller**/
    @Autowired
    private LibraryCardService libraryCardService;

    /** get request to find every library card**/
    @GetMapping("/librarycard")
    public List<LibraryCard> getAllLibraryCards(){
        return libraryCardService.findAll();
    }

    /** get request to find a library card by id**/
    @GetMapping("/librarycard/{id}")
    public LibraryCard getLibraryCardById(@PathVariable Integer id){
        return libraryCardService.findCardById(id);
    }

    /** post request to input a library card in the database**/
    @PostMapping("/librarycard")
    public LibraryCard insertNewLibraryCard(@RequestBody LibraryCardInput libraryCardInput){
        return libraryCardService.save(libraryCardInput);
    }

    /** delete request to delete a library card from the database**/
    @DeleteMapping("/librarycard/{id}")
    public Boolean deleteLibraryCard(@PathVariable Integer id){
        libraryCardService.delete(id);
        return true;
    }

  /*  @GetMapping("/librarycard/{first name}/librarycard/{last name}")
    public List<User> findLibraryCardByFirstNameAndLastName(@PathVariable String firstName,
                                                                   @PathVariable String lastName){
        return userService.findUserByFirstNameAndLastName(firstName,lastName);
    }
*/









}
