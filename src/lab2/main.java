package lab2;
import java.util.List;
import lab2.Benutzer;

public class main {
    public static void main(String args[]){
        Benutzer Lucas = new Benutzer();
        Fussball folbal = new Fussball();
        Basketball basket = new Basketball();
        Fussball BaraBaraGol = new Fussball();
        Hochsprung saritura = new Hochsprung();
        Lucas.addSport(folbal);
        Lucas.addSport(BaraBaraGol);
        System.out.println(Lucas.kalkuliereZeit());
    }
}
