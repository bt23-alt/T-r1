
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Die Test-Klasse ProduktTest.
 *
 * @author Gruppe 08
 * @version 1.0
 */
public class ProduktTest
{
    private Produkt produkt1;
    
    /**
     * Konstruktor fuer die Test-Klasse ProduktTest
     */
    public ProduktTest()
    {
    }

    /**
     * Setzt das Testgerüst fuer den Test.
     * Wird vor jeder Testfall-Methode aufgerufen.
     * Jeder Test wird vor dem Start angekündigt.
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
     * Wird nach jeder Testfall-Methode aufgerufen.
     * Nachricht bestätigt, dass Test zu Ende ist.
     */
    @AfterEach
    public void tearDown()
    {
        // Setze das Produkt auf null
        produkt1 = null;
        System.out.println("Testlauf Produkt Ende");
        System.out.println("------------------------");
    }
    
    @Test
    public void testAktuellerZustand() 
    {
        // Arrange: Ein Produkt mit dem Zustand 1 wird erstellt.
        produkt1 = new Produkt();
        
        // Act: Aktueller Zustand soll auf Konsole angezeigt werden.
        produkt1.aktuellerZustand();
        
        // Assert: Überprüfen, ob der aktuelle Zustand korrekt ist
        // Der aktuelle Zustand sollte 0 sein.
        assertEquals(0, produkt1.aktuellerZustand());
    }
    
    @Test
    public void testZustandAendern() 
    {
        // Arrange: Ein neues Produkt wird erstellt.
        produkt1 = new Produkt();
        
        // Act: Ändere den Zustand des Produkts auf 3.
        produkt1.zustandAendern(3);
        
        // Assert: Überprüfen, ob der geänderte Zustand korrekt gespeichert wurde.
        // Der aktuelle Zustand sollte jetzt 3 sein.
        assertEquals(3, produkt1.aktuellerZustand());
    }
}
