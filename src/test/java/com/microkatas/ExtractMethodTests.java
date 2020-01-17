package com.microkatas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ExtractMethodTests {

    static class subtractMinimum_causes {
        private static final float EPSILON = 0.01f;

        private static boolean hasZero(float[] ar) {
            for (float f : ar) {
                if (Math.abs(f) < EPSILON) {
                    return true;
                }
            }
            return false;
        }

        @Test
        public void an_empty_array_to_remain_empty() {
            var input = new float[]{};
            var output = ExtractMethod.subtractMinimum(input);
            Assertions.assertArrayEquals(input, output);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }

        @ParameterizedTest
        @Tag("Boundary")
        @ValueSource(floats = {Float.MIN_VALUE, 0, -3.4f, 15.2f, Float.MAX_VALUE})
        public void an_array_with_a_single_element_to_go_to_0(float value) {
            var input = new float[]{value};
            var output = ExtractMethod.subtractMinimum(input);
            Assertions.assertArrayEquals(new float[]{0f}, output);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }

        @Test
        @Tag("Theorem")
        public void an_array_to_have_at_least_one_0_while_retaining_its_length() {
            var input = TestUtils.randomFloatArray();
            var output = ExtractMethod.subtractMinimum(input);
            Assertions.assertEquals(input.length, output.length);
            Assertions.assertTrue(hasZero(output), TestUtils.printArray(input));
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }

    static class subtractAverage_causes {
        private static final float EPSILON = 0.01f;

        private static float average(float[] ar) {
            var sum = 0f;
            for (float f : ar) {
                sum += f;
            }
            return sum / ar.length;
        }

        @Test
        public void an_empty_array_to_remain_empty() {
            var input = new float[]{};
            var output = ExtractMethod.subtractAverage(input);
            Assertions.assertArrayEquals(input, output);
        }

        @ParameterizedTest
        @Tag("Boundary")
        @ValueSource(floats = {Float.MIN_VALUE, 0, -3.4f, 15.2f, Float.MAX_VALUE})
        public void an_array_with_a_single_element_to_go_to_0(float value) {
            var input = new float[]{value};
            var output = ExtractMethod.subtractAverage(input);
            Assertions.assertArrayEquals(new float[]{0f}, output);
        }

        @Test
        @Tag("Theorem")
        public void an_array_to_have_average_0_while_retaining_its_length() {
            var input = TestUtils.randomFloatArray();
            var output = ExtractMethod.subtractAverage(input);
            Assertions.assertEquals(input.length, output.length);
            Assertions.assertEquals(0, average(output), EPSILON, TestUtils.printArray(input));
        }
    }

    @Test
    public void normalizeHistogram_empty_stillEmpty() {
        var input = new float[]{};
        var output = ExtractMethod.normalizeHistogram(input);
        Assertions.assertArrayEquals(input, output);
    }

    @Test
    public void normalizeHistogram_oneElement_zero() {
        var input = new float[]{1f};
        var output = ExtractMethod.normalizeHistogram(input);
        Assertions.assertArrayEquals(new float[]{1f}, output);
    }

    @Test
    public void normalizeHistogram_oneElement_zero2() {
        var input = new float[]{-2f};
        var output = ExtractMethod.normalizeHistogram(input);
        Assertions.assertArrayEquals(new float[]{-2f}, output);
    }

    @Test
    public void normalizeHistogram_multipleElements_works() {
        var input = new float[]{1f, 2f, 3f};
        var output = ExtractMethod.normalizeHistogram(input);
        Assertions.assertArrayEquals(new float[]{0f, 0.5f, 1f}, output);
    }

    @Test
    public void normalizeHistogram_multipleElementsOneNegative_works() {
        var input = new float[]{1f, -2f, 3f};
        var output = ExtractMethod.normalizeHistogram(input);
        Assertions.assertArrayEquals(new float[]{0.6f, 0f, 1f}, output);
    }

}
