package main;

import entities.Masina;
import entities.NrInmatriculare;
import entities.NrInmatriculare_;
import service.MainService;

public class Main {
    public static void main(String[] args) {
        MainService service = new MainService();
        
        NrInmatriculare nrInmatriculare = new NrInmatriculare("TL", "95", "YEW");
        Masina masina1 = new Masina(nrInmatriculare, "Eduard");
        
        service.adaugaMasina(masina1);
        
        System.out.println(service.cautaMasina(nrInmatriculare));     
        
        
    }
}
