import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtractMethodTests {

    @Test
    public void subtractMinimum_empty_stillEmpty() {
        var input = new float[]{};
        var output = ExtractMethod.subtractMinimum(input);
        Assertions.assertArrayEquals(input, output);
    }

    @Test
    public void subtractMinimum_oneElement_zero() {
        var input = new float[]{1f};
        var output = ExtractMethod.subtractMinimum(input);
        Assertions.assertArrayEquals(new float[]{0f}, output);
    }

    @Test
    public void subtractMinimum_oneElement_zero2() {
        var input = new float[]{-2f};
        var output = ExtractMethod.subtractMinimum(input);
        Assertions.assertArrayEquals(new float[]{0f}, output);
    }

    @Test
    public void subtractMinimum_multipleElements_works() {
        var input = new float[]{1f, 2f, 3f};
        var output = ExtractMethod.subtractMinimum(input);
        Assertions.assertArrayEquals(new float[]{0f, 1f, 2f}, output);
    }

    @Test
    public void subtractMinimum_multipleElementsOneNegative_works() {
        var input = new float[]{1f, -2f, 3f};
        var output = ExtractMethod.subtractMinimum(input);
        Assertions.assertArrayEquals(new float[]{3f, 0f, 5f}, output);
    }

    @Test
    public void subtractAverage_empty_stillEmpty() {
        var input = new float[]{};
        var output = ExtractMethod.subtractAverage(input);
        Assertions.assertArrayEquals(input, output);
    }

    @Test
    public void subtractAverage_oneElement_zero() {
        var input = new float[]{1f};
        var output = ExtractMethod.subtractAverage(input);
        Assertions.assertArrayEquals(new float[]{0f}, output);
    }

    @Test
    public void subtractAverage_oneElement_zero2() {
        var input = new float[]{-2f};
        var output = ExtractMethod.subtractAverage(input);
        Assertions.assertArrayEquals(new float[]{0f}, output);
    }

    @Test
    public void subtractAverage_multipleElements_works() {
        var input = new float[]{1f, 2f, 3f};
        var output = ExtractMethod.subtractAverage(input);
        Assertions.assertArrayEquals(new float[]{-1f, 0f, 1f}, output);
    }

    @Test
    public void subtractAverage_multipleElementsOneNegative_works() {
        var input = new float[]{1f, -2f, 3f};
        var output = ExtractMethod.subtractAverage(input);
        Assertions.assertArrayEquals(new float[]{1f, -2f, 3f}, output);
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
