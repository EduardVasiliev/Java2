package SingleTable;

import SingleTable.PaperBook;
import SingleTable.EBook;
import SingleTable.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs5PU");
        EntityManager em = emf.createEntityManager();
        
        Book eBook = new EBook("EBook1", 120, 1080);
        Book paperBook = new PaperBook("PaperBook", 30, 134);
        
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
