import java.util.ArrayList;

/**
 * In der Klasse Bestellung wird vorgegeben, wie Kundenbestellungen aussehen.
 * Sie enthält die bestellten Produkte, ihren Typen und ihre Anzahl, Bestellnummer und Beschaffungszeit.
 * 
 * @author Gruppe 08
 * @version 1.0
 */
public class Bestellung
{
    // Array Liste mit Übersicht der insgesamt bestellten Standardtüren und Premiumtüren.
    private ArrayList<Produkt> bestellteProdukte;
    // False, falls keine Bestellung bestätigt, ansonsten true.
    private boolean bestellBestaetigung;
    // Beschaffungszeit
    // -1 ist der Initialisierungswert
    private int beschaffungsZeit;
    // Wieviele Standardtüren sind in einer Bestellung enhtalten.
    private int anzahlStandardTueren;
    // Wieviele Premiumtüren sind in einer Bestellung enhtalten.
    private int anzahlPremiumTueren;
    // Welche Bestellungsnummer hat die Bestellung.
    private int bestellungsNr;
    
    /**
     * Konstruktor für Objekte der Klasse Bestellung.
     * Hier werden alle globalen Variablen initialisiert.
     * 
     * @param standardTueren Anzahl der bestellten Standardtüren.
     * @param premiumTueren Anzahl der bestellten Premiumtüren.
     * @param bestellungsNr Bestellungsnummer für die spezifische Bestellung.
     */
    public Bestellung(int anzahlStandardTueren, int anzahlPremiumTueren, int bestellungsNr)
    {
        // Neue Bestellung mit Instanzvariablen wird initialisiert.
        this.bestellungsNr = bestellungsNr;
        this.beschaffungsZeit = -1;
        this.bestellteProdukte = new ArrayList<Produkt>();
        this.bestellBestaetigung = false;
        
        if (anzahlStandardTueren < 0 || anzahlPremiumTueren < 0) {
            throw new IllegalArgumentException("Ungültige Bestellmenge. Kann nicht negativ sein.");
            // System.out.println("Ungültige Bestellmenge. Kann nicht negativ sein.");
        } else if (anzahlStandardTueren == 0 && anzahlPremiumTueren == 0) {
            throw new IllegalArgumentException("Die Bestellung muss mindestens ein Produkt enthalten.");
            // System.out.println("Die Bestellung muss mindestens ein Produkt enthalten.");
        } else if (anzahlStandardTueren > 10_000 || anzahlPremiumTueren > 10_000) {
            throw new IllegalArgumentException("Bestellmenge ist zu gross. Maximal 10 Tausend pro Artikel.");
            // System.out.println("Bestellmenge ist zu gross. Maximal 10 Tausend pro Artikel.");
        } else {
            this.anzahlStandardTueren = anzahlStandardTueren;
            this.anzahlPremiumTueren = anzahlPremiumTueren;
            fuelleBestellteprodukte(anzahlStandardTueren, anzahlPremiumTueren);
        }
    }
    
        /**
     * Mit dieser Methode werden die entsprechenden Standardtüren und Premiumtüren erstellt und zur Liste der Bestellten Produkte hinzugefügt 
     * 
     * @param anzahlStandardTueren Anzahl bestellter Standardtüren
     * @param anzahlPremiumTueren Anzahl bestellter Premiumtüren
     */ 
    private void fuelleBestellteprodukte(int anzahlStandardTueren, int anzahlPremiumTueren) 
    {

        int standardTueren = 0;
        int premiumTueren = 0;

        while (standardTueren < anzahlStandardTueren) {
            bestellteProdukte.add(new Standardtuer());
            standardTueren++; 
        }

        while (premiumTueren < anzahlPremiumTueren) {
            bestellteProdukte.add(new Premiumtuer());
            premiumTueren++; 
        }
    }
    
    /**
     * Methode, um erhaltene Bestellung zu bestätigen.
     */
    public void bestellungBestaetigen()
    {
        this.bestellBestaetigung = true;
    }
    
    /**
     * Methode, um Bestellbestätigung auszugeben.
     * 
     * @return bestellBestaetigung Zustand der Bestellbestätigung
     */
    public boolean gibBestellBestaetigung()
    {
        return this.bestellBestaetigung;
    }
    
    /**
     * Methode, um BeschaffunsZeit zu setzen.
     * 
     * @param zeit gibt Beschaffungszeit für Bestellung an.
     */
    public void setzeBeschaffungsZeit(int zeit)
    {
        this.beschaffungsZeit = zeit;
    }
    
    /**
     * Methode, um BeschaffungsZeit auszugeben.
     * 
     * @return beschaffungsZeit
     */
    public int gibBeschaffungsZeit()
    {
        return beschaffungsZeit;
    }
    
    /**
     * Methode, um BestellungsNr auszugeben.
     * 
     * @return bestellungsNr wird retourniert
     */
    public int gibBestellungsNr()
    {
         return this.bestellungsNr;
    }
    
    /**
     * Methode, um die Anzahl der Standardtüren auszugeben.
     * 
     * @return anzahlStandardTueren wird retourniert
     */
    public int gibAnzahlStandardTueren()
    {
        return this.anzahlStandardTueren;
    }
    
    /**
     * Methode, um die Anzahl der Premiumtüren auszugeben.
     * 
     * @return anzahlPremiumTueren wird retourniert
     */
     public int gibAnzahlPremiumTueren()
    {
        return this.anzahlPremiumTueren;
    }
}