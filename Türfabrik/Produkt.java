
/**
 * Die Klasse Produkt enthält Methoden, um den aktuellen Zustand des Produktes abzufragen 
 * und den Zustand eines Produktes zu ändern.
 * @author Gruppe 08
 * @version 1.0
 */
public class Produkt 
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int zustand;

    /**
     * Konstruktor für Objekte der Klasse Produkt
     */
    public Produkt(int derZustand)
    {
        // Instanzvariable initialisieren
        if (derZustand < 0) {
            System.out.println("Der Zustand darf nicht negativ sein.");
        }
        else {
            this.zustand = derZustand;
        }
    }

    /**
     * Diese Methode ändert den Zustand des Produkts.
     */
    public void zustandAendern(int neuerZustand) 
    {
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
