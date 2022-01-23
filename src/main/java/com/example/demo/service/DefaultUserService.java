package com.example.demo.service;

import com.example.demo.pojo.entity.User;
import com.example.demo.pojo.input.UserInput;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/**in this class we do the implementation of the methods from the UserService interface**/
public class DefaultUserService implements UserService{

    @Autowired
    /**this class contains the methods to find the User by different criteria**/
    private UserRepository userRepository;

    @Override
    /**method to find all the users in the table**/
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    /**method to find a user by id**/
    public User findUserById(Integer id) {
        if(id==null){
        return null;
        }
        return userRepository.findUserById(id);
    }

    @Override
    /**method to save a new user to the table**/
    public User save(UserInput userInput) {
        String firstName=userInput.getFirstName();
        String lastName=userInput.getLastName();
        String dateOfBirth=userInput.getDateOfBirth();

        User user=new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setDateOfBirth(dateOfBirth);
        return userRepository.save(user);
    }

    @Override
    /**method to update a user in the table**/
    public User update(Integer id, UserInput userInput) {
        User user=userRepository.findUserById(id);
        if(user==null){
            return null;
        }
        String updatedFirstName=userInput.getFirstName();
        String updatedLastName=userInput.getLastName();
        String updatedDate=userInput.getDateOfBirth();

        user.setLastName(updatedLastName);
        user.setFirstName(updatedFirstName);
        user.setDateOfBirth(updatedDate);
        return userRepository.save(user);

    }

    @Override
    /**method to delete a user from the table**/
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    /**method to find the user by first name and last name**/
    public List<User> findUserByFirstNameAndLastName(String firstName, String lastName) {
        return userRepository.findUserByFirstNameAndLastName(firstName,lastName);
    }
}
