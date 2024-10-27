import java.util.ArrayList;
/**
 * In der Fabrik werden Bestellungen abgearbeitet. Hier wird das Programm gestartet.
 * 
 * @author Gruppe 08 
 * @version 1.0
 */
public class Fabrik
{
    // Array Liste der erfassten Bestellungen.
    private ArrayList<Bestellung> bestellungen;
    // bestellungsNr, die jeder Bestellung neu übergeben wird.
    private int bestellungsNr;
    
    /**
     * Konstruktor für Objekte der Klasse Fabrik.
     */
    public Fabrik()
    {
        // Neue Array List der Klasse Bestellung wird initialisiert.
        bestellungen = new ArrayList<Bestellung>();
        this.bestellungsNr = 1;
    }

    /**
     * Methode, um Bestellungen aufzugeben. 
     * Es werden nur Bestellungen mit positiven Werten akzeptiert.
     * Ansonsten erscheint eine Fehlermeldung. 
     * 
     * @param standardTueren Anzahl der bestellten Standardtüren. Muss positiv sein.
     * @param premiumTueren Anzahl der bestellten Premiumtüren. Muss positiv sein.
     */
    public void bestellungAufgeben(int standardTueren, int premiumTueren) 
    {
        // If-Methode, um korrekte Eingabewerte für die Bestellung zu überprüfen.
         if (standardTueren == 0 && premiumTueren == 0) {
            System.out.println("Tut mir leid, dass Sie nichts gefunden haben.");
            System.out.println("Bis zum nächsten Mal!");
            System.out.println("");
        }
        else if (standardTueren < 0 || premiumTueren < 0) {
            System.out.println("Die Anzahl der Türen muss positiv sein.");
            System.out.println("");
        }
        // Bestellung wurde richitg eingegeben und eine neue Bestellung mit neuer Bestellungsnummer hinzugefügt.
        else {
            Bestellung neueBestellung = new Bestellung(standardTueren, premiumTueren, bestellungsNr);
            bestellungen.add(neueBestellung);
            this.bestellungsNr++;
            neueBestellung.bestellungBestaetigen();
        }
    }
    
    /**
     * Methode, um alle Bestellungen auf der Konsole auszugeben.
     *
     */
    public void bestellungAusgeben() {
        // Hier ist die Logik implementiert, um die Details aller Bestellungen abzufragen.
        System.out.println("Folgende Bestellungen wurden aufgegeben:");
        System.out.println("");
        
            for (Bestellung bestellung : bestellungen) {
                System.out.println("Bestellnummer: " + bestellung.gibBestellungsNr());
                System.out.println("Anzahl Standardtüren: " + bestellung.gibAnzahlStandardTueren());
                System.out.println("Anzahl Premiumtüren: " + bestellung.gibAnzahlPremiumTueren());
                System.out.println("--------------------");
                System.out.println();
            }
    }
    
    /**
     * Main Methode, um alle mehrere Bestellungen auf der Konsole auszugeben.
     * Es wird auch die Gesamtanzahl der bestellten Standard- und Premiumtüren ausgegeben.
     * 
     */ 
    public static void main(String[] args) {
        Fabrik fabrik = new Fabrik();
        fabrik.bestellungAufgeben(3, 4);
        fabrik.bestellungAufgeben(1, 2);
        fabrik.bestellungAufgeben(4, 1);
        fabrik.bestellungAusgeben();
        
        // Gesamtanzahl der bestellten Türen berechnen.
        int totalStandardTueren = 0;
        int totalPremiumTueren = 0;
    
        for (Bestellung bestellung : fabrik.bestellungen) {
            totalStandardTueren += bestellung.gibAnzahlStandardTueren();
            totalPremiumTueren += bestellung.gibAnzahlPremiumTueren();
        }
        
        // Ausgabe der Gesamtanzahl an bestellten Standard- und Premiumtüren.
        System.out.println("Insgesamt wurden " + totalStandardTueren + " Standardtüren bestellt.");
        System.out.println("Insgesamt wurden " + totalPremiumTueren + " Premiumtüren bestellt.");
        System.out.println();
    }
    
    
    /**
     * Methode, die Übersicht über alle gespeicherten Bestellungen zurückgibt. 
     * Wird für den Test benutzt.
     */
    public ArrayList<Bestellung> gibBestellungen() 
    {
        return bestellungen;
    }
}