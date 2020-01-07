package com.microkatas;

class IntroduceStrategyPattern {

    static final int MINIMUM = 1;
    static final int MAXIMUM = 2;
    static final int SUM = 3;

    static float calculateList(int mode, float[] ar) {
        var result = mode == IntroduceStrategyPattern.MINIMUM ? Float.POSITIVE_INFINITY
                : mode == IntroduceStrategyPattern.MAXIMUM ? Float.NEGATIVE_INFINITY
                : 0;
        for (float a : ar) {
            if (mode == IntroduceStrategyPattern.MINIMUM && result > a) {
                result = a;
            } else if (mode == IntroduceStrategyPattern.MAXIMUM && result < a) {
                result = a;
            } else if (mode == IntroduceStrategyPattern.SUM) {
                result += a;
            }
        }
        return result;
    }


}
