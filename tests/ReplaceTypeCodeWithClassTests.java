import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReplaceTypeCodeWithClassTests {

    @Test
    public void getName_xs_extraSmall() {
        var input = ReplaceTypeCodeWithClass.Size.XS;
        var output = ReplaceTypeCodeWithClass.getName(input);
        Assertions.assertEquals("eXtra Small", output);
    }

    @Test
    public void getName_s_small() {
        var input = ReplaceTypeCodeWithClass.Size.S;
        var output = ReplaceTypeCodeWithClass.getName(input);
        Assertions.assertEquals("Small", output);
    }

    @Test
    public void getName_m_medium() {
        var input = ReplaceTypeCodeWithClass.Size.M;
        var output = ReplaceTypeCodeWithClass.getName(input);
        Assertions.assertEquals("Medium", output);
    }

    @Test
    public void getName_l_large() {
        var input = ReplaceTypeCodeWithClass.Size.L;
        var output = ReplaceTypeCodeWithClass.getName(input);
        Assertions.assertEquals("Large", output);
    }

    @Test
    public void getName_xl_extraLarge() {
        var input = ReplaceTypeCodeWithClass.Size.XL;
        var output = ReplaceTypeCodeWithClass.getName(input);
        Assertions.assertEquals("eXtra Large", output);
    }

    @Test
    public void getPrice_xs_extraSmall() {
        var input = ReplaceTypeCodeWithClass.Size.XS;
        var output = ReplaceTypeCodeWithClass.getPrice(input, ReplaceTypeCodeWithClass.CustomerType.PERSON);
        Assertions.assertEquals(1.25f, output);
    }

    @Test
    public void getPrice_s_small() {
        var input = ReplaceTypeCodeWithClass.Size.S;
        var output = ReplaceTypeCodeWithClass.getPrice(input, ReplaceTypeCodeWithClass.CustomerType.BUSINESS);
        Assertions.assertEquals(2f, output);
    }

    @Test
    public void getPrice_m_medium() {
        var input = ReplaceTypeCodeWithClass.Size.M;
        var output = ReplaceTypeCodeWithClass.getPrice(input, ReplaceTypeCodeWithClass.CustomerType.PERSON);
        Assertions.assertEquals(3.75f, output);
    }

    @Test
    public void getPrice_l_large() {
        var input = ReplaceTypeCodeWithClass.Size.L;
        var output = ReplaceTypeCodeWithClass.getPrice(input, ReplaceTypeCodeWithClass.CustomerType.BUSINESS);
        Assertions.assertEquals(4f, output);
    }

    @Test
    public void getPrice_xl_extraLarge() {
        var input = ReplaceTypeCodeWithClass.Size.XL;
        var output = ReplaceTypeCodeWithClass.getPrice(input, ReplaceTypeCodeWithClass.CustomerType.PERSON);
        Assertions.assertEquals(6.25, output);
    }

    @Test
    public void colorToHex_red_ff0000() {
        var input = ReplaceTypeCodeWithClass.RED;
        var output = ReplaceTypeCodeWithClass.colorToHex(input);
        Assertions.assertEquals("#ff0000", output);
    }

    @Test
    public void colorToHex_green_00ff00() {
        var input = ReplaceTypeCodeWithClass.GREEN;
        var output = ReplaceTypeCodeWithClass.colorToHex(input);
        Assertions.assertEquals("#00ff00", output);
    }

    @Test
    public void colorToHex_blue_0000ff() {
        var input = ReplaceTypeCodeWithClass.BLUE;
        var output = ReplaceTypeCodeWithClass.colorToHex(input);
        Assertions.assertEquals("#0000ff", output);
    }

}
