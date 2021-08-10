package com.example.demo.Service;

import com.example.demo.Entity.Book;
import javassist.NotFoundException;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    Book findBookById(int id);
    void addBook(Book book);
    void deleteBookById(int id);
}
