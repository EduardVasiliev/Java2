package model;

import Annotations.Aleator;

public class Punct {
    
    @Aleator
    private int x;
    @Aleator
    private int y;
    
    @Override
    public String toString() {
        return x + " " + y;
    }
    
    
}