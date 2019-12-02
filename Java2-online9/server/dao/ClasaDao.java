package dao;

import entities.Clasa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ClasaDao {
    
    private EntityManager em;
    
    public ClasaDao(EntityManager em) {
        this.em = em;
    }
    
    public List<Clasa> getClase() {
        String sql = "SELECT c FROM Clasa c";
        TypedQuery<Clasa> query = em.createQuery(sql, Clasa.class);
        return query.getResultList();
    }
}
