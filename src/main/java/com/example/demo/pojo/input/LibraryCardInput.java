package com.example.demo.pojo.input;

/**class for entering the data for the LibraryCard table**/
public class LibraryCardInput {

    /**dateRegistered property represents the dateRegistered column of the librarycard entity**/
    private String dateRegistered;
    /**expiryDate property represents the expiryDate column of the librarycard entity**/
    private String expiryDate;

    /**default constructor for LibraryCardInput class**/
    public LibraryCardInput() {
    }

    /**constructor for LibraryCardInput class**/
    public LibraryCardInput(String dateRegistered, String expiryDate) {
        this.dateRegistered = dateRegistered;
        this.expiryDate = expiryDate;
    }

    /**getter for the DateRegistered property of the LibraryCardInput class**/
    public String getDateRegistered() {
        return dateRegistered;
    }

    /**setter for the DateRegistered property of the LibraryCardInput class**/
    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    /**getter for the DateRegistered property of the LibraryCardInput class**/
    public String getExpiryDate() {
        return expiryDate;
    }

    /**setter for the DateRegistered property of the LibraryCardInput class**/
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
