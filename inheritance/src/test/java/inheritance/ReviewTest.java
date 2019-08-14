package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class ReviewTest {

    Review testInstanceOfReview;
    @Before
    public void setUp() throws Exception {
        testInstanceOfReview = new Review("The food was okay.", "Albert", 3);
        System.out.println(testInstanceOfReview.toString());
    }

    @Test
    public void TestToString() {
        assertEquals("The food was okay. I'd give it a 3 Out of 5. Reviewed by: Albert",testInstanceOfReview.toString());
    }

}