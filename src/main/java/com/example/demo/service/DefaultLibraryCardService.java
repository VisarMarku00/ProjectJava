package com.example.demo.service;

import com.example.demo.pojo.entity.LibraryCard;
import com.example.demo.pojo.entity.User;
import com.example.demo.pojo.input.LibraryCardInput;
import com.example.demo.repository.LibraryCardRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;
@Service
/**in this class we do the implementation of the methods from the LibraryCardService interface**/
public class DefaultLibraryCardService implements LibraryCardService{

    @Autowired
    /**this class contains the methods to find the LibraryCard by different criteria**/
    private LibraryCardRepository libraryCardRepository;

    @Override
    /**this function finds all the libraryCards in the table**/
    public List<LibraryCard> findAll() {
        return libraryCardRepository.findAll();
    }

    @Override
    /**this function finds a LibraryCard that has the id that was entered**/
    public LibraryCard findCardById(Integer id) {
        if (id == null) {
            return null;
        }
        return libraryCardRepository.findCardById(id);
    }

    @Override
    /**method to delete a libraryCard from the table**/
    public void delete(Integer id) {
        libraryCardRepository.deleteById(id);
    }

    @Override
    /**method to save a new libraryCard to the table**/
    public LibraryCard save(LibraryCardInput libraryCardInput) {
        String dateRegistered= libraryCardInput.getDateRegistered();
        String expiryDate= libraryCardInput.getExpiryDate();

        LibraryCard libraryCard= new LibraryCard();

        libraryCard.setDateRegistered(dateRegistered);
        libraryCard.setExpiryDate(expiryDate);
        return libraryCardRepository.save(libraryCard);
    }

  /*  @Override
    public List<User> findCardByFirstNameAndLastName(String firstName, String lastName) {
        return userRepository.findUserByFirstNameAndLastName(firstName, lastName);
    }
*/
}
