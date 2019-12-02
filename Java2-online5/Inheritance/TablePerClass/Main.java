package TablePerClass;

import TablePerClass.Book;
import TablePerClass.EBook;
import TablePerClass.PaperBook;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs5TablePerClassPU");
        EntityManager em = emf.createEntityManager();
        
        Book eBook = new EBook("Ebook", 100, 720);
        Book paperBook = new PaperBook("Paperbook", 30, 120);
        
        try {
            em.getTransaction().begin();
            em.persist(eBook);
            em.persist(paperBook);
            em.getTransaction().commit();           
        } finally {
            em.close();
        }
    }
}
