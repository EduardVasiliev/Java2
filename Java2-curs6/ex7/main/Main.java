package main;

import entity.Film;
import entity.Regizor;
import enums.tipFilm;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import service.MainSerivice;

public class Main {
    public static void main(String[] args) {
        MainSerivice service = MainSerivice.getInstance();
        
        Regizor tarantino = new Regizor("Tanantin", "Quentin");
        Regizor nolan = new Regizor("Nolan", "Christopher");
        
        Film interstellar = new Film("Interstellar", tipFilm.SF, Date.valueOf(LocalDate.of(2014, Month.NOVEMBER, 7)), nolan);
        Film django = new Film("Django", tipFilm.ADVENTURE, Date.valueOf(LocalDate.of(2012, Month.DECEMBER, 25)), tarantino);
        Film memento = new Film("Memento", tipFilm.THRILLER, Date.valueOf(LocalDate.of(2001, Month.MAY, 25)), nolan);
        
        List<Film> filmeNolan = new ArrayList<>();
        filmeNolan.add(interstellar);
        filmeNolan.add(memento);
        
        nolan.setFilme(filmeNolan);
        
        List<Film> filmeTarantino = new ArrayList<>();
        filmeTarantino.add(django);
        
        tarantino.setFilme(filmeTarantino);
        
        service.adaugaRegizor(nolan);
        service.adaugaRegizor(tarantino);
        
        service.getDirectors().forEach(System.out::println);
        service.getFilme().forEach((Object[] filme) -> System.out.println(filme[2] + " " + filme[3]));
        
        System.out.println("Film id 1: " + service.getFilmById(1));
        System.out.println("Film id 2: " + service.getFilmById(2));

    }
}