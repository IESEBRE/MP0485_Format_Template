import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProblemes {

    @Test
    void testProblema1a() {
        System.setIn(new java.io.ByteArrayInputStream("25.0\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema1.main(new String[]{});

        assertEquals("Celsius: 25.00 | Fahrenheit: 77.00 | Kelvin: 298.15", outContent.toString().trim());
    }

    @Test
    void testProblema1b() {
        System.setIn(new java.io.ByteArrayInputStream("0.0\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema1.main(new String[]{});

        assertEquals("Celsius: 0.00 | Fahrenheit: 32.00 | Kelvin: 273.15", outContent.toString().trim());
    }


    @Test
    void testProblema2a() {
        System.setIn(new java.io.ByteArrayInputStream("3\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema2.main(new String[]{});

        String esperat = String.format("%5d %5d%n%5d %5d%n%5d %5d%n",1,1, 2,4, 3,9);
        assertEquals(esperat, outContent.toString().trim());
    }

    @Test
    void testProblema3a() {
        System.setIn(new java.io.ByteArrayInputStream("7.3\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema3.main(new String[]{});

        assertEquals("Nota: 7.3 → Qualificació: Notable", outContent.toString().trim());        
    }

    @Test
    void testProblema3b() {
        System.setIn(new java.io.ByteArrayInputStream("4.5\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema3.main(new String[]{});

        assertEquals("Nota: 4.5 → Qualificació: Suspès", outContent.toString().trim());        
    }

    @Test
    void testProblema3c() {
        System.setIn(new java.io.ByteArrayInputStream("9.0\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema3.main(new String[]{});

        assertEquals("Nota: 9.0 → Qualificació: Excel·lent", outContent.toString().trim());        
    }
    

    @Test
    void testProblema4a() {
        System.setIn(new java.io.ByteArrayInputStream("3\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema4.main(new String[]{});

        String esperat = "";
        for(int i=1;i<=10;i++){
            esperat += String.format("%2d x %2d = %3d%n", 3, i, 3*i);
        }
        assertEquals(esperat, outContent.toString().trim());

    }


    @Test
    void testProblema5a() {
        System.setIn(new java.io.ByteArrayInputStream("5 9 2\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema5.main(new String[]{});

        assertEquals("Mitjana: 5.33 | Màxim: 9 | Mínim: 2", outContent.toString().trim());
        
    }

    @Test
    void testProblema5b() {
        System.setIn(new java.io.ByteArrayInputStream("1 1 1\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema5.main(new String[]{});

        assertEquals("Mitjana: 1.00 | Màxim: 1 | Mínim: 1", outContent.toString().trim());
    }

 }
