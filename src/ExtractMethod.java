class ExtractMethod {

    static float[] subtractMinimum(float[] ar) {
        // Find minimum
        var min = Float.POSITIVE_INFINITY;
        for (float f : ar) {
            if (min > f) {
                min = f;
            }
        }
        // Subtract
        var result = new float[ar.length];
        for (int i = 0; i < ar.length; i++) {
            result[i] = ar[i] - min;
        }
        return result;
    }

    static float[] subtractAverage(float[] ar) {
        if (ar.length == 0) {
            return ar;
        }
        // Find sum
        var sum = 0;
        for (float f : ar) {
            sum += f;
        }
        // Find average
        float avg = sum / ar.length;
        // Subtract
        var result = new float[ar.length];
        for (int i = 0; i < ar.length; i++) {
            result[i] = ar[i] - avg;
        }
        return result;
    }

    static float[] normalizeHistogram(float[] ar) {
        if (ar.length <= 1) {
            return ar;
        }
        var min = Float.POSITIVE_INFINITY;
        var max = Float.NEGATIVE_INFINITY;
        for (float f : ar) {
            if (min > f) {
                min = f;
            }
            if (max < f) {
                max = f;
            }
        }
        var diff = max - min;
        var result = new float[ar.length];
        for (int i = 0; i < ar.length; i++) {
            result[i] = (ar[i] - min) / diff;
        }
        return result;
    }

}
