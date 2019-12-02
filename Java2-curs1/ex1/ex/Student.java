package ex;
public class Student {
    private int varsta;
    private String nume;
    
    private Student() {
        
    }
    
    private void Striga() {
        System.out.println(this.nume + " " + this.varsta);
    }
}