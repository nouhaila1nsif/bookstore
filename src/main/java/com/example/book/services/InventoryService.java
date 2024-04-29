package com.example.book.services;

import com.example.book.entities.Book;

import java.util.List;

public interface InventoryService {
    List<Book> getAllBooksInInventory();
    void addBookToInventory(Book book);
    void removeBookFromInventory(Long bookId);
    void updateBookQuantity(Long bookId, int quantity);
}
