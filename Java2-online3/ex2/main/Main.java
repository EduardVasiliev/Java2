
package main;

import entities.Adresa;
import entities.Angajat;
import entities.Companie;
import service.MainService;

public class Main {
    public static void main(String[] args) {
        MainService ms = new MainService();
        
        Adresa adresa = new Adresa("Iuliu Maniu", 3, "Bucuresti");
        Companie c = new Companie();
        c.setNume("UPB");
        c.setAdresa(adresa);
        
        Adresa adresaAngajat = new Adresa("Unirii", 10, "Bucuresti");
        Angajat a = new Angajat();
        a.setNume("Eduard");
        a.setAdresa(adresaAngajat);
        
        ms.addCompany(c);
        ms.addEmployee(a);
        
        
        System.out.println(ms.getCompany(1));
        
        c.setNume("DELL");
        ms.updateCompany(c);
        
        System.out.println(ms.getCompany(1));
        
        
        
    }
}
