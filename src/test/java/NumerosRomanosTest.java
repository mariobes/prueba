import com.sanvalero.NumerosRomanos;
import org.junit.Assert;
import org.junit.Test;

public class NumerosRomanosTest {

    @Test
    public void _1_Devuelve_I() {
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        Assert.assertEquals("I", numerosRomanos.play(1));
    }

    @Test
    public void _5_Devuelve_V() {
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        Assert.assertEquals("V", numerosRomanos.play(5));
    }

    @Test
    public void _10_Devuelve_X() {
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        Assert.assertEquals("X", numerosRomanos.play(10));
    }

    @Test
    public void _50_Devuelve_L() {
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        Assert.assertEquals("L", numerosRomanos.play(50));
    }

    @Test
    public void _100_Devuelve_C() {
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        Assert.assertEquals("C", numerosRomanos.play(100));
    }

    @Test
    public void _500_Devuelve_D() {
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        Assert.assertEquals("D", numerosRomanos.play(500));
    }

    @Test
    public void _1000_Devuelve_M() {
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        Assert.assertEquals("M", numerosRomanos.play(1000));
    }
    
}
