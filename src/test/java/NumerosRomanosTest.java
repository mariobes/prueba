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

    @Test
    public void _2_Devuelve_II() {
        assertEquals("II", numerosRomanos.play(2));
    }

    @Test
    public void _3_Devuelve_III() {
        assertEquals("III", numerosRomanos.play(3));
    }

    @Test
    public void _4_Devuelve_IV() {
        assertEquals("IV", numerosRomanos.play(4));
    }

    @Test
    public void _5_Devuelve_V() { assertEquals("V", numerosRomanos.play(5)); }

    @Test
    public void _9_Devuelve_IX() { assertEquals("IX", numerosRomanos.play(9)); }

    @Test
    public void _10_Devuelve_X() { assertEquals("X", numerosRomanos.play(10)); }

    @Test
    public void _20_Devuelve_XX() { assertEquals("XX", numerosRomanos.play(20)); }

    @Test
    public void _30_Devuelve_XXX() { assertEquals("XXX", numerosRomanos.play(30)); }

    @Test
    public void _40_Devuelve_XL() { assertEquals("XL", numerosRomanos.play(40)); }

    @Test
    public void _50_Devuelve_L() { assertEquals("L", numerosRomanos.play(50)); }

    @Test
    public void _100_Devuelve_C() { assertEquals("C", numerosRomanos.play(100)); }

    @Test
    public void _400_Devuelve_CD() { assertEquals("CD", numerosRomanos.play(400)); }

    @Test
    public void _500_Devuelve_D() { assertEquals("D", numerosRomanos.play(500)); }

    @Test
    public void _900_Devuelve_CM() { assertEquals("CM", numerosRomanos.play(900)); }

    @Test
    public void _1000_Devuelve_M() { assertEquals("M", numerosRomanos.play(1000)); }

    @Test
    public void _1949_Devuelve_MCMXLIX() { assertEquals("MCMXLIX", numerosRomanos.play(1949 )); }

    @Test
    public void _2018_Devuelve_MMXVIII() { assertEquals("MMXVIII", numerosRomanos.play(2018 )); }


}
