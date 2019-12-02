
package entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "facultati")
public class Facultate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nume;
    private String domeniu;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_universitate")
    private Universitate universitate;
    
    public Facultate() {
        
    }
    
    public Facultate(String nume, String domeniu) {
        this.nume  = nume;
        this.domeniu = domeniu;
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

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public Universitate getUniversitate() {
        return universitate;
    }

    public void setUniversitate(Universitate universitate) {
        this.universitate = universitate;
    }
    
    
    
}
