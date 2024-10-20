
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
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
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
        // Bestellung 1: Bestellungsnummer sollte 1 sein
        fabrik.bestellungAufgeben(3, 4);
        Bestellung ersteBestellung = fabrik.getBestellungen().get(0);  // Hole die erste Bestellung
        assertEquals(1, ersteBestellung.gibBestellungsNr());

        // Bestellung 2: Bestellungsnummer sollte 2 sein
        fabrik.bestellungAufgeben(1, 2);
        Bestellung zweiteBestellung = fabrik.getBestellungen().get(1);  // Hole die zweite Bestellung
        assertEquals(2, zweiteBestellung.gibBestellungsNr());
    }
    
    @Test
    public void testBestellungAufnehmenBeiNullOderNegativ() {
        // Act: Versuche, eine Bestellung mit ungültigen Werten aufzugeben
        fabrik.bestellungAufgeben(-2, -1);  // Beide Werte negativ.
        fabrik.bestellungAufgeben(0, 0); //Beide Werte gleich 0.
        fabrik.bestellungAufgeben(1, -2); //Ein Wert negativ und ein Wert positiv
        fabrik.bestellungAufgeben(-1, 3); //Ein Wert negativ und ein Wert positiv
    
        // Assert: Überprüfe die Ausgabe auf keine Bestellungen
        // Erwartete leere Ausgabe
        fabrik.bestellungAusgeben();
    
        //Keine der Bestellung sollte aufgenommen werden, da mindestens einer der Werte der Bestellung ungültig ist.
        assertTrue(fabrik.getBestellungen().isEmpty());
    }
}

