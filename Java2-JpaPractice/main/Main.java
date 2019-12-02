
package main;

import entities.Film;
import entities.Genre;
import entities.Serial;
import entities.StudioInfo;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import service.MainService;

public class Main {
    public static void main(String[] args) {
        MainService ms = new MainService();
        
        StudioInfo studio1 = new StudioInfo("Paramount", "USA");
        StudioInfo studio2 = new StudioInfo("Lionsgate", "USA");
        
        Film film = new Film();
        film.setNume("Hunger Games");
        film.setDate(Date.valueOf(LocalDate.of(2014, Month.MARCH, 20)));
        film.setGenre(Genre.DRAMA);
        film.setStudio(studio2);
        
        Serial serial = new Serial();
        serial.setNume("Peaky Blinders");
        serial.setDate(Date.valueOf(LocalDate.of(2015, Month.AUGUST, 8)));
        serial.setGenre(Genre.ACTION);
        serial.setStudio(studio1);
        
        ms.addFilm(film);
        ms.addSerial(serial);
        
        
    }

}
