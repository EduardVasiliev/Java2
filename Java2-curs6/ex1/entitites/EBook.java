package entitites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "e1_ebooks")
public class EBook extends Book {
    private int size;

    public EBook() {
    }

    public EBook(String title, int price, int size) {
        super(title, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    

}