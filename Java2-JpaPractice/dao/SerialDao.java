
package dao;

import entities.Serial;
import javax.persistence.EntityManager;

public class SerialDao {
    private final EntityManager em;
    
    public SerialDao(EntityManager em) {
        this.em = em;
    }
    
    public void addSerial(Serial s) {
        em.persist(s);
    }
    
    public Serial getSerial(int id) {
        return em.find(Serial.class, id);
    }
    
    public void removeSerial(int id) {
        Serial serial = em.find(Serial.class, id);
        if(serial != null) {
            em.remove(serial);
        }
    }
    
    public Serial updateSerial(Serial s) {
        return em.merge(s);
    }
    
}
