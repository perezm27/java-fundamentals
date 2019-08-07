/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testDiceRoll() {
        int n = 4;

        int[] diceRolls = new int[n];

        assertEquals("Dice method should print n values between 1-6", diceRolls.length,  n);
    }

    @Test public void testDuplicates(){
        int[] testArr = new int[]{1,2,3,3};

        assertTrue("Should return true if duplicates exist", Library.containsDuplicates(testArr));
    }

    @Test public void testAverages(){
        int[] testArr = new int[]{1,2,4,7,5};
        int testAverage = 3;

        assertEquals(testAverage, Library.calculateAvgs(testArr));

    }

    @Test public void testArrayOfArrays(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

       int average = 60;

        assertEquals(average, Library.arrayOfArrays(weeklyMonthTemperatures));
    }
}
