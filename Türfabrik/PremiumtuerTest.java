
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Die Test-Klasse PremiumtuerTest.
 *
 * @author Gruppe 08
 * @version 1.0
 */
public class PremiumtuerTest
{
    private Premiumtuer premiumtuer;
    
    /**
     * Konstruktor für die Test-Klasse PremiumtuerTest.
     */
    public PremiumtuerTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
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
        // Arrange: Erstelle eine neue Premiumtür mit dem Zustand 1.
        premiumtuer = new Premiumtuer(1);
        
        // Act: Ändere den Zustand auf 2.
        premiumtuer.zustandAendern(2);
        
        // Assert: Zustand für die Premiumtür sollte sich nun auf 2 erhöht haben.
        assertEquals(2, premiumtuer.aktuellerZustand());
    }
    
    @Test
    public void testKonstanteVariablen() 
    {
        // Arrange: Erstelle zwei neue Premiumtüren mit den Zuständen 3 sowie 5.
        Premiumtuer premiumtuer1 = new Premiumtuer(3);
        Premiumtuer premiumtuer2 = new Premiumtuer(5);
        
        // Act: Gebe die Einheiten der beiden Premiumtüren aus.
        premiumtuer1.gibEinheitenPremium();
        premiumtuer2.gibEinheitenPremium();
        
        // Assert: Premiumtür 1 sollte die kontanten Instanzvariablen haben.
        assertEquals(3, premiumtuer1.aktuellerZustand());
        assertEquals(4, premiumtuer1.gibHolzeinheiten());
        assertEquals(5, premiumtuer1.gibSchrauben());
        assertEquals(5, premiumtuer1.gibGlaseinheiten());
        assertEquals(1, premiumtuer1.gibFarbeinheiten());
        assertEquals(5, premiumtuer1.gibKartoneinheiten());
        assertEquals(30, premiumtuer1.gibProduktionsZeit());
        
        // Assert: Premiumtür 2 sollte dieselben kontanten Instanzvariablen haben.
        // Nur der Zustand sollte verschieden sein.
        assertEquals(5, premiumtuer2.aktuellerZustand());
        assertEquals(4, premiumtuer2.gibHolzeinheiten());
        assertEquals(5, premiumtuer2.gibSchrauben());
        assertEquals(5, premiumtuer2.gibGlaseinheiten());
        assertEquals(1, premiumtuer2.gibFarbeinheiten());
        assertEquals(5, premiumtuer2.gibKartoneinheiten());
        assertEquals(30, premiumtuer2.gibProduktionsZeit());
    }
}
