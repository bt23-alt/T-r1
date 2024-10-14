
/**
 * Beschreiben Sie hier die Klasse Produkt.
 * Die Klasse Produkt gibt an, um welches Produkt es sich handelt - Premium- oder Standardtür. 
 * Die Klasse hat Methoden, um den aktuellen Zustand des Produktes abzufragen und
 * den Zustand eines Produktes zu ändern.
 * @Gruppe 08
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
        zustand = derZustand;
    }

    /**
     * Diese Methode ändert den Zustand des Produkts.
     */
    public void zustandAendern(int neuerZustand) {
        this.zustand = neuerZustand;
    }
    /**
     * Diese Methode gibt den aktuellen Zustand des Produkts zurück.
     */
    public int aktuellerZustand() {
    return zustand;
    }
}
