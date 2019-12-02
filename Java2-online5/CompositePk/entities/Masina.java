package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "Masini")
@IdClass(NrInmatriculare.class)
public class Masina {
    
    @Id
    private String judet; 
    @Id
    private String numar; 
    @Id
    private String cod;
    
    private String proprietar;
    
    public Masina() {
        
    }
    
    public Masina(String judet, String numar, String cod) {
        this.judet = judet;
        this.numar = numar;
        this.cod = cod;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getProprietar() {
        return proprietar;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }
}
