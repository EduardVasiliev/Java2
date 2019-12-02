package entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Actor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nume;
    private String prenume;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "actori_filme", joinColumns = {@JoinColumn(name = "id_actori")}
                                        ,inverseJoinColumns = {@JoinColumn(name = "id_filme")})
    private List<Film> filme;
    
    public Actor() {
        
    }
    
    public Actor(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
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

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public List<Film> getFilme() {
        return filme;
    }

    public void setFilme(List<Film> filme) {
        this.filme = filme;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final Actor a = (Actor) obj;
        if(this.id != a.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       int hash = 7;
       hash = 11 * hash + this.id;
       return hash;
    }
    
    
}
