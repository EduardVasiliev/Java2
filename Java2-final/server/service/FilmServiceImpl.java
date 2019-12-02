package service;

import dao.DifuzareDao;
import dao.FilmDao;
import dao.SpectatorDao;
import entities.Difuzare;
import entities.Film;
import entities.Spectator;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import rmi.FilmService;

public class FilmServiceImpl extends UnicastRemoteObject implements FilmService {
    
    private EntityManagerFactory emf;
    
    public FilmServiceImpl() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("Proiect-serverPU");
    }
    
    @Override
    public void adaugaFilm(Film f) {
        EntityManager em = emf.createEntityManager();
        FilmDao filmDao = new FilmDao(em);
        try {
            em.getTransaction().begin();
            filmDao.adaugaFilm(f);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    @Override
    public List<Film> afiseazaFilme() {
        EntityManager em = emf.createEntityManager();
        FilmDao filmDao = new FilmDao(em);
        return filmDao.afiseazaFilme();
    }
    
    @Override
    public void stergeFilm(int id) {
        EntityManager em = emf.createEntityManager();
        FilmDao filmDao = new FilmDao(em);
        try {
            em.getTransaction().begin();
            filmDao.stergeFilm(id);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    @Override
    public void adaugaDifuzare(Difuzare d) {
        EntityManager em = emf.createEntityManager();
        DifuzareDao difuzareDao = new DifuzareDao(em);
        try {
            em.getTransaction().begin();
            difuzareDao.adaugaDifuzare(d);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    @Override
    public List<Difuzare> afiseazaDifuzare() {
        EntityManager em = emf.createEntityManager();
        DifuzareDao difuzareDao = new DifuzareDao(em);
        return difuzareDao.afiseazaDifuzare();
    }
    
    @Override
    public void stergeDifuzare(int id) {
        EntityManager em = emf.createEntityManager();
        DifuzareDao difuzareDao = new DifuzareDao(em);
        try {
            em.getTransaction().begin();
            difuzareDao.stergeDifuzare(id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void vindeBilet(Spectator s) {
        EntityManager em = emf.createEntityManager();
        SpectatorDao spectatorDao = new SpectatorDao(em);
        try {
            em.getTransaction().begin();
            spectatorDao.vindeBilet(s);
            em.getTransaction().commit();     
        } finally {
            em.close();
        }
    }
    
    @Override
    public List<Spectator> afiseazaBilete() {
        EntityManager em = emf.createEntityManager();
        SpectatorDao spectatorDao = new SpectatorDao(em);
        return spectatorDao.afiseazaBilete();
    }
}
