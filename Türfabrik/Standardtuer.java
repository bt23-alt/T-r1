
/**
 * Die Klasse Standardtuer gibt an, welche Spezifikationen die Standardtür hat. 
 * Zudem hat die Klasse die Get-Methoden, um diese Variablen abzufragen.
 * @author Gruppe 08
 * @version 1.0
 */
public class Standardtuer extends Produkt
{
    // Die Instanzvariablen geben die Produktspezifikationen der Standardtuer an.
    private static final int HOLZEINHEITEN = 2;
    private static final int SCHRAUBEN = 10;
    private static final int FARBEINHEITEN = 2;
    private static final int KARTONEINHEITEN = 1;
    private static final int PRODUKTIONSZEIT = 10;
    
    /**
     * Konstruktor für Objekte der Klasse Standardtuer, 
     * wo die Spezifikationen strikt laut der Angabe angegeben sind.
     * Zustand wird von der Klasse Produkt vererbt.
     */
    public Standardtuer(int zustand)
    {
        // Instanzvariable initialisieren
        super(zustand);
    }
    
    /**
     * Methode "gibEinheitenPremium" gibt an, welche genaue Anzahl an Holzeinheiten, 
     * Schrauben, Glaseinheiten, Farbeinheiten, Kartoneinheiten benötigt werden.
     * und wie lange die Produktionszeit für die Standardtuer ist.
     */
    public void gibEinheitenStandard()
    {
        // tragen Sie hier den Code ein
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
