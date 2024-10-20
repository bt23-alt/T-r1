
/**
 * Beschreiben Sie hier die Klasse Premiumtuer.
 * Die Klasse Premiumtür gibt an, welche Spezifikationen die Premiumtür hat. 
 * Und sie hat die Get-Methoden, um diese Variablen abzufragen.
 * @Gruppe 08
 * @version 1.0
 */
public class Premiumtuer extends Produkt
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int holzeinheiten;
    private int schrauben;
    private int glaseinheiten;
    private int farbeinheiten;
    private int kartoneinheiten;
    private int produktionsZeit;

    /**
     * Konstruktor für Objekte der Klasse Premiumtuer, wo die Spezifikationen individuell angepasst werden können.
     */
    public Premiumtuer(int holzeinheiten, int schrauben, int glaseinheiten, int farbeinheiten, int kartoneinheiten, int produktionsZeit)
    {
        // Instanzvariable initialisieren
        super(0);
        this.holzeinheiten = holzeinheiten;
        this.schrauben = schrauben;
        this.glaseinheiten = glaseinheiten;
        this.farbeinheiten = farbeinheiten;
        this.kartoneinheiten = kartoneinheiten;
        this.produktionsZeit = produktionsZeit;
    }
    
    /**
     * Konstruktor für Objekte der Klasse Premiumtuer, wo die Spezifikationen strikt laut der Angabe angegeben sind.
     */
    public Premiumtuer()
    {
        // Instanzvariable initialisieren
        super(0);
        this.holzeinheiten = 4;
        this.schrauben = 5;
        this.glaseinheiten = 5;
        this.farbeinheiten = 1;
        this.kartoneinheiten = 5;
        this.produktionsZeit = 30;
    }
    
    /**
     * Methode "gibEinheitenPremium" gibt an, welche genaue Anzahl an Holzeinheiten, Schrauben, Glaseinheiten, Farbeinheiten, Kartoneinheiten benötigt wird
     * und wie lange die Produktionszeit für die Premiumtürist.
     */
    public void gibEinheitenPremium()
    {
        // tragen Sie hier den Code ein
        System.out.println("Die Premiumtür benötigt die folgenden Materialen: ");
        System.out.println("Holz: " + holzeinheiten + " Einheiten");
        System.out.println("Schrauben: " + schrauben + " Einheiten");
        System.out.println("Glas: " + glaseinheiten + " Einheiten");
        System.out.println("Farbe: " + farbeinheiten + " Einheit");
        System.out.println("Karton: " + kartoneinheiten + " Einheiten");
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
     * Methode "gibGlaseinheiten" fragt ab, welche Menge an Holzeinheiten benötigt wird
     */
    public int gibGlaseinheiten()
    {
        // tragen Sie hier den Code ein
        return glaseinheiten;
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
