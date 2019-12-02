package db;

import javax.persistence.Embeddable;

@Embeddable
public class Adresa {
    private String numeStrada;
    private int numarStrada;
    
    public String getNumeStrada() {
        return numeStrada;
    }
}