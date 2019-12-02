package db;

import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Librarie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String locatie;
    
    @OneToMany(mappedBy = "librarie", cascade = CascadeType.ALL)
    private Map<String, Carte> carti;

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

    public Map<String, Carte> getCarti() {
        return carti;
    }

    public void setCarti(Map<String, Carte> carti) {
        this.carti = carti;
    }
    
    
    
}