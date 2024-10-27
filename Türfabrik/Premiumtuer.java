
/**
 * Die Klasse Premiumtuer gibt an, welche Spezifikationen die Premiumtür hat. 
 * Zudem hat die Klasse die Get-Methoden, um diese Variablen abzufragen.
 * 
 * @author Gruppe 08
 * @version 1.0
 */
public class Premiumtuer extends Produkt
{
    // Die Instanzvariablen geben die Produktspezifikationen der Premiumtür an.
    private static final int HOLZEINHEITEN = 4;
    private static final int SCHRAUBEN = 5;
    private static final int GLASEINHEITEN = 5;
    private static final int FARBEINHEITEN = 1;
    private static final int KARTONEINHEITEN = 5;
    private static final int PRODUKTIONSZEIT = 30;

    /**
     * Konstruktor für Objekte der Klasse Premiumtür, 
     * wo die Spezifikationen strikt laut Angabe vorgegeben sind.
     * Zustand wird von der Klasse Produkt geerbt.
     * 
     * @param zustand gibt den Zustand einer Premiumtür an.
     */
    public Premiumtuer(int zustand)
    {
        // Zustand wird von der Klasse Produkt geerbt.
        super(zustand);
    }
    
    /**
     * Methode "gibEinheitenPremium" gibt an, welche genaue Anzahl an Holzeinheiten, 
     * Schrauben, Glaseinheiten, Farbeinheiten, Kartoneinheiten benötigt werden.
     * und wie lange die Produktionszeit für die Premiumtür ist.
     */
    public void gibEinheitenPremium()
    {
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
     * Methode "gibProduktionsZeit" fragt ab, wie lange die Produktionszeit ist.
     */
    public int gibProduktionsZeit()
    {
        // tragen Sie hier den Code ein
        return PRODUKTIONSZEIT;
    }
}
