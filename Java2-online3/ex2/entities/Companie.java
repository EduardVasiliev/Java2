
package entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Companii")
public class Companie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic(fetch = FetchType.LAZY)
    private String nume;
    
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "numar", column = @Column(name = "numar_companie")),
        @AttributeOverride(name = "oras", column = @Column(name = "oras_companie")),
        @AttributeOverride(name = "strada", column = @Column(name = "strada_companie"))
    })
    private Adresa adresa;

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

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Companie{" + "id=" + id + ", nume=" + nume + ", adresa=" + adresa + '}';
    }
    
    
    
}
