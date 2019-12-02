package entitites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "e3_ebooks")
@DiscriminatorValue(value = "EB")
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