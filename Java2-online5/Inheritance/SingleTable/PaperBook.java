package SingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Paperbook")
public class PaperBook extends Book {

    private int weight;
    
    public PaperBook() {
        
    }

    public PaperBook(String nume, int pret, int weitht) {
        super(nume, pret);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
    
}
