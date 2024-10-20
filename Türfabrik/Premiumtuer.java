
/**
 * Die Klasse Premiumtuer gibt an, welche Spezifikationen die Premiumtür hat. 
 * Zudem hat die Klasse die Get-Methoden, um diese Variablen abzufragen.
 * @author Gruppe 08
 * @version 1.0
 */
public class Premiumtuer extends Produkt
{
    // Die Instanzvariablen geben die Produktspezifikationen der Premiumtuer an.
    private static final int HOLZEINHEITEN = 4;
    private static final int SCHRAUBEN = 5;
    private static final int GLASEINHEITEN = 5;
    private static final int FARBEINHEITEN = 1;
    private static final int KARTONEINHEITEN = 5;
    private static final int PRODUKTIONSZEIT = 30;

    /**
     * Konstruktor für Objekte der Klasse Premiumtuer, 
     * wo die Spezifikationen strikt laut der Angabe angegeben sind.
     * Zustand wird von der Klasse Produkt vererbt.
     */
    public Premiumtuer(int zustand)
    {
        // Instanzvariable initialisieren
        super(zustand);
    }
    
    /**
     * Methode "gibEinheitenPremium" gibt an, welche genaue Anzahl an Holzeinheiten, 
     * Schrauben, Glaseinheiten, Farbeinheiten, Kartoneinheiten benötigt wird
     * und wie lange die Produktionszeit für die Premiumtuer ist.
     */
    public void gibEinheitenPremium()
    {
        // tragen Sie hier den Code ein
        System.out.println("Die Premiumtür benötigt die folgenden Materialen: ");
        System.out.println("Holz: " + HOLZEINHEITEN + " Einheiten");
        System.out.println("Schrauben: " + SCHRAUBEN + " Einheiten");
        System.out.println("Glas: " + GLASEINHEITEN + " Einheiten");
        System.out.println("Farbe: " + FARBEINHEITEN + " Einheit");
        System.out.println("Karton: " + KARTONEINHEITEN + " Einheiten");
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
     * Methode "gibGlaseinheiten" fragt ab, welche Menge an Glaseinheiten benötigt wird.
     */
    public int gibGlaseinheiten()
    {
        // tragen Sie hier den Code ein
        return GLASEINHEITEN;
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
