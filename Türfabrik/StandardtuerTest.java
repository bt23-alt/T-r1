

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Die Test-Klasse StandardtuerTest.
 *
 * @author  Gruppe 08
 * @version 1.0
 */
public class StandardtuerTest
{
    private Standardtuer standardtuer;
    
    /**
     * Konstruktor für die Test-Klasse StandardtuerTest.
     */
    public StandardtuerTest()
    {
    }

    /**
     * Setzt das Testgerüst für den Test.
     * Wird vor jeder Testfall-Methode aufgerufen.
     * Jeder Test wird vor dem Start angekündigt.
     */
    @BeforeEach
    public void setUp()
    {
        System.out.println("Testlauf Bestellung Start");
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
        System.out.println("Testlauf Bestellung Ende");
        System.out.println("------------------------");
    }
    
    @Test
    public void testZustandsAenderung() 
    {
        // Arrange: Erstelle eine neue Standardtür mit dem Zustand 3.
        standardtuer = new Standardtuer(3);
        
        // Act: Ändere den Zustand auf 1.
        standardtuer.zustandAendern(1);
        
        // Assert: Zustand für die Standardtür sollte nun auf 1 sinken.
        assertEquals(1, standardtuer.aktuellerZustand());
    }
    
    @Test
    public void testKonstanteVariablen() 
    {
        // Arrange: Erstelle zwei neue Premiumtüren mit den Zuständen 2 sowie 4.
        Standardtuer standardtuer1 = new Standardtuer(2);
        Standardtuer  standardtuer2 = new Standardtuer(4);
        
        // Act: Gebe die Einheiten der beiden Standardtüren aus.
        standardtuer1.gibEinheitenStandard();
        standardtuer2.gibEinheitenStandard();
        
        // Assert: Standardtür 1 sollte die kontanten Instanzvariablen haben.
        assertEquals(2, standardtuer1.aktuellerZustand());
        assertEquals(2, standardtuer1.gibHolzeinheiten());
        assertEquals(10, standardtuer1.gibSchrauben());
        assertEquals(2, standardtuer1.gibFarbeinheiten());
        assertEquals(1, standardtuer1.gibKartoneinheiten());
        assertEquals(10, standardtuer1.gibProduktionsZeit());
        
        // Assert: Standardtür 2 sollte dieselben kontanten Instanzvariablen haben.
        // Nur der Zustand sollte verschieden sein.
        assertEquals(4, standardtuer2.aktuellerZustand());
        assertEquals(2, standardtuer2.gibHolzeinheiten());
        assertEquals(10, standardtuer2.gibSchrauben());
        assertEquals(2, standardtuer2.gibFarbeinheiten());
        assertEquals(1, standardtuer2.gibKartoneinheiten());
        assertEquals(10, standardtuer2.gibProduktionsZeit());
    }
}