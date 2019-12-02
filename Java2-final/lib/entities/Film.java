package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Film implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titlu;
    
    // Durata in minute
    private int durata;
    
    @Enumerated(EnumType.STRING)
    private Tip tip;
    
    @ElementCollection
    private List<String> actori;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public List<String> getActori() {
        return actori;
    }

    public void setActori(List<String> actori) {
        this.actori = actori;
    }
    
    
    @Override
    public String toString() {
        return "ID: " + id + "  Titlu: " + titlu.toUpperCase() + "  Gen: " + tip + "  Durata: " + durata + " min";
    }
}
