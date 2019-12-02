package Service;

import dao.StudentDao;
import db.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainService {
    private EntityManagerFactory emf;
    
    public MainService() {
        emf = Persistence.createEntityManagerFactory("Curs3.ex1PU");
    }
    
    public void adaugaStudent(Student s) {
        EntityManager em = emf.createEntityManager();
        StudentDao studentDao = new StudentDao(em);
        
        try {
            em.getTransaction().begin();
            studentDao.adaugaStudent(s);
            em.getTransaction().commit();
             
        } finally {
            em.close();
        }
    }
    
    public Student getStudent(int idStudent) {
        EntityManager em = emf.createEntityManager();
        StudentDao studentDao = new StudentDao(em);
        
        try {
            
            em.getTransaction().begin();
            return studentDao.cautaStudent(idStudent);
            
        } finally {
            em.close();
        }
    }
    
    public void removeStudent(int idStudent) {
        EntityManager em = emf.createEntityManager();
        StudentDao studentDao = new StudentDao(em);
        
        try {
            
            em.getTransaction().begin();
            Student s = studentDao.cautaStudent(idStudent);
            studentDao.stergeStudent(s);
            em.getTransaction().commit();
            
        } finally {
            em.close();
        }
    }
}