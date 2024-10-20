
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Die Test-Klasse FabrikTest.
 * 
 * @author  Gruppe 08
 * @version 1.0
 */
public class FabrikTest
{
    private Fabrik fabrik;
    
    /**
     * Konstruktor fuer die Test-Klasse FabrikTest.
     */
    public FabrikTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     * Wird vor jeder Testfall-Methode aufgerufen.
     * Vor jedem Test wird eine neue ArrayList Fabrik erstellt.
     */
    @BeforeEach
    public void setUp() {
        // Initialisiere Eine neue Instanz von Fabrik
        fabrik = new Fabrik();
        System.out.println("Testlauf Fabrik Start");
        System.out.println();
    }
    
    /**
     * Gibt das Testgerüst wieder frei.
     * Wird nach jeder Testfall-Methode aufgerufen.
     * Nachricht bestätigt, dass Test zu Ende ist.
     */
    @AfterEach
    public void tearDown()
    {
        System.out.println();
        System.out.println("Testlauf Fabrik Ende");
        System.out.println("------------------------");
    }
    
    @Test
    public void testBestellungsNummer() {
        // Arrange: 2 Bestellungen werden in der Fabrik aufgenommen
        fabrik.bestellungAufgeben(3, 4);
        fabrik.bestellungAufgeben(1,2);
        
        // Act: Die BestellungsNummern der beiden Bestellungen werden abgerufen.
        Bestellung ersteBestellung = fabrik.getBestellungen().get(0);  
        Bestellung zweiteBestellung = fabrik.getBestellungen().get(1);

        // Assert: BestellungsNummern werden überprüft.
        // Bestellung 1: Bestellnummer sollte 1 sein.
        // Bestellung 2: Bestellungsnummer sollte 2 sein.
        assertEquals(1, ersteBestellung.gibBestellungsNr()); 
        assertEquals(2, zweiteBestellung.gibBestellungsNr());
    }
    
    @Test
    public void testBestellungAufnehmenBeiNullOderNegativ() {
        // Arrange: Versuche, eine Bestellung mit ungültigen Werten aufzugeben
        // Version1: Beide Werte sind negativ.
        fabrik.bestellungAufgeben(-2, -1);
        // Version2: Beide Werte sind gleich 0.
        fabrik.bestellungAufgeben(0, 0); 
        // Version3: Anzahl fuer Standardtueren ist positiv und Anzahl von Premiumtueren ist negativ.
        fabrik.bestellungAufgeben(1, -2);
        // Version4: Anzahl fuer Standartueren ist neagtiv und Anzahl von Premiumtueren ist positiv.
        fabrik.bestellungAufgeben(-1, 3);
    
        // Act: Bestellungen werden auf Konsole ausgegeben.
        // Erwarte leere Ausgabe
        fabrik.bestellungAusgeben();
    
        // Assert: Überpfüe die Ausgabe von keinen Bestellungen
        //Keine der Bestellung sollte aufgenommen werden, da mindestens einer der Werte der Bestellung ungültig ist.
        assertTrue(fabrik.getBestellungen().isEmpty());
    }
}

