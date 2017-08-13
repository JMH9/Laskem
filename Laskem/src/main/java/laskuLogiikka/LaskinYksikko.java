
public class LaskinYksikko {
    
    
    public LaskinYksikko(){
        
    }
    
    public double yhteenLasku(double a, double b, Muisti m){
        double c = a + b;
        m.talletaVali(c);
        return c;
    }
    
    public double vahennysLasku(double a, double b, Muisti m){
        double c = a - b;
        m.talletaVali(c);
        return c;
    }
    
    public double kertoLasku(double a, double b, Muisti m){
        double c = a - b;
        m.talletaVali(c);
        return c;
    }
    
    public double jakoLasku(double a, double b, Muisti m){
        double c = a - b;
        m.talletaVali(c);
        return c;
    }
    
    
           
    public void talletaMuistiin(Muisti m){
        m.talletaVali(0);
    }
}
