package entity;

import enums.tipFilm;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="e7_filme")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titlu;
    private tipFilm tip;
    
    @Temporal(TemporalType.DATE)
    private Date dataAparitie;
    
    @ManyToOne
    private Regizor regizor;
    
    public Film() {
        
    }

    public Film(String titlu, tipFilm tip, Date dataAparitie, Regizor regizor) {
        this.titlu = titlu;
        this.tip = tip;
        this.dataAparitie = dataAparitie;
        this.regizor = regizor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public tipFilm getTip() {
        return tip;
    }

    public void setTip(tipFilm tip) {
        this.tip = tip;
    }

    public Date getDataAparitie() {
        return dataAparitie;
    }

    public void setDataAparitie(Date dataAparitie) {
        this.dataAparitie = dataAparitie;
    }

    public Regizor getRegizor() {
        return regizor;
    }

    public void setRegizor(Regizor regizor) {
        this.regizor = regizor;
    }

    @Override
    public String toString() {
        return "Film{" + "titlu=" + titlu + ", tip=" + tip + ", dataAparitie=" + dataAparitie + '}';
    }   
}