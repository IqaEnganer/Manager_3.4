package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FIlm;

import static org.junit.jupiter.api.Assertions.*;

public class filmTestManager {
    FilmManager manager = new FilmManager(5);
    FIlm n1 = new FIlm(1, 120, "Бладшот", "Боевик", "Здесь будет Url", false);
    FIlm n2 = new FIlm(2, 180, "Вперед", "Мультфильм", "Здесь будет Url", false);
    FIlm n3 = new FIlm(3, 90, "Отель белград", "Комедия", "Здесь будет Url", false);
    FIlm n4 = new FIlm(4, 160, "Джентельмены", "Боевик", "Здесь будет Url", false);
    FIlm n5 = new FIlm(5, 98, "Человек невидимка", "Ужасы", "Здесь будет Url", false);
    FIlm n6 = new FIlm(6, 69, "Троли-Мировой тур", "Мультфильм", "Здесь будет Url", false);
    FIlm n7 = new FIlm(7, 70, "Номер один", "Комедия", "Здесь будет Url", false);
    FIlm n8 = new FIlm(8, 120, "Тетрадь смерти", "Детектив", "Здесь будет Url", false);
    FIlm n9 = new FIlm(9, 236, "Дороро", "Драма", "Здесь будет Url", false);
    FIlm n10 = new FIlm(10, 127, "Город в котором меня нет", "Драма", "Здесь будет Url", false);
    FIlm n11 = new FIlm(11, 122, "Берсерк", "Драма", "Здесь будет Url", false);

    @Test
    public void shouldRemoveIfExists() {
        manager.add(n1);
        FIlm[] expected = new FIlm[]{n1};
        FIlm[] actual = manager.getAllFilmsReverseOrder();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void removeFilm() {
        manager.add(n1);
        manager.add(n2);
        manager.add(n3);
        manager.removeFilm(1);
        assertArrayEquals(new FIlm[]{n3, n2}, manager.getAllFilmsReverseOrder());
    }

    @Test
    public void numberFilms() {
        FilmManager manager = new FilmManager(5);
        assertEquals(5, manager.getNumberDisplayedFilms());
    }

    @Test
    public void showRecentFilms() {
        FilmManager manager = new FilmManager();
        manager.add(n1);
        manager.add(n2);
        manager.add(n3);
        manager.add(n4);
        manager.add(n5);
        manager.add(n6);
        manager.add(n7);
        manager.add(n8);
        manager.add(n9);
        manager.add(n10);
        manager.add(n11);
        assertArrayEquals(new FIlm[]{n11, n10, n9, n8, n7, n6, n5, n4, n3, n2}, manager.recentFilms());
    }

    @Test
    public void showReverse() {
        FilmManager manager = new FilmManager();
        manager.add(n1);
        manager.add(n2);
        manager.add(n3);
        manager.add(n4);
        manager.add(n5);
        manager.add(n6);
        manager.add(n7);
        manager.add(n8);
        manager.add(n9);
        manager.add(n10);
        assertArrayEquals(new FIlm[]{n10, n9, n8, n7, n6, n5, n4, n3, n2, n1}, manager.getAllFilmsReverseOrder());
    }

    @Test
    public void recentFilm() {
        manager.add(n1);
        manager.add(n2);
        manager.add(n3);
        manager.add(n4);
        manager.add(n5);
        manager.add(n6);
        manager.add(n7);
        manager.add(n8);
        manager.add(n9);
        manager.add(n10);
        manager.add(n11);
        manager.removeFilm(7);
        manager.removeFilm(10);
        assertArrayEquals(new FIlm[]{n11, n9, n8, n6, n5}, manager.recentFilms());
    }

    @Test
    public void addFilm() {
        FilmManager film = new FilmManager();
        manager.add(n6);
        manager.add(n7);
        assertArrayEquals(new FIlm[]{n7,n6},manager.recentFilms());
    }
    @Test
    public void allRemove(){
        manager.add(n1);
        manager.add(n2);
        manager.removeAllFilm();
        assertArrayEquals(new FIlm[0],manager.recentFilms());
    }
}