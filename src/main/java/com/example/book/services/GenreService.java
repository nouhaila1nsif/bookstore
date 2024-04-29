package com.example.book.services;

import com.example.book.entities.Genre;

import java.util.List;

public interface GenreService {
    Genre createGenre(Genre genre);
    Genre getGenreById(Long id);
    List<Genre> getAllGenres();
    void deleteGenre(Long id);
}

