package ru.netology.manager;

import ru.netology.domain.FIlm;


public class FilmManager {
    private FIlm[] films = new FIlm[0];



    private int numberDisplayedFilms = 10;

    public FilmManager(int numberDisplayedFilms) {
        this.numberDisplayedFilms = numberDisplayedFilms;
    }

    public FilmManager() {
    }
    public int getNumberDisplayedFilms() {
        return numberDisplayedFilms;
    }

    // добавление фильма
    public void add(FIlm film) {
        FIlm[] tmp = new FIlm[films.length + 1];
//        for (int i = 0; i < films.length; i++) {
//            tmp[i] = films[i];
//        }
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    // Удаление фильма

//    public void removeFilm(FIlm Film) {
//        FIlm[] tmp = new FIlm[films.length - 1];
//        int index = 0;
//        for (FIlm fIlm : films) {
//            if (!fIlm.equals(Film)) {
//                tmp[index] = fIlm;
//                index++;
//            }
//        }
//        films = tmp;
//    }

    public void removeFilm(int id) {
        int length = films.length - 1;
        FIlm[] tmp = new FIlm[length];
        int index = 0;
        for (FIlm film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }

//   Показать все фильмы
//  public FIlm[] getAllFilms() {
//      FIlm[] tmp = new FIlm[films.length];
//      for (int i = 0; i < films.length; i++) {
//          tmp[i] = films[i];
//      }
//      return tmp;
//  }

    //Показать все фильмы в обратном порядке
    public FIlm[] getAllFilmsReverseOrder() {
        FIlm[] tmp = new FIlm[films.length];
        for (int i = 0; i < films.length; i++) {
            int index = films.length - i - 1;
            tmp[i] = films[index];
        }
        return tmp;
    }

    // Показать последние фильмы в обратном порядке
    public FIlm[] recentFilms() {
        int resultLength;
        if (films.length < numberDisplayedFilms) {
            resultLength = films.length;
        } else {
            resultLength = numberDisplayedFilms;
        }
        FIlm[] tmp = new FIlm[resultLength];
        for (int i = films.length - resultLength; i < films.length;i++) {
            int index = films.length - i + (films.length - resultLength -1);
            tmp[i-(films.length-resultLength)] = films[index];
        }
        return tmp;
    }
    // Удаление всех фильмов
    public void removeAllFilm(){
        FIlm[] film = new FIlm[0];
        films = film;
    }
}
