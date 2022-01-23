package com.example.demo.pojo.input;

import java.util.Date;

/**class for entering the data for the User table**/
public class UserInput {

    /**firstName property represents the firstName column of the user entity**/
    private String firstName;
    /**lastName property represents the lastName column of the user entity**/
    private String lastName;
    /**dateOfBirth property represents the dateOfBirth column of the user entity**/
    private String dateOfBirth;

    /**default constructor for User class**/
    public UserInput() {
    }

    /**constructor for User class**/
    public UserInput(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    /**getter for the firstName property of the UserInput class**/
    public String getFirstName() {
        return firstName;
    }

    /**setter for the firstName property of the UserInput class**/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**getter for the lastName property of the UserInput class**/
    public String getLastName() {
        return lastName;
    }

    /**setter for the lastName property of the UserInput class**/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**getter for the dateOfBirth property of the UserInput class**/
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**setter for the dateOfBirth property of the UserInput class**/
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
