import java.util.ArrayList;
/**
 * In der Klasse Bestellung wird vorgegeben, wie Kundenbestellungen aussehen
 * Sie enthält die bestellten Produkte, ihren Typen und ihre Anzahl, Bestellnummer und Beschaffungszeit
 * @Gruppe 08
 * @version 1.0
 */
public class Bestellung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Produkt> bestellteProdukte;
    // ArrayList mit Übersicht der insgesamt bestellten StandardTueren und PremiumTueren
    private boolean bestellBestaetigung;
    // False, falls keine Bestellung bestätigt, ansonsten true
    private int beschaffungsZeit;
    // Beschaffungszeit
    private int anzahlStandardTueren;
     // Wieviele StandardTueren sind in einer Bestellung enhtalten
    private int anzahlPremiumTueren;
     // Wieviele PremiumTueren sind in einer Bestellung enhtalten
    private int bestellungsNr;
    // Welche Bestellungsnummer hat die Bestellung
    /**
     * Konstruktor für Objekte der Klasse Bestellung
     */
    public Bestellung(int anzahlStandardTueren, int anzahlPremiumTueren, int bestellungsNr)
    {
        // Instanzvariable initialisieren
        this.bestellteProdukte = new ArrayList<Produkt>();
        this.bestellBestaetigung = false;
        this.beschaffungsZeit = 0;
        this.anzahlStandardTueren = anzahlStandardTueren;
        this.anzahlPremiumTueren = anzahlPremiumTueren;
        this.bestellungsNr = bestellungsNr;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     */
    public void bestellungBestaetigen()
    {
        this.bestellBestaetigung = true;
    }
    
    public boolean gibBestellBestaetigung()
    {
        return this.bestellBestaetigung;
    }
    
    public void setzeBeschaffungsZeit(int zeit)
    {
        this.beschaffungsZeit = zeit;
    }
    
    public int gibBeschaffungsZeit()
    {
        return beschaffungsZeit;
    }
    
    public int gibBestellungsNr()
    {
         return bestellungsNr;
    }
    
    public int gibAnzahlStandardTueren()
    {
        return anzahlStandardTueren;
    }
    
     public int gibAnzahlPremiumTueren()
    {
        return anzahlPremiumTueren;
    }
}