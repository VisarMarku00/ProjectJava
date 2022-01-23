package com.example.demo.service;

import com.example.demo.pojo.entity.Book;
import com.example.demo.pojo.input.BookInput;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@Service
/**in this class we do the implementation of the methods from the BookService interface**/
public class DefaultBookService implements BookService {

    /**this annotation allows the injection of other classes in this class**/
    @Autowired
    /**this class contains the methods to find the Books by different criteria**/
    private BookRepository bookRepository;

    /** this annotation denotes that the child class method overrides the base class method**/
    @Override
    /**method to find all the books in the table**/
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    /**method to find a book by id**/
    public Book findBookById(Integer id) {
        if (id == null) {
            return null;
        }
        return bookRepository.findBookById(id);
    }

    @Override
    /**method to save a new book to the table**/
    public Book save(BookInput bookInput) {
        String title=bookInput.getTitle();
        String author=bookInput.getAuthor();
        String genre=bookInput.getGenre();
        String year= bookInput.getYear();

        Book book=new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setGenre(genre);
        book.setYear(year);
        return bookRepository.save(book);
    }

    @Override
    /**method to update a book in the table**/
    public Book update(Integer id, BookInput bookInput) {
        Book book=bookRepository.findBookById(id);
        if(book==null){
            return null;
        }
        String updatedTitle= bookInput.getTitle();
        String updatedAuthor=bookInput.getAuthor();
        String updatedGenre=bookInput.getGenre();
        String updatedYear = bookInput.getYear();

        book.setTitle(updatedTitle);
        book.setGenre(updatedGenre);
        book.setAuthor(updatedAuthor);
        book.setYear(updatedYear);

        return bookRepository.save(book);
    }

    @Override
    /**method to delete a book from the table**/
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }

    @Override
    /**this function is used to find books in the table by author**/
    public List<Book> findBookByAuthor(String author) {
        return bookRepository.findBookByAuthor(author);
    }

    @Override
    /**this function is used to find books in the table by genre**/
    public List<Book> findBookByGenre(String genre) {
        return bookRepository.findBookByGenre(genre);
    }

    @Override
    /**this function is used to find books in the table by year**/
    public List<Book> findBookByYear(Date year) {
        return bookRepository.findBookByYear(year);
    }
}
