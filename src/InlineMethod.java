class InlineMethod {

    private static float[] makeArray(float a, float b) {
        return new float[]{a, b};
    }

    private static float subtractElements(float[] ar) {
        return ar[0] - ar[1];
    }

    private static float[] swapElements(float[] ar) {
        return new float[]{
                ar[1], ar[0]
        };
    }

    private static float[] orderElements(float[] ar) {
        return ar[0] < ar[1] ? ar : InlineMethod.swapElements(ar);
    }

    static float difference(float a, float b) {
        return InlineMethod.subtractElements(
                InlineMethod.swapElements(
                        InlineMethod.orderElements(
                                InlineMethod.makeArray(a, b))));
    }

}
