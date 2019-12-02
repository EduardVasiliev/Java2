package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nume;
    
    @ElementCollection
    private List<String> telefoane;
    
    @ManyToMany
    private List<Clasa> clase;

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

    public List<String> getTelefoane() {
        return telefoane;
    }

    public void setTelefoane(List<String> telefoane) {
        this.telefoane = telefoane;
    }

    public List<Clasa> getClase() {
        return clase;
    }

    public void setClase(List<Clasa> clase) {
        this.clase = clase;
    }
    
    
}
