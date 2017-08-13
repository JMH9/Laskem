package muistii;

import java.util.*;
public class ReaktioYhtalo {
    private String yhtalo;
    
    public ReaktioYhtalo(String yht){
        this.yhtalo = yht;
    }
    
    public int tarkistaYhtalo(){ //tarkistaa, että reaktioyhtälö on oikeassa muodossa, 1 jos on ja 0 jos ei
        if(!yhtalo.contains("=")){ //vielä "hieman" keskeneräinen
            return 0;
        }
        if(!yhtalo.contains("+")){
            return 0;
        }
        return 1;
    }
    public String naytaYhtalo(){
        return yhtalo;
    }
}
