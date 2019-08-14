package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testToString() {
        Theater testTheater = new Theater("Avengers");

        assertEquals("Avengers", testTheater.toString());
    }

    @Test
    public void TestAddTheaterReview() {
        Review testReview = new Review("The lego movie was good ","Sarah", 3);
        Theater testTheater = new Theater("The Lego Movie");

        testTheater.addMovieReview(testReview);

        assertEquals(testReview, testTheater.reviews.get(0));
    }

    @Test
    public void TestAddMovie() {
        Theater testTheater1= new Theater("LionsGate");

        testTheater1.addMovie("Titanic");
        testTheater1.addMovie("The Avengers");
        testTheater1.addMovie("The Lion King");

        assertEquals("Titanic", testTheater1.movies.get(0));
    }

    @Test
    public void TestRemoveMovie() {
        Theater testTheater1= new Theater("LionsGate");

        testTheater1.addMovie("Titanic");
        testTheater1.addMovie("The Avengers");
        testTheater1.addMovie("The Lion King");

        testTheater1.removeMovie(1);


        assertEquals(2, testTheater1.movies.size());
    }
}