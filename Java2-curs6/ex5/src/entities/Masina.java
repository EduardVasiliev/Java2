package entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="e5_masini")
public class Masina {
    @EmbeddedId
    private NrInmatriculare nrInmatriculare;
    private String producator;
    private String model;
    private float pret;

    public Masina() {
    }

    public Masina(String producator, String model, float pret) {
        this.producator = producator;
        this.model = model;
        this.pret = pret;
    }

    public NrInmatriculare getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(NrInmatriculare nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
    
    

}