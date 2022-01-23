package com.example.demo.service;

import com.example.demo.pojo.entity.Book;
import com.example.demo.pojo.input.BookInput;

import java.sql.Date;
import java.util.List;
/**this is the interface with all the necessary functions for the DefaultBookService**/
public interface BookService {

    /**method to find all the books in the table**/
    List<Book> findAll();
    /**method to find a book by id**/
    Book findBookById(Integer id);
    /**method to save a new book to the table**/
    Book save(BookInput bookInput);
    /**method to update a book in the table**/
    Book update(Integer id, BookInput bookInput);
    /**method to delete a book from the table**/
    void delete(Integer id);

    /**method to find the book by author**/
    List<Book> findBookByAuthor(String author);
    /**method to find book by genre**/
    List<Book> findBookByGenre(String genre);
    /**method to find book by the year**/
    List<Book> findBookByYear(Date year);
}
