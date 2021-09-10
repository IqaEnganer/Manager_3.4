package ru.netology.FilmRepozitory;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {
    Film n1 = new Film(1, 120, "Бладшот", "Боевик", "Здесь будет Url", false);
    Film n2 = new Film(2, 180, "Вперед", "Мультфильм", "Здесь будет Url", false);
    Film n3 = new Film(3, 90, "Отель белград", "Комедия", "Здесь будет Url", false);
    Film n4 = new Film(4, 160, "Джентельмены", "Боевик", "Здесь будет Url", false);
    Film n5 = new Film(5, 98, "Человек невидимка", "Ужасы", "Здесь будет Url", false);
    Film n6 = new Film(6, 69, "Троли-Мировой тур", "Мультфильм", "Здесь будет Url", false);
    Film n7 = new Film(7, 70, "Номер один", "Комедия", "Здесь будет Url", false);
    Film n8 = new Film(8, 120, "Тетрадь смерти", "Детектив", "Здесь будет Url", false);
    Film n9 = new Film(9, 236, "Дороро", "Драма", "Здесь будет Url", false);
    Film n10 = new Film(10, 127, "Город в котором меня нет", "Драма", "Здесь будет Url", false);
    Film n11 = new Film(11, 122, "Берсерк", "Драма", "Здесь будет Url", false);
    AfishaRepository repository = new AfishaRepository();

    @Test
    public void showAddFilmAndRemove() {
        repository.save(n1);
        repository.removeById(1);
        repository.save(n2);
        Film[] expected = new Film[]{n2};
        Film[] actual = repository.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void showAllFilm() {
        repository.save(n1);
        repository.save(n2);
        repository.save(n3);
        repository.save(n4);
        repository.save(n5);
        repository.save(n6);
        repository.save(n7);
        repository.save(n8);
        repository.save(n9);
        repository.save(n10);
        repository.save(n11);
        assertArrayEquals(new Film[]{n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11}, repository.findAll());
        assertArrayEquals(new Film[]{n11, n10, n9, n8, n7, n6, n5, n4, n3, n2, n1}, repository.findAllReverse());


    }

    @Test
    public void showTestId() {
        repository.save(n1);
        repository.save(n2);
        assertArrayEquals(new Film[]{n1}, repository.findById(1));

    }

    @Test
    public void removeAll() {
        repository.save(n1);
        repository.save(n2);
        repository.save(n3);
        repository.save(n4);
        repository.save(n5);
        repository.save(n6);
        repository.save(n7);
        repository.save(n8);
        repository.save(n9);
        repository.save(n10);
        repository.save(n11);
        repository.removeAll();
        assertArrayEquals(new Film[0], repository.findAll());

    }

    @Test
    public void removeById() {
        repository.save(n1);
        repository.save(n2);
        repository.removeById(2);
        assertArrayEquals(new Film[]{n1}, repository.findAll());


    }
}