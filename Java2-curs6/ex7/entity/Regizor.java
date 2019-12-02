package entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="e7_regizori")
public class Regizor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nume;
    private String prenume;
    
    @OneToMany(mappedBy = "regizor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Film> filme;                                   //fetch - pentru a extrage si lista de filme
    
    public Regizor() {
        
    }

    public Regizor(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public List<Film> getFilme() {
        return filme;
    }

    public void setFilme(List<Film> filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Regizor{" + "nume=" + nume + ", prenume=" + prenume + ", filme=" + filme + '}';
    }
}