package db;

import java.util.Map;
import javax.persistence.Cacheable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.eclipse.persistence.annotations.Cache;

@Entity
@Cacheable(false)
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nume;
    
    @ElementCollection
    @Embedded
    private Map<String, Adresa> locatie;

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

    public Map<String, Adresa> getLocatie() {
        return locatie;
    }

    public void setLocatie(Map<String, Adresa> locatie) {
        this.locatie = locatie;
    }
    
    
}