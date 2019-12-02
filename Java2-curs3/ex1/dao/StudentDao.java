package dao;

import db.Student;
import javax.persistence.EntityManager;

public class StudentDao {
    private EntityManager em;
    
    public StudentDao(EntityManager em) {
        this.em = em;
    }
    
    public void adaugaStudent(Student s) {
        em.persist(s);
    }
    
    public Student cautaStudent(int idStudent) {
        return em.find(Student.class, idStudent);
    }
    
    public void stergeStudent(Student s) {
        em.remove(s);
    }
    
    public Student mergeStudent(Student s) {        //aduce entitatea din db in context ca sa poata fi stearsa
        return em.merge(s);
    }
}