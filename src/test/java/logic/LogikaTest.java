package logic;

import junit.framework.TestCase;
import org.junit.Test;

public class LogikaTest extends TestCase{
    Logika logika = new Logika();

    public void testScitani() {
        assertEquals(489.0, logika.scitani(420, 69));
        assertEquals(59.0, logika.scitani(-10, 69));
        assertEquals(100.0, logika.scitani(50, 50));
    }

    public void testOdecitani() {
        assertEquals(351.0, logika.odecitani(420, 69));
        assertEquals(0.0, logika.odecitani(1, 1));
        assertEquals(-2.0, logika.odecitani(1, 3));
    }

    public void testNasobeni() {
        assertEquals(28980.0, logika.nasobeni(420, 69));
        assertEquals(10000.0, logika.nasobeni(100, 100));
        assertEquals(4.0, logika.nasobeni(2, 2));
    }

    public void testDeleni() {
        assertEquals(21.0, logika.deleni(420, 20));
        assertEquals(0.0, logika.deleni(420, 0));
        assertEquals(42069.0, logika.deleni(420690, 10));
    }

    public void testMocniny() {
        assertEquals(400.0, logika.mocnina(20, 2));
        assertEquals(144.0, logika.mocnina(12, 2));
        assertEquals(729.0, logika.mocnina(9, 3));
    }

    public void testFaktorialu() {
        assertEquals(3628800.0, logika.faktorial(10));
        assertEquals(120.0, logika.faktorial(5));
        assertEquals(6.0, logika.faktorial(3));
    }
    }

