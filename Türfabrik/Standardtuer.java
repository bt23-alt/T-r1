
/**
 * Beschreiben Sie hier die Klasse Standardtür.
 * Die Klasse Standardtür gibt an, welche Spezifikationen die Standardtür hat. 
 * Und sie hat die Get-Methoden, um diese Variablen abzufragen.
 * @Gruppe 08
 * @version 1.0
 */
public class Standardtuer extends Produkt
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int holzeinheiten;
    private int schrauben;
    private int farbeinheiten;
    private int kartoneinheiten;
    private int produktionsZeit;

    /**
     * Konstruktor für Objekte der Klasse Premiumtuer, wo die Spezifikationen individuell angepasst werden können.
     */
    public Standardtuer(int holzeinheiten, int schrauben, int farbeinheiten, int kartoneinheiten, int produktionsZeit)
    {
        // Instanzvariable initialisieren
        super(0);
        this.holzeinheiten = holzeinheiten;
        this.schrauben = schrauben;
        this.farbeinheiten = farbeinheiten;
        this.kartoneinheiten = kartoneinheiten;
        this.produktionsZeit = produktionsZeit;
    }
    
    /**
     * Konstruktor für Objekte der Klasse Premiumtuer, wo die Spezifikationen strikt laut der Angabe angegeben sind.
     */
    public Standardtuer()
    {
        // Instanzvariable initialisieren
        super(0);
        this.holzeinheiten = 2;
        this.schrauben = 10;
        this.farbeinheiten = 2;
        this.kartoneinheiten = 1;
        this.produktionsZeit = 10;
    }
    
    /**
     * Methode "gibEinheitenPremium" gibt an, welche genaue Anzahl an Holzeinheiten, Schrauben, Glaseinheiten, Farbeinheiten, Kartoneinheiten benötigt wird
     * und wie lange die Produktionszeit für die Premiumtürist.
     */
    public void gibEinheitenStandard()
    {
        // tragen Sie hier den Code ein
        System.out.println("Die Standardtür benötigt die folgenden Materialen: ");
        System.out.println("Holz: " + holzeinheiten + " Einheiten");
        System.out.println("Schrauben: " + schrauben + " Einheiten");
        System.out.println("Farbe: " + farbeinheiten + " Einheiten");
        System.out.println("Karton: " + kartoneinheiten + " Einheit");
        System.out.println("Die Produktionszeit beträgt " + produktionsZeit + " Minuten.");
    }
    
    /**
     * Methode "gibHolzeinheiten" fragt ab, welche Menge an Holzeinheiten benötigt wird
     */
    public int gibHolzeinheiten()
    {
        // tragen Sie hier den Code ein
        return holzeinheiten;
    }
    /**
     * Methode "gibSchrauben" fragt ab, welche Menge an Holzeinheiten benötigt wird
     */
    public int gibSchrauben()
    {
        // tragen Sie hier den Code ein
        return schrauben;
    }
    /**
     * Methode "gibFarbeinheiten" fragt ab, welche Menge an Holzeinheiten benötigt wird
     */
    public int gibFarbeinheiten()
    {
        // tragen Sie hier den Code ein
        return farbeinheiten;
    }
    /**
     * Methode "gibKartoneinheiten" fragt ab, welche Menge an Holzeinheiten benötigt wird
     */
    public int gibKartoneinheiten()
    {
        // tragen Sie hier den Code ein
        return kartoneinheiten;
    }
    /**
     * Methode "gibProduktionsZeit" fragt ab, welche Menge an Holzeinheiten benötigt wird
     */
    public int gibProduktionsZeit()
    {
        // tragen Sie hier den Code ein
        return produktionsZeit;
    }
}
