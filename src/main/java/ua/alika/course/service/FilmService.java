package ua.alika.course.service;

import ua.alika.course.model.Film;

import java.util.List;

public interface FilmService {
    List<Film> allFilms();
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
}
