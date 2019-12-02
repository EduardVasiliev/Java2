package entitites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "e1_paperbook")
public class PaperBook extends Book {
    private float weight;

    public PaperBook() {
    }

    public PaperBook(String title, int price, float weight) {
        super(title, price);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
}