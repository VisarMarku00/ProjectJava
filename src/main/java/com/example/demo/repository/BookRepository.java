package com.example.demo.repository;


import com.example.demo.pojo.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
/**the repository for the Book table**/
public interface BookRepository extends CrudRepository<Book, Integer> {

    /**this function finds all the books in the table by id**/
    List<Book> findAll();
    /**this function finds a book that has the id that was entered**/
    Book findBookById(Integer id);


    /**this annotation allows us to use SQL queries to search for the books by author**/
    @Query( "SELECT  b FROM Book b where b.author= :author")
    /**this function is used to find books in the table by author**/
    List<Book> findBookByAuthor(@Param("author") String author);

    /**this annotation allows us to use SQL queries to search for the books by genre**/
    @Query("SELECT b from Book b where b.genre= :genre")
    /**this function is used to find books in the table by genre**/
    List<Book> findBookByGenre(@Param("genre") String genre);

    /**this annotation allows us to use SQL queries to search for the books by year**/
    @Query("SELECT b from Book b where b.year= :year")
    /**this function is used to find books in the table by year**/
    List<Book> findBookByYear(@Param("year")Date year);
}
