/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        roll(4);
    }

    public static int[] roll (int n) {
        int[] diceRolls = new int[n];

        for (int i = 0; i < n; i++) {
            int dice = (int)(Math.random() * 6) + 1;

            diceRolls[i] = dice;
            
        }
        System.out.println(Arrays.toString(diceRolls));
        return diceRolls;
    }

    public static boolean containsDuplicates(int[] testArr){

        for (int i = 0; i < testArr.length; i++) {
            for (int j = 0; j < testArr.length ; j++) {

                if (testArr[i] == testArr[j] && i!=j){
                    System.out.println("true");
                    return true;
            }
            }
        }
        System.out.println("false");
        return false;
    }

    public static int calculateAvgs(int[] arrOfAvg){
        int averages = 0;

        for (int x : arrOfAvg){
            averages += x;
        }

        return averages / arrOfAvg.length;
    }

    public static int[] arrayOfArrays (int[][] arr){
        int lowestIndx = 0;
        int lowestAverage = calculateAvgs(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if(calculateAvgs(arr[i]) < lowestAverage){
                lowestAverage = calculateAvgs(arr[i]);
                lowestIndx = i;
            }

        }
        return arr[lowestIndx];
    }

}
