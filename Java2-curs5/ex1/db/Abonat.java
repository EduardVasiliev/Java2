package db;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Abonat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nume;
    
    @ElementCollection
    @CollectionTable(name = "numere_apelate")
    private List<String> numereApelate;

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

    public List<String> getNumereApelate() {
        return numereApelate;
    }

    public void setNumereApelate(List<String> numereApelate) {
        this.numereApelate = numereApelate;
    }

}