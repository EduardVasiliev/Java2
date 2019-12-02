package db;

import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyEnumerated;

@Entity
public class Semafor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String locatie;
    
    @ElementCollection
    @MapKeyEnumerated(EnumType.STRING)
    private Map<Culoare, String> avertisment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public Map<Culoare, String> getAvertisment() {
        return avertisment;
    }

    public void setAvertisment(Map<Culoare, String> avertisment) {
        this.avertisment = avertisment;
    }
    
    
}