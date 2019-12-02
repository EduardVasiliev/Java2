package db;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Magazin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nume;
    
    @ElementCollection
    @Enumerated(EnumType.STRING)    // Transformam Enum in String
    private Map<String, Televizor> televizoare;

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

    public Map<String, Televizor> getTelevizoare() {
        return televizoare;
    }

    public void setTelevizoare(Map<String, Televizor> televizoare) {
        this.televizoare = televizoare;
    }
    
    
    
    
}
