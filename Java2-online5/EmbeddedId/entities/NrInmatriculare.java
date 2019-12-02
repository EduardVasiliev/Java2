package entities;

import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class NrInmatriculare {
    
    private String judet;
    private String numar;
    private String cod;
    
    public NrInmatriculare() {
        
    }
    
    public NrInmatriculare(String judet, String numar, String cod) {
        this.judet = judet;
        this.numar = numar;
        this.cod = cod;
    }

    public String getJudet() {
        return judet;
    }

    public String getNumar() {
        return numar;
    }

    public String getCod() {
        return cod;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        if (!Objects.equals(this.numar, other.numar)) {
            return false;
        }
        if (!Objects.equals(this.cod, other.cod)) {
            return false;
        }
        
        return true;
    }
    
    
}
