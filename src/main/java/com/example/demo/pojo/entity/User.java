package com.example.demo.pojo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
@Entity
/**it is mapped to the table named book**/
@Table(name="user")
public class User {

    /** this annotation defines the id of the entity**/
    @Id
    /**this annotation defines the generation method for the id**/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**this annotation shows that it is mapped to the id column**/
    @Column(name="id")
    /**id property represents the id of the user entity**/
    private Integer id;

    /**this annotation shows it is mapped to the firstName column**/
    @Column(name="firstName")
    /**firstName property represents the firstName column of the user entity**/
    private String firstName;


    /**this annotation shows it is mapped to the lastName column**/
    @Column(name="lastName")
    /**lastName property represents the lastName column of the user entity**/
    private String lastName;

    /**this annotation shows it is mapped to the dateOfBirth column**/
    @Column(name="date of birth")
    /**dateOfBirth property represents the dateOfBirth column of the user entity**/
    private String dateOfBirth;

    /**annotation to express the relationship between libraryCard and user**/
    @OneToOne
    /**annotation to express the column in which the tables will be joined**/
    @JoinColumn(name="libraryCardId")
    /**libraryCard object represents the libraryCard entity**/
    private LibraryCard libraryCard;


    /**annotation to express the relationship between book and user**/
    @OneToMany(mappedBy = "user")
    /**annotation to avoid infinite recursion**/
    @JsonManagedReference
    /**list object to show the list of books for the user**/
    private List<Book> book;

    /**default constructor for User class**/
    public User() {
    }

    /**constructor for User class**/
    public User(Integer id, String firstName, String lastName, String dateOfBirth, LibraryCard libraryCard) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.libraryCard = libraryCard;
        }

    /**getter for the id of the User class**/
    public Integer getId() {
        return id;
    }

    /**setter for the id of the User class**/
    public void setId(Integer id) {
        this.id = id;
    }

    /**getter for the firstName property of the User class**/
    public String getFirstName() {
        return firstName;
    }

    /**setter for the firstName property of the User class**/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**getter for the lastName property of the User class**/
    public String getLastName() {
        return lastName;
    }

    /**setter for the lastName property of the User class**/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**getter for the dateOfBirth property of the User class**/
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**setter for the dateOfBirth property of the User class**/
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**getter for the libraryCard property of the User class**/
    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    /**setter for the libraryCard property of the User class**/
    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }
}
