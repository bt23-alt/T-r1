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
    private int beschaffungsZeit;
    // Wieviele Standardtüren sind in einer Bestellung enhtalten.
    private int anzahlStandardTueren;
    // Wieviele Premiumtüren sind in einer Bestellung enhtalten.
    private int anzahlPremiumTueren;
    // Welche Bestellungsnummer hat die Bestellung.
    private int bestellungsNr;
    
    /**
     * Konstruktor für Objekte der Klasse Bestellung.
     * 
     * @param standardTueren Anzahl der bestellten Standardtüren.
     * @param premiumTueren Anzahl der bestellten Premiumtüren.
     * @param bestellungsNr Bestellungsnummer für die spezifische Bestellung.
     */
    public Bestellung(int anzahlStandardTueren, int anzahlPremiumTueren, int bestellungsNr)
    {
        // Neue Bestellung mit Instanzvariablen wird initialisiert.
        this.bestellteProdukte = new ArrayList<Produkt>();
        this.bestellBestaetigung = false;
        this.beschaffungsZeit = 0;
        this.anzahlStandardTueren = anzahlStandardTueren;
        this.anzahlPremiumTueren = anzahlPremiumTueren;
        this.bestellungsNr = bestellungsNr;
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
     */
    public int gibBeschaffungsZeit()
    {
        return beschaffungsZeit;
    }
    
    /**
     * Methode, um BestellungsNr auszugeben.
     */
    public int gibBestellungsNr()
    {
         return bestellungsNr;
    }
    
    /**
     * Methode, um die Anzahl der Standardtüren auszugeben.
     */
    public int gibAnzahlStandardTueren()
    {
        return anzahlStandardTueren;
    }
    
    /**
     * Methode, um die Anzahl der Premiumtüren auszugeben.
     */
     public int gibAnzahlPremiumTueren()
    {
        return anzahlPremiumTueren;
    }
}