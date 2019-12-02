package db;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String nume;
    @Embedded
    private Adresa adresaHotel;

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

    public Adresa getAdresaHotel() {
        return adresaHotel;
    }

    public void setAdresaHotel(Adresa adresaHotel) {
        this.adresaHotel = adresaHotel;
    }
    
    
}