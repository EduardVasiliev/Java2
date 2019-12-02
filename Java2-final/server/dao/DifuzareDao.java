package dao;

import entities.Difuzare;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class DifuzareDao {
    
    private EntityManager em;
    
    public DifuzareDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaDifuzare(Difuzare d) {
        em.persist(d);
    }
    
    public void stergeDifuzare(int id) {
        Difuzare difuzare = em.find(Difuzare.class, id);
        if(!Objects.isNull(difuzare)) {
           em.remove(difuzare);
        }
    }
    
    public List<Difuzare> afiseazaDifuzare() {
        String sql = "SELECT d FROM Difuzare d";
        TypedQuery<Difuzare> query = em.createQuery(sql, Difuzare.class);
        return query.getResultList();
    }
    
}
