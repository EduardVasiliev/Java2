package main;

import dao.BookDao;
import entitites.Book;
import entitites.EBook;
import entitites.PaperBook;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs6.ex3PU");
        EntityManager em = emf.createEntityManager();
        
        Book book = new Book("Crima si pedeapsa", 65);
        PaperBook paperBook = new PaperBook("Codul lui daVinci", 59, 0.62f);
        EBook ebook = new EBook("Oracle Certified Associate", 30, 23);
        
        BookDao bookDao = new BookDao(em);
        
        try {
            em.getTransaction().begin();
            bookDao.addBook(book);
            bookDao.addBook(paperBook);
            bookDao.addBook(ebook);
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
        
    }
}