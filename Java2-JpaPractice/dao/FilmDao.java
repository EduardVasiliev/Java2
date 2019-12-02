
package dao;

import entities.Film;
import javax.persistence.EntityManager;

public class FilmDao {
    private final EntityManager em;
    
    public FilmDao(EntityManager em) {
        this.em = em;
    }
    
    public void addFilm(Film f) {
        em.persist(f);
    }
    
    public Film getFilm(int id) {
        return em.find(Film.class, id);
    }
    
    public void removeFilm(int id) {
        Film film = em.find(Film.class, id);
        if(film != null) {
            em.remove(film);
        }
    }
    
    public Film updateFilm(Film f) {
        return em.merge(f);
    }
}
