package com.example.demo.controller;

import com.example.demo.pojo.entity.Book;
import com.example.demo.pojo.input.BookInput;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class BookController {

    /** the service for this controller**/
    @Autowired
    private BookService bookService;

    /** get request to find every book**/
    @GetMapping("/book")
    public List<Book> getAllBooks(){
        return bookService.findAll();
    }

    /** get request to find a book by id**/
    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Integer id){
        return bookService.findBookById(id);
    }

    /** post request to input a book in the database**/
    @PostMapping("/book")
    public Book insertNewBook(@RequestBody BookInput bookInput){
        return bookService.save(bookInput);
    }

    /** put request to update a book in the database**/
    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable Integer id,
                           @RequestBody BookInput bookInput){
        return bookService.update(id, bookInput);
    }

    /**delete request to delete a book from database**/
    @DeleteMapping("/book/{id}")
    public boolean deleteBook(@PathVariable Integer id){
        bookService.delete(id);
        return true;
    }

    /**get request to find a book by the author**/
    @GetMapping("/book/{author}")
    public List<Book> findBookByAuthor(@RequestParam(defaultValue="Pick an Author") String author){
        return bookService.findBookByAuthor(author);
    }

    /**get request to find a book by the genre**/
    @GetMapping("/book/{Genre}")
    public List<Book> findBookByGenre(@RequestParam(defaultValue = "Pick a Genre") String genre){
        return bookService.findBookByGenre(genre);
    }

    /**get request to find a book by the year**/
    @GetMapping("/book/{Year}")
    public List<Book> findBookByYear(@PathVariable Date year){
        return bookService.findBookByYear((java.sql.Date) year);
    }

}
