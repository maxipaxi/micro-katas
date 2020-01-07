package com.microkatas;

import java.util.Random;

class TestUtils {

    private static final Random random = new Random();

    static {
        var seed = random.nextLong();
        System.out.println("Seed: " + seed);
        random.setSeed(seed);
    }

    static float[] randomFloatArray() {
        return randomFloatArray(TestUtils.random.nextInt(10) + 2);
    }

    private static float[] randomFloatArray(int length) {
        var result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = randomFloat(-1000, 1000, false);
        }
        return result;
    }

    private static float randomFloat(float min, float max, boolean includeSpecials) {
        var result = Float.intBitsToFloat(random.nextInt());
        while (max < result || result < min || !includeSpecials && (Float.isInfinite(result) || Float.isNaN(result))) {
            result = Float.intBitsToFloat(random.nextInt());
        }
        return result;
    }

    static String printArray(float[] ar) {
        var result = "";
        for (float f : ar) {
            if (result.length() > 0) {
                result += ", ";
            }
            result += f;
        }
        return "[" + result + "]";
    }
}
