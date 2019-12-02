package dao;

import db.Hotel;
import javax.persistence.EntityManager;

public class HotelDao {
    private EntityManager em;
    
    public HotelDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaHotel(Hotel h) {
        em.persist(h);
    }
}