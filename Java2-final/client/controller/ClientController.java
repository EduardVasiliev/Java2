package controller;

import entities.Difuzare;
import entities.Film;
import entities.Spectator;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collections;
import java.util.List;
import rmi.FilmService;

public class ClientController {
    
    private FilmService filmService;
    
    private ClientController() {
        try {
            Registry reg = LocateRegistry.getRegistry(1234);
            filmService = (FilmService) reg.lookup("filmService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ClientController instance = new ClientController();
    }
    
    public static ClientController getInstance() {
        return SingletonHolder.instance;
    }
    
    public void adaugaFilm(Film f) {
        try {
            filmService.adaugaFilm(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Film> afiseazaFilme() {
        try {
            return filmService.afiseazaFilme();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
    
    public void stergeFilm(int id) {
        try {
            filmService.stergeFilm(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void adaugaDifuzare(Difuzare d) {
        try {
            filmService.adaugaDifuzare(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Difuzare> afiseazaDifuzare() {
        try {
            return filmService.afiseazaDifuzare();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
    
    public void stergeDifuzare(int id) {
        try {
            filmService.stergeDifuzare(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void vindeBilet(Spectator s) {
        try {
            filmService.vindeBilet(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Spectator> afiseazaBilete() {
        try {
            return filmService.afiseazaBilete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}
