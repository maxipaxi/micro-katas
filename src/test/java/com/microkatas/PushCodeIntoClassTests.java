package com.microkatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PushCodeIntoClassTests {

    @Test
    public void calculatePrice_chocolate() {
        var input = new PushCodeIntoClass.Item("Chocolate", 3f);
        var output = PushCodeIntoClass.calculatePrice(input, 0.5f);
        Assertions.assertEquals(1.5f, output);
    }

    @Test
    public void calculatePrice_fruit() {
        var input = new PushCodeIntoClass.Item("Fruit", 1f);
        var output = PushCodeIntoClass.calculatePrice(input, 1f);
        Assertions.assertEquals(1f, output);
    }

    @Test
    public void receiptLine_chocolate() {
        var input = new PushCodeIntoClass.Item("Chocolate", 3f);
        var output = PushCodeIntoClass.receiptLine(input);
        Assertions.assertEquals("Chocolate 3.0", output);
    }

    @Test
    public void receiptLine_gum() {
        var input = new PushCodeIntoClass.Item("Gum", 0.5f);
        var output = PushCodeIntoClass.receiptLine(input);
        Assertions.assertEquals("Gum       0.5", output);
    }

    @Test
    public void getSound_cow_moo() {
        var input = new PushCodeIntoClass.Cow();
        var output = PushCodeIntoClass.getSound(input);
        Assertions.assertEquals("Mooo", output);
    }

    @Test
    public void getSound_cat_meow() {
        var input = new PushCodeIntoClass.Cat();
        var output = PushCodeIntoClass.getSound(input);
        Assertions.assertEquals("Meow", output);
    }

}
