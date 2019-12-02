package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Curs implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nume;
    
    @Temporal(TemporalType.DATE)
    private Date dataIncepere;
    
    @OneToMany(mappedBy = "curs")
    private List<Instructor> instructori;
    
    @OneToMany(mappedBy = "curs")
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

    public Date getDataIncepere() {
        return dataIncepere;
    }

    public void setDataIncepere(Date dataIncepere) {
        this.dataIncepere = dataIncepere;
    }

    public List<Instructor> getInstructori() {
        return instructori;
    }

    public void setInstructori(List<Instructor> instructori) {
        this.instructori = instructori;
    }

    public List<Clasa> getClase() {
        return clase;
    }

    public void setClase(List<Clasa> clase) {
        this.clase = clase;
    }
    
}
