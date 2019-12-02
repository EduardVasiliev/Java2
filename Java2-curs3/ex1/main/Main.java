package main;

import Service.MainService;
import dao.StudentDao;
import db.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        //MainService service = new MainService();
        //Student s = new Student();
        //s.setNume("Eduard");
        //s.setVarsta(23);
        
        //service.removeStudent(1);
        //System.out.println(service.getStudent(1));
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curs3.ex2PU");
        EntityManager em = emf.createEntityManager();
        StudentDao studentDao = new StudentDao(em);
        
        Student s = new Student();
        
        try {
            em.getTransaction().begin();
            Student s1 = studentDao.cautaStudent(1);
            s1.setNume("Andreea");
            s1.setVarsta(21);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}