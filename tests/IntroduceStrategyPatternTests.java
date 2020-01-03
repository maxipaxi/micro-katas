import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntroduceStrategyPatternTests {

    @Test
    public void calculateList_minimumEmpty_infinity() {
        var input = new float[]{};
        var output = IntroduceStrategyPattern.calculateList(IntroduceStrategyPattern.MINIMUM, input);
        Assertions.assertEquals(Float.POSITIVE_INFINITY, output);
    }

    @Test
    public void calculateList_minimum_2() {
        var input = new float[]{1f, -2f, 3f};
        var output = IntroduceStrategyPattern.calculateList(IntroduceStrategyPattern.MINIMUM, input);
        Assertions.assertEquals(-2f, output);
    }

    @Test
    public void calculateList_maximumEmpty_infinity() {
        var input = new float[]{};
        var output = IntroduceStrategyPattern.calculateList(IntroduceStrategyPattern.MAXIMUM, input);
        Assertions.assertEquals(Float.NEGATIVE_INFINITY, output);
    }

    @Test
    public void calculateList_maximum_3() {
        var input = new float[]{1f, -2f, 3f};
        var output = IntroduceStrategyPattern.calculateList(IntroduceStrategyPattern.MAXIMUM, input);
        Assertions.assertEquals(3f, output);
    }

    @Test
    public void calculateList_sumEmpty_0() {
        var input = new float[]{};
        var output = IntroduceStrategyPattern.calculateList(IntroduceStrategyPattern.SUM, input);
        Assertions.assertEquals(0f, output);
    }

    @Test
    public void calculateList_sum_6() {
        var input = new float[]{1f, 2f, 3f};
        var output = IntroduceStrategyPattern.calculateList(IntroduceStrategyPattern.SUM, input);
        Assertions.assertEquals(6f, output);
    }

}
