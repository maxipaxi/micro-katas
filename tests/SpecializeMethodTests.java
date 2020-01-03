import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

public class SpecializeMethodTests {

    @Test
    public void newestElement_ArrayList_3() {
        var input = new ArrayList() {{
            add(1f);
            add(-2f);
            add(3f);
        }};
        var output = SpecializeMethod.newestElement(input);
        Assertions.assertEquals(3f, output);
    }

    @Test
    public void newestElement_Stack_3() {
        var input = new Stack() {{
            push(1f);
            push(-2f);
            push(3f);
        }};
        var output = SpecializeMethod.newestElement(input);
        Assertions.assertEquals(3f, output);
    }

}
