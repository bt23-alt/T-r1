
/**
 * Die Klasse Standardtuer gibt an, welche Spezifikationen die Standardtür hat. 
 * Zudem hat die Klasse die Get-Methoden, um diese Variablen abzufragen.
 * 
 * @author Gruppe 08
 * @version 1.0
 */
public class Standardtuer extends Produkt
{
    // Die Instanzvariablen geben die Produktspezifikationen der Standardtür an.
    private static final int HOLZEINHEITEN = 2;
    private static final int SCHRAUBEN = 10;
    private static final int FARBEINHEITEN = 2;
    private static final int KARTONEINHEITEN = 1;
    private static final int PRODUKTIONSZEIT = 10;
    
    /**
     * Konstruktor für Objekte der Klasse Standardtuer, 
     * wo die Spezifikationen strikt laut der Angabe vorgegeben sind.
     * Zustand wird von der Klasse Produkt geerbt.
     * 
     * @param zustand gibt den Zustand einer Standardtür an.
     */
    public Standardtuer(int zustand)
    {
        // Zustand wird von der Klasse Produkt geerbt.
        super(zustand);
    }
    
    /**
     * Methode "gibEinheitenPremium" gibt an, welche genaue Anzahl an Holzeinheiten, 
     * Schrauben, Glaseinheiten, Farbeinheiten, Kartoneinheiten benötigt werden.
     * und wie lange die Produktionszeit für die Standardtür ist.
     */
    public void gibEinheitenStandard()
    {
        System.out.println("Die Standardtür benötigt die folgenden Materialen: ");
        System.out.println("Holz: " + HOLZEINHEITEN + " Einheiten");
        System.out.println("Schrauben: " + SCHRAUBEN + " Einheiten");
        System.out.println("Farbe: " + FARBEINHEITEN + " Einheiten");
        System.out.println("Karton: " + KARTONEINHEITEN + " Einheit");
        System.out.println(" ");
        System.out.println("Die Produktionszeit beträgt " + PRODUKTIONSZEIT + " Minuten.");
    }
    
    /**
     * Methode "gibHolzeinheiten" fragt ab, welche Menge an Holzeinheiten benötigt wird.
     */
    public int gibHolzeinheiten()
    {
        // tragen Sie hier den Code ein
        return HOLZEINHEITEN;
    }
    
    /**
     * Methode "gibSchrauben" fragt ab, welche Menge an Schrauben benötigt wird.
     */
    public int gibSchrauben()
    {
        // tragen Sie hier den Code ein
        return SCHRAUBEN;
    }
    
    /**
     * Methode "gibFarbeinheiten" fragt ab, welche Menge an Farbeinheiten benötigt wird.
     */
    public int gibFarbeinheiten()
    {
        // tragen Sie hier den Code ein
        return FARBEINHEITEN;
    }
    
    /**
     * Methode "gibKartoneinheiten" fragt ab, welche Menge an Kartoneinheiten benötigt wird.
     */
    public int gibKartoneinheiten()
    {
        // tragen Sie hier den Code ein
        return KARTONEINHEITEN;
    }
    
    /**
     * Methode "gibProduktionsZeit" fragt ab, wie Lange die Produktionszeit ist.
     */
    public int gibProduktionsZeit()
    {
        // tragen Sie hier den Code ein
        return PRODUKTIONSZEIT;
    }
}
