
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
     * Setzt das Testgerüst fuer den Test.
     * Wird vor jeder Testfall-Methode aufgerufen.
     * Vor jedem Test wird eine Bestellung von 3 Standardtueren, und 2 Premiumtueren, 
     * mit der Bestellungsnummer 45 erstellt.
     */
    @BeforeEach
    public void setUp()
    {
        // Initialisiert eine Bestellung mit 3 Standardtüren und 2 Premiumtüren, Bestellnummer 45
        bestellung = new Bestellung(3, 2, 45);
        System.out.println("Testlauf Bestellung Start");
        System.out.println();
    }

    /**
     * Gibt das Testgerüst wieder frei.
     * Wird nach jeder Testfall-Methode aufgerufen.
     * Nach jedem Test wird die ArrayList Bestellung auf null gesetzt.
     */
    @AfterEach
    public void tearDown()
    {
        // Setze die Bestellung auf null
        bestellung = null;  
        System.out.println();
        System.out.println("Testlauf Bestellung Ende");
        System.out.println("------------------------");
    }
    
     @Test
    public void testBestellungsNr() {
        // Act: Gib die BestellungsNr aus.
        bestellung.gibBestellungsNr();
        
        // Assert: Überprüfen, ob die Bestellnummer korrekt ist.
        // Die Bestellnummer sollte 45 sein.
        assertEquals(45, bestellung.gibBestellungsNr());
    }
    
    @Test
    public void testAnzahlStandardTueren() {
        // Act: Gib die Anzahl der Standardtueren aus.
        bestellung.gibAnzahlStandardTueren();
        
        // Assert: Überprüfen, ob die Anzahl der Standardtüren korrekt ist.
        // Die Anzahl der Standardtüren sollte 3 sein.
        assertEquals(3, bestellung.gibAnzahlStandardTueren());
    }

    @Test
    public void testAnzahlPremiumTueren() {
        // Act: Gib die Anzahl der Standardtueren aus.
        bestellung.gibAnzahlPremiumTueren();
        
        // Assert: Überprüfen, ob die Anzahl der Premiumtüren korrekt ist.
        // Die Anzahl der Premiumtüren sollte 2 sein.
        assertEquals(2, bestellung.gibAnzahlPremiumTueren());
    }

    @Test
    public void testBestellungBestaetigen() {
        // Act: Bestellung wird bestätigt.
        bestellung.bestellungBestaetigen();
        
        // Assert: Die Bestellung sollte bestätigt sein.
        assertTrue(bestellung.gibBestellBestaetigung());
    }

    @Test
    public void testBeschaffungsZeit() {
        // Act: Beschaffungszeit wird gesetzt.
        bestellung.setzeBeschaffungsZeit(5);
        
        // Assert: Überpüfen, ob die Beschaffungszeit gespeichert wurde.
        // Die Beschaffungszeit sollte 5 sein.
        assertEquals(5, bestellung.gibBeschaffungsZeit());
    }
}
