
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Die Test-Klasse ProduktTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ProduktTest
{
    private Produkt produkt;
    
    /**
     * Konstruktor fuer die Test-Klasse ProduktTest
     */
    public ProduktTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @BeforeEach
    public void setUp()
    {
        // Initialisiere einen ProduktTest
        System.out.println("Testlauf Produkt Start");
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
        // Setze das Produkt auf null
        produkt = null;
        System.out.println();
        System.out.println("Testlauf Produkt Ende");
        System.out.println("------------------------");
    }
    
    @Test
    public void testAktuellerZustand() {
        produkt = new Produkt(1);
        // Überprüfen, ob der aktuelle Zustand korrekt ist
        assertEquals(1, produkt.aktuellerZustand(), "Der aktuelle Zustand sollte 1 sein.");
    }
    
    @Test
    public void testZustandAendern() {
        produkt = new Produkt(1);
        // Ändere den Zustand des Produkts und überprüfe
        produkt.zustandAendern(3);
        
        assertEquals(3, produkt.aktuellerZustand(), "Der aktuelle Zustand sollte jetzt 3 sein.");
    }
}
