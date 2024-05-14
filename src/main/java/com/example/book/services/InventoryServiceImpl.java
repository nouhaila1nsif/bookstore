package com.example.book.services;
/*import com.example.book.entities.Book;
import com.example.book.repositories.BookRepository;
import com.example.book.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooksInInventory() {
        // Find all books with quantity > 0 (assuming 0 means out of stock)
        return bookRepository.findByQuantityGreaterThan(0);
    }

    @Override
    public void addBookToInventory(Book book) {
        // Save the book with the provided quantity
        bookRepository.save(book);
    }


}*/