import java.util.ArrayList;
/**
 * In der Fabrik werden Bestellungen abgearbeitet. Hier wird das Programm gestartet.
 * @author Gruppe 08 
 * @version 1.0
 */
public class Fabrik
{
    // Übersicht der erfassten Bestellungen
    private ArrayList<Bestellung> bestellungen;
    private int bestellungsNr;
    // bestellungsNr, die jeder Bestellung neu übergeben wird

    /**
     * Konstruktor für Objekte der Klasse Fabrik
     */
    public Fabrik()
    {
        // Instanzvariable initialisieren
        bestellungen = new ArrayList<Bestellung>();
        this.bestellungsNr = 1;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     */
    public void bestellungAufgeben(int standardTueren, int premiumTueren) 
    {
        // tragen Sie hier den Code ein
         if (standardTueren == 0 && premiumTueren == 0) {
            System.out.println("Tut mir leid, dass Sie nichts gefunden haben.");
            System.out.println("Bis zum nächsten Mal!");
            System.out.println("");
        }
        else if (standardTueren < 0 || premiumTueren < 0) {
            System.out.println("Die Anzahl der Türen muss positiv sein.");
            System.out.println("");
        }
        else {
            Bestellung neueBestellung = new Bestellung(standardTueren, premiumTueren, bestellungsNr);
            bestellungen.add(neueBestellung);
            this.bestellungsNr++;
            neueBestellung.bestellungBestaetigen();
        }
    }
    
    public void bestellungAusgeben() {
        // Hier ist die Logik implementiert, um die Details aller Bestellungen auszugeben
        System.out.println("Folgende Bestellungen wurden aufgegeben:");
        System.out.println("");
        
            for (Bestellung bestellung : bestellungen) {
                System.out.println("Bestellnummer: " + bestellung.gibBestellungsNr());
                System.out.println("Anzahl Standardtüren: " + bestellung.gibAnzahlStandardTueren());
                System.out.println("Anzahl Premiumtüren: " + bestellung.gibAnzahlPremiumTueren());
                System.out.println("Bestellbestätigung: " + bestellung.gibBestellBestaetigung());
                System.out.println("Beschaffungszeit: " + bestellung.gibBeschaffungsZeit());
                System.out.println("--------------------");
            }
    }
    
     public static void main(String[] args) {
        Fabrik fabrik = new Fabrik();
        fabrik.bestellungAufgeben(3, 4);
        fabrik.bestellungAufgeben(1, 2);
        fabrik.bestellungAufgeben(4, 1);
        fabrik.bestellungAusgeben();
        
        // Gesamtanzahl der bestellten Türen berechnen
        int totalStandardTueren = 0;
        int totalPremiumTueren = 0;
    
        for (Bestellung bestellung : fabrik.bestellungen) {
            totalStandardTueren += bestellung.gibAnzahlStandardTueren();
            totalPremiumTueren += bestellung.gibAnzahlPremiumTueren();
        }
    
        System.out.println();
        System.out.println("Insgesamt wurden " + totalStandardTueren + " Standardtüren bestellt.");
        System.out.println("Insgesamt wurden " + totalPremiumTueren + " Premiumtüren bestellt.");
    }
    
    public ArrayList<Bestellung> gibBestellungen() 
    {
    return bestellungen;
    }
}