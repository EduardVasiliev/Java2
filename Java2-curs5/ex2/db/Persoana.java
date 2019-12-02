package db;

import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persoana {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nume;
    
    @ElementCollection
    @CollectionTable(name = "prieteni")
    private Map<String, String> prieteni;

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

    public Map<String, String> getPrieteni() {
        return prieteni;
    }

    public void setPrieteni(Map<String, String> prieteni) {
        this.prieteni = prieteni;
    }
    
    
}