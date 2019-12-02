
package main;

import entities.Angajat;
import entities.Departament;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs4ManyToOne2PU");
        final EntityManager em = emf.createEntityManager();
        
        Set<Angajat> angajati = new HashSet<>();
        
        Departament dep = new Departament();
        dep.setDenumire("Java Department");
        
        Angajat a1 = new Angajat();
        a1.setNume("Eduard");
        a1.setDepartament(dep);
        
        Angajat a2 = new Angajat();
        a2.setNume("Andrei");
        a2.setDepartament(dep);
        
        angajati.add(a1);
        angajati.add(a2);
        
        dep.setAngajati(angajati);
        
        try {
            em.getTransaction().begin();
            em.persist(dep);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        
    }
}
