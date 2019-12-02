package entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Masina {
    
    @EmbeddedId
    private NrInmatriculare nrInmatriculare;
    private String proprietar;
    
    public Masina() {
        
    }
    
    public Masina(NrInmatriculare nrInmatriculare, String proprietar) {
        this.nrInmatriculare = nrInmatriculare;
        this.proprietar = proprietar;
    }

    public NrInmatriculare getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(NrInmatriculare nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getProprietar() {
        return proprietar;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }
    
    public String getJudet() {
        return nrInmatriculare.getJudet();
    }
    
    public String getNumar() {
        return nrInmatriculare.getNumar();
    }
    
    public String getCod() {
        return nrInmatriculare.getCod();
    }

    @Override
    public String toString() {
        return "Masina{" + "nrInmatriculare=" + nrInmatriculare + ", proprietar=" + proprietar + '}';
    } 
}
