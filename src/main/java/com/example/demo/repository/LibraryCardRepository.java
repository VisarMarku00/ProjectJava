package com.example.demo.repository;

import com.example.demo.pojo.entity.LibraryCard;
import com.example.demo.pojo.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
/**the repository for the LibraryCard table**/
public interface LibraryCardRepository extends CrudRepository<LibraryCard, Integer> {

    /**this function finds all the libraryCards in the table**/
    List<LibraryCard> findAll();
    /**this function finds a LibraryCard that has the id that was entered**/
    LibraryCard findCardById(Integer id);

    /*
    @Query(
            "SELECT u FROM User u " +
                    "JOIN FETCH LibraryCard lc ON u.libraryCard.id = lc.id " +
                    "WHERE u.firstName = :firstName " +
                    "AND u.lastName= :lastName"
    )
    List<User> findLibraryCardByFirsNameAndLastName(@Param("first name") String firstName,
                                                    @Param ("last name") String lastName);*/
}
