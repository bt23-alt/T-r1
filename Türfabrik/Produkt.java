
/**
 * Die Klasse Produkt enthält Methoden, um den aktuellen Zustand des Produktes abzufragen 
 * und den Zustand eines Produktes zu ändern.
 * 
 * @author Gruppe 08
 * @version 1.0
 */
public class Produkt 
{
    /** Variable zustand gibt den Zustand des bestellten Produktes an
    * Mögliche Zustände: 
    * 0: Bestellt
    * 1: In Produktion 
    * 2: Bereit für Auslieferung 
    * 3: Ausgeliefert
    */
    // Zustand gibt den derzeitigen Fertigungszustand eines Produktes an.
    private int zustand; // default 0, sonst 1, 2, oder 3

    /**
     * Konstruktor für Objekte der Klasse Produkt
     * 
     * @param derZustand gibt den Fertigungszustand eines Produktes an.
     */
    public Produkt()
    {
        this.zustand = 0;
        // if-Methode, die überprüft, dass Zustand positiv sein soll.
        if (zustand < 0) {
            System.out.println("Der Zustand darf nicht negativ sein.");
        }
        else {
            this.zustand = zustand;
        }
    }

    /**
     * Diese Methode ändert den Zustand des Produkts.
     * 
     * @param neuerZustand gibt den neuen Fertigungszustand eines Produktes an.
     */
    public void zustandAendern(int neuerZustand) 
    {
        // if-Methode, die überprüft, dass Zustand positiv sein soll.
        if (neuerZustand < 0) {
            System.out.println("Der Zustand darf nicht negativ sein.");
        }
        else {
            this.zustand = neuerZustand;
        }
    }
    
    /**
     * Diese Methode gibt den aktuellen Zustand des Produkts zurück.
     * 
     * @return zustand Zustand des Produkts wird ausgegeben
     */
    public int aktuellerZustand() 
    {
        return zustand;
    }
}
