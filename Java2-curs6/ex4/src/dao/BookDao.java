package dao;

import entitites.Book;
import javax.persistence.EntityManager;

public class BookDao {
    private EntityManager em;
    
    public BookDao(EntityManager em) {
        this.em = em;
    }
    
    public void addBook(Book b) {
        em.persist(b);
    }
}