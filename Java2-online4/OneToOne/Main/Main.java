
package Main;

import entities.Adresa;
import entities.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs4OneToOnePU");
        EntityManager em = emf.createEntityManager();
        
        Adresa adresa = new Adresa();
        adresa.setOras("Athens");
        adresa.setStrada("Plaka");
        adresa.setTara("Greece");
        
        Student student = new Student();
        student.setAdresa(adresa);
        student.setNume("Eduard");
        student.setPrenume("Vasiliev");
    
        
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
