package TablePerClass;

import javax.persistence.Entity;

@Entity
public class EBook extends Book {
    
    private int size;
    
    public EBook(){
        
    }
    
    public EBook(String nume, int pret, int size) {
        super(nume, pret);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
}
