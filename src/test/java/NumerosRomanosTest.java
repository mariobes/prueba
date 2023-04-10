import com.sanvalero.NumerosRomanos;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class NumerosRomanosTest {

    private NumerosRomanos numerosRomanos;

    @Before
    public void SetUp() {
        numerosRomanos = new NumerosRomanos();
    }

    @Test
    public void _1_Devuelve_I() {
        assertEquals("I", numerosRomanos.play(1));
    }

//    @Test
//    public void _5_Devuelve_V() {
//       assertEquals("V", numerosRomanos.play(5));
//    }
//
    @Test
    public void _10_Devuelve_X() {
        assertEquals("X", numerosRomanos.play(10));
    }
//
//    @Test
//    public void _50_Devuelve_L() {
//        NumerosRomanos numerosRomanos = new NumerosRomanos();
//        assertEquals("L", numerosRomanos.play(50));
//    }
//
//    @Test
//    public void _100_Devuelve_C() {
//        NumerosRomanos numerosRomanos = new NumerosRomanos();
//        assertEquals("C", numerosRomanos.play(100));
//    }
//
//    @Test
//    public void _500_Devuelve_D() {
//        NumerosRomanos numerosRomanos = new NumerosRomanos();
//        assertEquals("D", numerosRomanos.play(500));
//    }
//
//    @Test
//    public void _1000_Devuelve_M() {
//        NumerosRomanos numerosRomanos = new NumerosRomanos();
//        assertEquals("M", numerosRomanos.play(1000));
//    }

}
