package entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class NrInmatriculare implements Serializable{
    private String judet;
    private String nr;
    private String cod;

    public NrInmatriculare() {
    }

    public NrInmatriculare(String judet, String nr, String cod) {
        this.judet = judet;
        this.nr = nr;
        this.cod = cod;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.judet);
        hash = 53 * hash + Objects.hashCode(this.nr);
        hash = 53 * hash + Objects.hashCode(this.cod);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NrInmatriculare other = (NrInmatriculare) obj;
        if (!Objects.equals(this.judet, other.judet)) {
            return false;
        }
        if (!Objects.equals(this.nr, other.nr)) {
            return false;
        }
        if (!Objects.equals(this.cod, other.cod)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "NrInmatriculare{" + "judet=" + judet + ", nr=" + nr + ", cod=" + cod + '}';
    }
    
    

}