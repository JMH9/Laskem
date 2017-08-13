package käyttöyksikkö;


import laskuLogiikka.LaskinYksikko;
import muistii.Muisti;


public class Laskin {
   
    private LaskinYksikko lasky;
    private Muisti muisti;
    
    public Laskin(){
        this.lasky = new LaskinYksikko();
        this.muisti = new Muisti();
    }
    
    public LaskinYksikko tuoAlu(){
        return lasky;
    }
    
    public Muisti tuoMuisti(){
        return muisti;
    }
    
    public void nollaaMuisti(){
        muisti = new Muisti();
    }
    
}
