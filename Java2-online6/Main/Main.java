package Main;

import entities.Student;
import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs6CachePU");
        EntityManager em = emf.createEntityManager();
        
        Student student1 = new Student("Eduard", "Vasiliev");
        Student student2 = new Student("Maria", "Ene");
        
        try {
            em.getTransaction().begin();
            em.persist(student1);
            em.persist(student2);
            em.getTransaction().commit();
            
            Cache cache = emf.getCache();
            System.out.println(cache.contains(Student.class, 1));
            cache.evict(Student.class, 1);
            System.out.println(cache.contains(Student.class, 1));
            System.out.println(cache.contains(Student.class, 2));
            cache.evictAll();
            System.out.println(cache.contains(Student.class, 2));
        } finally {
            em.close();
        }
    }
}
