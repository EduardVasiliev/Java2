package service;

import dao.FilmDao;
import dao.RegizorDao;
import entity.Film;
import entity.Regizor;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainSerivice {
    private EntityManagerFactory emf;
    
    public MainSerivice() {
        emf = Persistence.createEntityManagerFactory("Curs6.ex7PU");
    }
    
    private final static class SingltonHolder {
        private final static MainSerivice instance = new MainSerivice();
    }
    
    public static MainSerivice getInstance() {
        return SingltonHolder.instance;
    }
    
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
    
    public void adaugaRegizor(Regizor r) {
        EntityManager em = emf.createEntityManager();
        RegizorDao regizorDao = new RegizorDao(em);
        
        try {
            em.getTransaction().begin();
            regizorDao.adaugaRegizor(r);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public List<Regizor> getDirectors() {
        EntityManager em = emf.createEntityManager();
        RegizorDao regizorDao = new RegizorDao(em);
        return regizorDao.getDirectors();
    }
    
    public List<Object[]> getFilme() {
        EntityManager em = emf.createEntityManager();
        FilmDao filmDao = new FilmDao(em);
        return filmDao.getFilme();
    }
    
    public Film getFilmById(long id_film) {
        EntityManager em = emf.createEntityManager();
        FilmDao filmDao = new FilmDao(em);
        return filmDao.getFilmById(id_film).orElseThrow(() -> new UnsupportedOperationException());
    }

}