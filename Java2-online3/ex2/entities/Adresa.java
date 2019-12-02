package entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresa {
    private String strada;
    private int numar;
    private String oras;
    
    public Adresa() {
        
    }

    public Adresa(String strada, int numar, String oras) {
        this.strada = strada;
        this.numar = numar;
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }
    
}
