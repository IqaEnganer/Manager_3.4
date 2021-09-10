package ru.netology.FilmRepozitory;

import ru.netology.domain.Film;

public class AfishaRepository {

    private Film[] films = new Film[0];


    // добавление фильма
    public void save(Film film) {
        Film[] tmp = new Film[films.length + 1];
//        for (int i = 0; i < films.length; i++) {
//            tmp[i] = films[i];
//        }
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    // Показать все фильмы
    public Film[] findAll() {
        return films;
    }

    // Удаление фильма
    public void removeById(int id) {
        int length = films.length - 1;
        Film[] tmp = new Film[length];
        int index = 0;
        for (Film film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }

    // Удаление всех фильмов
    public void removeAll() {
        Film[] film = new Film[0];
        films = film;
    }

    //Показать все фильмы в обратном порядке
    public Film[] findAllReverse() {
        Film[] tmp = new Film[films.length];
        for (int i = 0; i < films.length; i++) {
            int index = films.length - i - 1;
            tmp[i] = films[index];
        }
        return tmp;
    }

    // Возврат обьекта по id
    public Film[] findById(int id) {
        Film[] result = new Film[1];
        int i = 0;
        for (Film film : films) {
            if (film.getId() == id) {
                result[i] = film;
                i++;
            }
        }
        return result;
    }


}
