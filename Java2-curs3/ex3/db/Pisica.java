package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pisica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String nume;
    @Enumerated(EnumType.STRING)
    @Column(name = "rasa_pisica")
    private RasaPisica rasaPisica;

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

    public RasaPisica getRasaPisica() {
        return rasaPisica;
    }

    public void setRasaPisica(RasaPisica rasaPisica) {
        this.rasaPisica = rasaPisica;
    }
    
    
    
}