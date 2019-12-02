package service;

import dao.FilmDao;
import dao.SerialDao;
import entities.Film;
import entities.Serial;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainService {
    private final EntityManagerFactory emf;
    
    public MainService() {
        emf = Persistence.createEntityManagerFactory("JPA_PracticePU");
    }
    
    public void addFilm(Film f) {
        EntityManager em = emf.createEntityManager();
        FilmDao filmDao = new FilmDao(em);
        
        try {
            em.getTransaction().begin();
            filmDao.addFilm(f);
            em.getTransaction().commit();
        } finally {
            em.close();
        }    
    }
    
    public Film getFilm(int id) {
        EntityManager em = emf.createEntityManager();
        FilmDao filmDao = new FilmDao(em);
        
        try {
            em.getTransaction().begin();
            return filmDao.getFilm(id);
        } finally {
            em.close();
        }
    }
    
    public void removeFilm(int id) {
        EntityManager em = emf.createEntityManager();
        FilmDao filmDao = new FilmDao(em);
        
        try {
            em.getTransaction().begin();
            filmDao.removeFilm(id);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public void updateFilm(Film f) {
        EntityManager em = emf.createEntityManager();
        FilmDao filmDao = new FilmDao(em);
        
        try {
            em.getTransaction().begin();
            filmDao.updateFilm(f);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public void addSerial(Serial s) {
        EntityManager em = emf.createEntityManager();
        SerialDao serialDao = new SerialDao(em);
        
        try {
            em.getTransaction().begin();
            serialDao.addSerial(s);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public Serial getSerial(int id) {
        EntityManager em = emf.createEntityManager();
        SerialDao serialDao = new SerialDao(em);
        
        try {
            em.getTransaction().begin();
            return serialDao.getSerial(id);
        } finally {
            em.close();
        }
    }
    
    public void removeSerial(int id) {
        EntityManager em = emf.createEntityManager();
        SerialDao serialDao = new SerialDao(em);
        
        try {
            em.getTransaction().begin();
            serialDao.removeSerial(id);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public void updateSerial(Serial s) {
        EntityManager em = emf.createEntityManager();
        SerialDao serialDao = new SerialDao(em);
        
        try {
            em.getTransaction().begin();
            serialDao.updateSerial(s);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

}
