package rmi;

import entities.Difuzare;
import entities.Film;
import entities.Spectator;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface FilmService extends Remote {
    
    public void adaugaFilm(Film f) throws RemoteException;
    
    public List<Film> afiseazaFilme() throws RemoteException;
    
    public void stergeFilm(int id) throws RemoteException;
    
    public void adaugaDifuzare(Difuzare d) throws RemoteException;
    
    public List<Difuzare> afiseazaDifuzare() throws RemoteException; //BONUS
    
    public void stergeDifuzare(int id) throws RemoteException; //BONUS
    
    public void vindeBilet(Spectator s) throws RemoteException;
    
    public List<Spectator> afiseazaBilete() throws RemoteException; //BONUS
    
}
