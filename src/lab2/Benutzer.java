package lab2;
import java.util.ArrayList;
import java.util.List;


public class Benutzer implements Sport{
    private String vorName;
    private String nachName;
    private ArrayList<Sport> sport;
    public Benutzer(){
        vorName = "Lucas";
        nachName = "Purcsa";
        this.sport = new ArrayList<Sport>();
    }

    @Override
    public double kalkuliereZeit() {
        double total = 0;
        for(Sport currSport : sport){
            total += currSport.kalkuliereZeit();
        }
        return total;
    }
    public double kalkuliereZeit(Sport sportt){
        return sportt.kalkuliereZeit();
    }
    public double kalkuliereDurschnitszeit(){
        double suma = 0;
        for(Sport currSport : sport){
            suma += currSport.kalkuliereZeit();
        }
        return suma/sport.size();
    }
    public String getNachName(){
        return this.nachName;
    }
    public String getVorName(){
        return this.vorName;
    }
    public void setVorName(String newName){
        this.vorName = newName;
    }
    public void setNachName(String newName){
        this.nachName = newName;
    }
    public void addSport(Sport newSport){
        this.sport.add(newSport);
    }

}
