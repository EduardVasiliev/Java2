package dao;

import entities.Difuzare;
import entities.Spectator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class SpectatorDao {
    
    private EntityManager em;
    
    public SpectatorDao(EntityManager em) {
        this.em = em;
    }
    
    public void vindeBilet(Spectator s) {
            em.persist(s);
    }
    
    public List<Spectator> afiseazaBilete() {
        String sql = "SELECT s FROM Spectator s";
        TypedQuery<Spectator> query = em.createQuery(sql, Spectator.class);
        return query.getResultList();
    }

}
