package muistii;


public class Muisti {

    private double viimeisin;
    private SymboliKirjasto symbolit;
    private ReaktioYhtalo reaktio;

    public Muisti() {
        this.symbolit = new SymboliKirjasto();

    }

    public int lisaaReaktioYhtalo(String yhtalo) {
        this.reaktio = new ReaktioYhtalo(yhtalo);
        if (reaktio.tarkistaYhtalo() == 1) {
            return 1;
        } else {
            reaktio = null; //jos yhtälö ei ole oikeassa muodossa, sitä ei tallenneta
            return 0;
        }
    }

    public ReaktioYhtalo haeReaktioYhtalo() {  
        return reaktio;
    }

    public void talletaVali(double vali) { //viimeisimmän laskun tulos
        viimeisin = vali;
    }

    public void talletaValiMuistiin(String osoite) { //tallettaa välimuistin arvon muistiin
        symbolit.lisaaParametri(osoite, viimeisin);
    }
    
    public double palautaVali() { //palauttaa välimuistin arvon
        return viimeisin;
    }
    
}
