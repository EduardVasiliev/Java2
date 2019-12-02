package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Televizor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private int diagonala;
    private TipTelevizor tipTelevizor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(int diagonala) {
        this.diagonala = diagonala;
    }

    public TipTelevizor getTipTelevizor() {
        return tipTelevizor;
    }

    public void setTipTelevizor(TipTelevizor tipTelevizor) {
        this.tipTelevizor = tipTelevizor;
    }
    
    
    
}