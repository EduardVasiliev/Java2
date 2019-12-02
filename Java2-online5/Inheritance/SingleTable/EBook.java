package SingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EBook")
public class EBook extends Book {
    
    private int size;
    
    public EBook() {
        
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
