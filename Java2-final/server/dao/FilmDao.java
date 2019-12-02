package dao;

import entities.Film;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class FilmDao {
    
    private EntityManager em;
    
    public FilmDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaFilm(Film f) {
        em.persist(f);
    }
    
    public void stergeFilm(int id) {
        Film film = em.find(Film.class, id);
        if(!Objects.isNull(film)) {
           em.remove(film);
        }
    }
    
    public List<Film> afiseazaFilme() {
        String sql = "SELECT f FROM Film f";
        TypedQuery<Film> query = em.createQuery(sql, Film.class);
        return query.getResultList();
    }
}
