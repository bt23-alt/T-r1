
/**
 * Die Klasse Produkt enthält Methoden, um den aktuellen Zustand des Produktes abzufragen 
 * und den Zustand eines Produktes zu ändern.
 * 
 * @author Gruppe 08
 * @version 1.0
 */
public class Produkt 
{
    // Zustand gibt den derzeitigen Fertigungszustand eines Produktes an.
    private int zustand;

    /**
     * Konstruktor für Objekte der Klasse Produkt
     * 
     * @param derZustand gibt den Fertigungszustand eines Produktes an.
     */
    public Produkt(int derZustand)
    {
        // if-Methode, die überprüft, dass Zustand positiv sein soll.
        if (derZustand < 0) {
            System.out.println("Der Zustand darf nicht negativ sein.");
        }
        else {
            this.zustand = derZustand;
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
     */
    public int aktuellerZustand() 
    {
        return zustand;
    }
}
