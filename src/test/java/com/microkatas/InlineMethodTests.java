package com.microkatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InlineMethodTests {

    @Test
    public void difference_smallBig_3() {
        var a = 2;
        var b = 5;
        var output = InlineMethod.difference(a, b);
        Assertions.assertEquals(3f, output);
    }

    @Test
    public void difference_negative_2() {
        var a = -1;
        var b = 1;
        var output = InlineMethod.difference(a, b);
        Assertions.assertEquals(2f, output);
    }

    @Test
    public void difference_bigSmall_39() {
        var a = 40;
        var b = 1;
        var output = InlineMethod.difference(a, b);
        Assertions.assertEquals(39, output);
    }

}
