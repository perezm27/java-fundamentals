package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void TestToString() {
        Shop testShop = new Shop("Walmart ","Shop for everything you need", "$");

        assertEquals("Walmart Shop for everything you need & has a price category of $", testShop.toString());
    }


    @Test
    public void addShopReview() {
        Review testReview = new Review("The shop was good ","Sarah", 3);
        Shop testShop = new Shop("Walmart ","Shop for everything you need", "$");

        testShop.addShopReview(testReview);
        assertEquals(testReview, testShop.reviews.get(0));
    }
}