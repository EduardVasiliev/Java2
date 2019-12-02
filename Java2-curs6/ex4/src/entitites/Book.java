package entitites;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/*
    Adnotarile claselor:
        1. @Entity
        2. @MappedSuperclass
        3. @Embeddable
*/

@MappedSuperclass   // se pune pe clase abstracte. Clasa nu este persistata
@Table(name = "e4_books")
@DiscriminatorColumn(name = "tip_obiect")
@DiscriminatorValue(value = "B")
public abstract class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int price;
    
    public Book() {
        
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}