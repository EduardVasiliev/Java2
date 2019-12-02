package dao;

import entity.Film;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class FilmDao {
    private EntityManager em;
    
    public FilmDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaFilm(Film f) {
        em.persist(f);
    }
    
    // Nativ
    public List<Object[]> getFilme() {
        String sql = "SELECT * FROM e7_filme";
        Query query = em.createNativeQuery(sql);
        return query.getResultList();
    }
    
    //JBQL
    public Optional<Film> getFilmById(long id_film) {
        String sql = "SELECT f FROM Film f WHERE f.id=?1";
        TypedQuery<Film> query = em.createQuery(sql, Film.class);
        query.setParameter(1, id_film);
        
        try {
            return Optional.of(query.getSingleResult());
        } catch(NoResultException e) {
            return Optional.empty();
        }
    }
}