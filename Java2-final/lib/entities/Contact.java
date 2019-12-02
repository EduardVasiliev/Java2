package entities;

import javax.persistence.Embeddable;

@Embeddable
public class Contact{
    
    private String email;
    private String telefon;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Contact{" + "email=" + email + ", telefon=" + telefon + '}';
    }
    
}
