
package entities;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Film {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic(fetch = FetchType.EAGER)
    private String nume;
    
    @Enumerated(EnumType.STRING)
    private Genre genre;
    
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Embedded
    private StudioInfo studio;

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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StudioInfo getStudio() {
        return studio;
    }

    public void setStudio(StudioInfo studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Film{" + "id=" + id + ", nume=" + nume + ", genre=" + genre + ", date=" + date + ", studio=" + studio + '}';
    }
}
