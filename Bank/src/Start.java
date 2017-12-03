/**
 *
 * @author HelBlar
 */
public class Start {

    public static void main(String[] args) {
        Konto kowalski=new Konto(0,0);
        Konto nowak=new Konto(0,0);
        kowalski.getStanKonta();
        nowak.getStanKonta();
        kowalski.wplata(1000.92);
        kowalski.wyplata(20.37);
        kowalski.getStanKonta();
        kowalski.przelew(97, nowak);
        kowalski.getStanKonta();
        nowak.getStanKonta();
    }
    
}
