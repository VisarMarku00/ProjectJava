package com.example.demo.pojo.entity;

import javax.persistence.*;
@Entity
/**it is mapped to the table named librarycard**/
@Table(name="librarycard")
public class LibraryCard {

    /** this annotation defines the id of the entity**/
    @Id
    /**this annotation defines the generation method for the id**/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**this annotation shows that it is mapped to the id column**/
    @Column(name="id")
    /**id property represents the id of the librarycard entity**/
    private Integer id;

    /**this annotation shows that it is mapped to the dateRegistered column**/
    @Column(name="dateRegistered")
    /**dateRegistered property represents the dateRegistered column of the librarycard entity**/
    private String dateRegistered;

    /**this annotation shows that it is mapped to the expiryDate column**/
    @Column(name="expiryDate")
    /**expiryDate property represents the expiryDate column of the librarycard entity**/
    private String expiryDate;

    /**annotation to express the relationship between LibraryCard and User**/
    @OneToOne
    /**annotation to express the column in which the tables will be joined**/
    @JoinColumn(name="userId")
    /**user object represents the user entity**/
    private User user;


    /**default constructor for LibraryCard class**/
    public LibraryCard() {
    }

    /**constructor for LibraryCard class**/
    public LibraryCard(Integer id, String dateRegistered, String expiryDate) {
        this.id = id;
        this.dateRegistered = dateRegistered;
        this.expiryDate = expiryDate;
    }

    /**getter for the id of the LibraryCard class**/
    public Integer getId() {
        return id;
    }

    /**setter for the id of the LibraryCard class**/
    public void setId(Integer id) {
        this.id = id;
    }

    /**getter for the DateRegistered property of the LibraryCard class**/
    public String getDateRegistered() {
        return dateRegistered;
    }

    /**setter for the DateRegistered property of the LibraryCard class**/
    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    /**getter for the DateRegistered property of the LibraryCard class**/
    public String getExpiryDate() {
        return expiryDate;
    }

    /**setter for the DateRegistered property of the LibraryCard class**/
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

}
