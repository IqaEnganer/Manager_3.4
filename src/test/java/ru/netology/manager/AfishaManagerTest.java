package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import ru.netology.FilmRepozitory.AfishaRepository;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;

    private Film n1 = new Film(1, 120, "Бладшот", "Боевик", "Здесь будет Url", false);
    private Film n2 = new Film(2, 180, "Вперед", "Мультфильм", "Здесь будет Url", false);
    private Film n3 = new Film(3, 90, "Отель белград", "Комедия", "Здесь будет Url", false);
    private Film n4 = new Film(4, 160, "Джентельмены", "Боевик", "Здесь будет Url", false);
    private Film n5 = new Film(5, 98, "Человек невидимка", "Ужасы", "Здесь будет Url", false);
    private Film n6 = new Film(6, 69, "Троли-Мировой тур", "Мультфильм", "Здесь будет Url", false);
    private Film n7 = new Film(7, 70, "Номер один", "Комедия", "Здесь будет Url", false);
    private Film n8 = new Film(8, 120, "Тетрадь смерти", "Детектив", "Здесь будет Url", false);
    private Film n9 = new Film(9, 236, "Дороро", "Драма", "Здесь будет Url", false);
    private Film n10 = new Film(10, 127, "Город в котором меня нет", "Драма", "Здесь будет Url", false);
    private Film n11 = new Film(11, 122, "Берсерк", "Драма", "Здесь будет Url", false);

    @Test
    public void showAllFilms() {
        Film[] returned = new Film[]{n1, n2, n3};
        Mockito.doReturn(returned).when(repository).findAll();

        assertArrayEquals(new Film[]{n3, n2, n1}, manager.findAllFixReverse());

        Mockito.verify(repository).findAll();
    }

    @Test
    public void showFixFilms() {
        Film[] returned = new Film[]{n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11};
        Mockito.doReturn(returned).when(repository).findAll();

        assertArrayEquals(new Film[]{n11, n10, n9, n8, n7, n6, n5, n4, n3, n2}, manager.findAllFixReverse());

        Mockito.verify(repository).findAll();
    }

    @Test
    public void showEmptyFilm() {
        Film[] returned = new Film[0];
        Mockito.doReturn(returned).when(repository).findAll();

        assertArrayEquals(new Film[0], manager.findAllFixReverse());
    }
    @Test
    public void getNumberFilms(){
        AfishaManager manager = new AfishaManager(8);
        assertEquals(8,manager.getNumberDisplayedFilms());
    }

}