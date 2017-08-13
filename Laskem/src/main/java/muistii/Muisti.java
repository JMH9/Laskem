
public class Muisti {
    private double viimeisin;
    private SymboliKirjasto symbolit;
    private KaavaSymboliKirjasto kaavasy;
    
    public Muisti(){
        this.symbolit = new SymboliKirjasto();
        this.kaavasy = new KaavaSymboliKirjasto();
    }
    
    public void talletaVali(double vali){
        viimeisin = vali;
    }
    
    public double palautaVali(){
        return viimeisin;
    }
}
