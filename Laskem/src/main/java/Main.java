import käyttöyksikkö.Laskin;
import muistii.Muisti;
import java.util.*;

public class Main { //PIENTÄ TESTAILUA, ÄLÄ HUOMIOI
 public static void main(String[] args) {
    Laskin x = new Laskin();
    Muisti m = x.tuoMuisti();
     System.out.println(m.palautaVali());
   double i = x.tuoAlu().yhteenLasku(1, 2, m);
     System.out.println(i);
     System.out.println(m.palautaVali());
     System.out.println(m.lisaaReaktioYhtalo("vaiaroe"));

     System.out.println(m.lisaaReaktioYhtalo("a + b = c"));
     System.out.println(m.haeReaktioYhtalo().naytaYhtalo());
 }    
}
