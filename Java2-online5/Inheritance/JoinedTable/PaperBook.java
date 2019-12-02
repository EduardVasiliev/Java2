package JoinedTable;

import javax.persistence.Entity;

@Entity
public class PaperBook extends Book {
    
    private int pagini;
    
    public PaperBook() {
        
    }
    
    public PaperBook(String nume, int pret, int pagini) {
        super(nume, pret);
        this.pagini = pagini;
    }

    public int getPagini() {
        return pagini;
    }

    public void setPagini(int pagini) {
        this.pagini = pagini;
    }
    
    
    
}
