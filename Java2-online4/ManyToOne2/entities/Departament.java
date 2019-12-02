
package entities;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departamente")
public class Departament {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String denumire;
    
    @OneToMany(mappedBy = "departament", cascade = CascadeType.ALL)
    private Set<Angajat> angajati;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Set<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(Set<Angajat> angajati) {
        this.angajati = angajati;
    }
    
    
}
