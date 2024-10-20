
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Die Test-Klasse BestellungTest.
 *
 * @author  Gruppe 08
 * @version 1.0
 */
public class BestellungTest
{
     private Bestellung bestellung;
     
    /**
     * Konstruktor fuer die Test-Klasse BestellungTest
     */
    public BestellungTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @BeforeEach
    public void setUp()
    {
        // Initialisiere eine Bestellung mit 3 Standardtüren und 2 Premiumtüren, Bestellnummer 45
        bestellung = new Bestellung(3, 2, 45);
        System.out.println("Testlauf Bestellung Start");
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
        bestellung = null;  // Setze die Bestellung auf null
        System.out.println();
        System.out.println("Testlauf Bestellung Ende");
        System.out.println("------------------------");
    }
    
     @Test
    public void testBestellungsNr() {
        // Überprüfen, ob die Bestellnummer korrekt ist
        assertEquals(45, bestellung.gibBestellungsNr(), "Die Bestellnummer sollte 45 sein.");
    }
    
    @Test
    public void testAnzahlStandardTueren() {
        // Überprüfen, ob die Anzahl der Standardtüren korrekt ist
        assertEquals(3, bestellung.gibAnzahlStandardTueren(), "Die Anzahl der Standardtüren sollte 3 sein.");
    }

    @Test
    public void testAnzahlPremiumTueren() {
        // Überprüfen, ob die Anzahl der Premiumtüren korrekt ist
        assertEquals(2, bestellung.gibAnzahlPremiumTueren(), "Die Anzahl der Premiumtüren sollte 2 sein.");
    }

    @Test
    public void testBestellungBestaetigen() {
        // Bestelle bestätigen und überprüfen
        bestellung.bestellungBestaetigen();
        assertTrue(bestellung.gibBestellBestaetigung(), "Die Bestellung sollte bestätigt sein.");
    }

    @Test
    public void testBeschaffungsZeit() {
        // Beschaffungszeit setzen und überprüfen
        bestellung.setzeBeschaffungsZeit(5);
        assertEquals(5, bestellung.gibBeschaffungsZeit(), "Die Beschaffungszeit sollte 5 sein.");
    }
}
