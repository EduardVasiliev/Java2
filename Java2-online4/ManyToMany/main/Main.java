package main;

import entities.Actor;
import entities.Film;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs4ManyToManyPU");
        final EntityManager em = emf.createEntityManager();
        
        Film f1 = new Film("Titanic");
        Film f2 = new Film("The Revenant");
        
        Actor a1 = new Actor("DiCaprio", "Leonardo");
        Actor a2 = new Actor("Domnhall", "Gleenson");
        
        List<Film> filmeDiCaprio = new ArrayList<>();
        List<Film> filmeDomnhall = new ArrayList<>();
        List<Actor> actoriTheRevenant = new ArrayList<>();
        
        filmeDiCaprio.add(f1);
        filmeDiCaprio.add(f2);
        filmeDomnhall.add(f2);
        
        actoriTheRevenant.add(a1);
        actoriTheRevenant.add(a2);
        
        f2.setActori(actoriTheRevenant);
        a1.setFilme(filmeDiCaprio);
        a2.setFilme(filmeDomnhall);
        
        try {
            em.getTransaction().begin();
            em.persist(f2);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
