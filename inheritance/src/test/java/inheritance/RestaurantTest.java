package inheritance;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant testRestaurant;
    @Before
    public void setUp() throws Exception {
        testRestaurant = new Restaurant("Olive Garden", 3, "$$");

    }

    @Test
    public void TestAddReview() {
         Review testReview = new Review("The food was okay.", "Albert", 3);

         assertEquals("The food was okay. I'd give it a 3 Out of 5. Reviewed by: Albert",testReview.toString());
    }

    @Test
    public void testStarRating(){
        Review testReview2 = new Review("The food was okay.", "Albert", 2);

        testRestaurant.addReview(testReview2);

        assertEquals(2,testRestaurant.starRating);
    }

    @Test
    public void TestToString() {
        assertEquals("Olive Garden has a start rating of 3 & has a price category of $$", testRestaurant.toString());
    }
}