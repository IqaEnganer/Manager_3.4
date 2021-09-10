package ru.netology.manager;

import ru.netology.FilmRepozitory.AfishaRepository;
import ru.netology.domain.Film;


public class AfishaManager {
    private int numberDisplayedFilms = 10;

    public AfishaManager(int numberDisplayedFilms) {
        this.numberDisplayedFilms = numberDisplayedFilms;
    }

    public AfishaManager() {
    }

    public int getNumberDisplayedFilms() {
        return numberDisplayedFilms;
    }

    AfishaRepository repository;


    public void save(Film film) {
        repository.save(film);
    }

    public void findAll() {
        repository.findAll();
    }

    public void findAllReverse() {
        repository.findAllReverse();
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void removeAll() {
        repository.removeAll();
    }

    public void findId(int id){
        repository.findById(id);
    }


    //Возрващает фиксированное количество фильмов
    public Film[] findAllFixReverse() {
        Film[] films = repository.findAll();
        int resultLength;
        if (films.length < numberDisplayedFilms) {
            resultLength = films.length;
        } else {
            resultLength = numberDisplayedFilms;
        }
        Film[] tmp = new Film[resultLength];
        for (int i = films.length - resultLength; i < films.length; i++) {
            int index = films.length - i + (films.length - resultLength - 1);
            tmp[i - (films.length - resultLength)] = films[index];
        }
        return tmp;
    }


}
