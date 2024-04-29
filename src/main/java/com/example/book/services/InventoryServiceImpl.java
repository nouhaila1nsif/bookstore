package com.example.book.services;
import com.example.book.entities.Book;
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

    @Override
    public void removeBookFromInventory(Long bookId) {
        // Implement logic to remove book or set quantity to 0
        Book book = bookRepository.findById(bookId).orElse(null);
        if (book != null) {
            // Option 1: Delete the book (if no stock needed)
            // bookRepository.deleteById(bookId);

            // Option 2: Set quantity to 0 (if keeping record is needed)
            book.setQuantity(0);
            bookRepository.save(book);
        }
    }

    @Override
    public void updateBookQuantity(Long bookId, int quantity) {
        // Retrieve the book and update its quantity
        Book book = bookRepository.findById(bookId).orElse(null);
        if (book != null) {
            book.setQuantity(quantity);
            bookRepository.save(book);
        }
    }
}