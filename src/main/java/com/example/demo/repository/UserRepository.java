package com.example.demo.repository;

import com.example.demo.pojo.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
/**the repository for User table**/

public interface UserRepository extends CrudRepository<User, Integer> {

    /**this function finds all the users in the table by id**/
    List<User> findAll();
    /**this function finds a user that has the id that was entered**/
    User findUserById(Integer id);

    /**this annotation allows us to use SQL queries to search for the users by firstName and lastName**/
    @Query("SELECT u from User u where u.firstName= :firstName and u.lastName= :lastName")
    /**this function is used to find users in the table by firstName and lastName**/
    List<User> findUserByFirstNameAndLastName(@Param("firstName") String firstName,
                                              @Param("lastName") String lastName);

}
