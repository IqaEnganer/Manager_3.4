package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIlmTest {
    @Test
    public void testFilm(){
        Film film = new Film(1,120,"Digital","12","url",true);
        assertEquals(1,film.getId());
        assertEquals(120,film.getDurationFilm());
        assertEquals("Digital",film.getProductName());
        assertEquals("url",film.getImgUrl());
        assertEquals(true, film.isPremiereTomorrow());
        assertEquals("12",film.getGenre());
    }
    @Test
    public void testFilmNoArgs(){
        Film film = new Film();
        assertEquals(0, film.getId());
        film.setId(20);
        film.setDurationFilm(150);
        film.setGenre("fix");
        film.setImgUrl("url");
        film.setPremiereTomorrow(false);
        assertEquals(20,film.getId());
        assertEquals(150,film.getDurationFilm());
        assertEquals("fix",film.getGenre());
        assertEquals("url",film.getImgUrl());
        assertEquals(false, film.isPremiereTomorrow());
        film.setProductName("Name");
        assertEquals("Name",film.getProductName());
    }

}