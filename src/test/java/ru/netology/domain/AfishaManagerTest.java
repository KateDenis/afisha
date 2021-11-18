package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();


    @Test
    void shouldAddFilm() {
        FilmItem first = new FilmItem(1, "a", "comedy");
        FilmItem second = new FilmItem(2, "d", "comedy");
        manager.addFilm(first);
        manager.addFilm(second);
        FilmItem[] expected = new FilmItem[2];
        expected[0] = first;
        expected[1] = second;
        FilmItem[] actual = manager.getItems();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetLastFilmsOverMaxLength() {
        FilmItem film1 = new FilmItem(1, "a", "comedy");
        FilmItem film2 = new FilmItem(2, "b", "comedy");
        FilmItem film3 = new FilmItem(3, "c", "comedy");
        FilmItem film4 = new FilmItem(4, "d", "comedy");
        FilmItem film5 = new FilmItem(5, "e", "comedy");
        FilmItem film6 = new FilmItem(6, "f", "comedy");
        FilmItem film7 = new FilmItem(7, "j", "comedy");
        FilmItem film8 = new FilmItem(8, "h", "comedy");
        FilmItem film9 = new FilmItem(9, "k", "comedy");
        FilmItem film10 = new FilmItem(10, "l", "comedy");
        FilmItem film11 = new FilmItem(11, "l", "comedy");
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        FilmItem[] expected = {
                film11,
                film10,
                film9,
                film8,
                film7,
                film6,
                film5,
                film4,
                film3,
                film2
        };
        FilmItem[] actual = manager.getLastFilms();
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldGetLastFilmsEmpty() {
        FilmItem[] expected = new FilmItem[0];
        FilmItem[] actual = manager.getLastFilms();
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldGetLastFilmsMaxLength() {
        FilmItem film1 = new FilmItem(1, "a", "comedy");
        FilmItem film2 = new FilmItem(2, "b", "comedy");
        FilmItem film3 = new FilmItem(3, "c", "comedy");
        FilmItem film4 = new FilmItem(4, "d", "comedy");
        FilmItem film5 = new FilmItem(5, "e", "comedy");
        FilmItem film6 = new FilmItem(6, "f", "comedy");
        FilmItem film7 = new FilmItem(7, "j", "comedy");
        FilmItem film8 = new FilmItem(8, "h", "comedy");
        FilmItem film9 = new FilmItem(9, "k", "comedy");
        FilmItem film10 = new FilmItem(10, "l", "comedy");
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        FilmItem[] expected = {
                film10,
                film9,
                film8,
                film7,
                film6,
                film5,
                film4,
                film3,
                film2,
                film1
        };
        FilmItem[] actual = manager.getLastFilms();
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldGetLastFilms() {
        FilmItem film1 = new FilmItem(1,"a","comedy");
        FilmItem film2 = new FilmItem(2,"a","comedy");
        FilmItem film3 = new FilmItem(3,"a","comedy");
        FilmItem film4 = new FilmItem(4,"a","comedy");
        FilmItem film5 = new FilmItem(5,"a","comedy");
        FilmItem film6 = new FilmItem(6,"a","comedy");
        FilmItem film7 = new FilmItem(7,"a","comedy");
        FilmItem film8 = new FilmItem(8,"a","comedy");
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        FilmItem[] expected = {
                film8,
                film7,
                film6,
                film5,
                film4,
                film3,
                film2,
                film1
        };
        FilmItem[] actual = manager.getLastFilms();
        assertArrayEquals(expected,actual);
    }
}