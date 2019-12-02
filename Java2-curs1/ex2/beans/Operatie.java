package beans;

import Annotations.Executa;

public class Operatie {
    
    @Executa
    private int adunare(int a, int b) {
        return a + b;
    }
    
    @Executa
    private int inmultire(int a, int b) {
        return a * b;
    }
    
    private int scadere(int a, int b) {
        return a - b;
    }
    
    private int impartire(int a, int b) {
        return a / b;
    }
}