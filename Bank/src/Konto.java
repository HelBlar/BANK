/**
 *
 * @author HelBlar
 */
public class Konto {
   private double stanKonta,debet;
   Konto(double stanKonta, double debet){
       this.stanKonta=stanKonta;
       this.debet=debet;
   }
    double getStanKonta(){
        System.out.println("Stan Konta: "+format(this.stanKonta));
        return this.stanKonta;
    }
    void wplata(double wplata){
        this.stanKonta=this.stanKonta+wplata;
        System.out.println("Wpłaciłeś: "+format(wplata)+" Obecny stan Konta: "+format(this.stanKonta));
    }
    void wyplata(double wyplata){
        if (nieMozliwaWyplata(wyplata)){
        System.out.println("Wypłata niemożliwa, brak wystarczających środków na koncie");
        }else{
        this.stanKonta=this.stanKonta-wyplata;
        System.out.println("Wypłaciłeś: "+format(wyplata)+" Obecny stan Konta: "+format(this.stanKonta));
        }
    }
    void przelew(double wyplata, Konto adresat){
        if (nieMozliwaWyplata(wyplata)){
         System.out.println("Przelew niemożliwy, brak wystarczających środków na koncie");
        }else{
        this.stanKonta=this.stanKonta-wyplata;
        adresat.stanKonta=adresat.stanKonta+wyplata;
        System.out.println("Przelałeś "+format(wyplata)+" na konto: "+adresat+".");
        }
    }
    private boolean nieMozliwaWyplata(double kwota){
        boolean nieMozliwaWyplata=false;
        if (kwota>(this.stanKonta+this.debet)){
        nieMozliwaWyplata=true;
        }     
        return nieMozliwaWyplata;
    }
    private String format(double kwota){
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00 zl");
        return df.format(kwota);
    }
}
