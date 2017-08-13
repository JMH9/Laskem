package muistii;


import java.util.HashMap;

public class SymboliKirjasto {              //eli muisti, jossa muistipaikkojen avaimina String muuttuja
    private HashMap<String, Double> kokoelma;
    
    public SymboliKirjasto(){
        this.kokoelma = new HashMap();
    }
    
    public int lisaaParametri(String nimi, double arvo){ //arvoa 0 ei voida tallettaa muistiin 
        if(arvo == 0){            
            return 0;
        } else{
            kokoelma.put(nimi, arvo);
            return 1;
        }
        
    }
    
    public double haeArvoParametrille(String nimi){ 
        if(!kokoelma.containsKey(nimi)){
            return 0;
        } else{
            return kokoelma.get(nimi);
        }
    }
}
