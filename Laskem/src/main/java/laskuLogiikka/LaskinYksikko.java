package laskuLogiikka;


import muistii.Muisti;


public class LaskinYksikko { //sisältää kaikki laskimen tekemät laskutoimitukset metodeina
    
 
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
    
}
