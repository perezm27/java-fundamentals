package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class ReviewTest {

    Review testInstanceOfReview;
    Review testReviewWithTitle;
    @Before
    public void setUp() throws Exception {
        testInstanceOfReview = new Review("The food was okay.", "Albert", 3);
        testReviewWithTitle = new Review("I really liked the movie", "Sarah", 4, "The Avengers");
    }

    @Test
    public void TestToString() {
        assertEquals("The food was okay. I'd give it a 3 Out of 5. Reviewed by: Albert",testInstanceOfReview.toString());
    }

    @Test
    public void TestReviewWithMovieTitle() {
        assertEquals("I really liked the movie I'd give it a 4 Out of 5. Reviewed by: Sarah. Saw The Avengers", testReviewWithTitle.toString());
    }
}