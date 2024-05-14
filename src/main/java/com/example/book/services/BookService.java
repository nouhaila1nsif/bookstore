package com.example.book.services;

import com.example.book.entities.Book;
import org.springframework.stereotype.Service;
import com.example.book.entities.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();
    Optional<Book> getBookById(Long id);
    Book createBook(Book book);
    Optional<Book> updateBook(Long id, Book updatedBook);
    void deleteBook(Long id);
}

