
public class Laskin {
   
    private LaskinYksikko lasky;
    private Muisti muisti;
    public Laskin(){
        this.lasky = new LaskinYksikko();
        this.muisti = new Muisti();
    }
    
    public void nollaaMuisti(){
        muisti = new Muisti();
    }
    
}
