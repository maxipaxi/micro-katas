package com.microkatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtractInterfaceFromImplementationTests {

    @Test
    public void animal_getSound_moo() {
        ExtractInterfaceFromImplementation.Animal input = new ExtractInterfaceFromImplementation.Animal();
        var output = input.getSound();
        Assertions.assertEquals("Mooo", output);
    }

    @Test
    public void vehicle_getSound_moo() {
        ExtractInterfaceFromImplementation.Vehicle input = new ExtractInterfaceFromImplementation.Vehicle();
        var output = input.getWheels();
        Assertions.assertEquals(2, output);
    }

}
