package com.example.book.controllers;
import com.example.book.repositories.BookRepository;

import com.example.book.entities.Book;
import com.example.book.services.BookService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    private final BookService bookService;
    @GetMapping("/home")
    public String home() {
        return "Home";
    }




    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/booksByGenre")
    public String showAddedGenre(ModelMap model) {
        List<Book> books = bookService.getAllBooks(); // Get recently added books
        model.addAttribute("books", books);
        return "booksByGenre";
    }

    @GetMapping("/browse")
    public String browseBooks(ModelMap model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "addedBooks"; // Retourne le nom de la vue à afficher (browse.jsp, browse.html, etc.)
    }
    @GetMapping("/create")
    public String showCreateBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "createBook"; // Retourne le nom de la vue pour le formulaire de création de livre
    }
    @GetMapping("/showBookDetails")
    public String showBookDetails(@RequestParam("id") Long id, ModelMap model) {
        Book book = bookRepository.findById(id).orElse(null);

        if (book == null) {
            // Gérer le cas où le livre n'est pas trouvé
            return "error"; // Ou une autre vue d'erreur appropriée
        }

        model.addAttribute("book", book);
        return "book1-details"; // Chemin relatif de la vue JSP sans extension
    }

    @PostMapping("/saveBook")
    public String saveBook(@Valid Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors() ) return "createBook";
        // Enregistrer le livre en utilisant le service BookService
        bookService.createBook(book);
        // Rediriger vers la page des livres ajoutés après l'ajout du livre
        return "redirect:/books/added";
    }

    @GetMapping("/added")
    public String showAddedBooks(ModelMap model) {
        List<Book> addedBooks = bookService.getAllBooks(); // Récupérer les livres récemment ajoutés
        model.addAttribute("addedBooks", addedBooks);
        return "addedBooks"; // Vue pour afficher les livres récemment ajoutés
    }
    @GetMapping("/edit")
    public String showEditBookForm(@RequestParam("id") Long id, Model model) {
        Book book = bookService.getBookById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid book ID: " + id));

        model.addAttribute("book", book);
        return "editBook"; // Nom de la vue pour le formulaire d'édition
    }

    @PostMapping("/update")
    public String updateBook(@ModelAttribute("book") Book updatedBook) {
        // Mettre à jour le livre en utilisant le service BookService
        bookService.updateBook(updatedBook.getId(), updatedBook);

        // Rediriger vers la page de détails du livre mis à jour
        return "redirect:/books/showBookDetails?id=" + updatedBook.getId();
    }
    @GetMapping("/delete")
    public String deleteBook(@RequestParam Long id) {
        bookService.deleteBook(id);
        return "redirect:/books/added";
    }




    // Autres méthodes de contrôleur pour gérer les opérations CRUD sur les livres...
}
