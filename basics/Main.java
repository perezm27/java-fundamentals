import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // Feature Pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // Feature Flipping Coins
    flipNHeads(2);
  }

  // Feature Pluralize
  public static String pluralize(String word, int count) {
    String plural = "" + 's';

    if (count >= 0) {
      word += plural;
    }
    return word;
  }

  // Feature Flipping Coins
  public static void flipNHeads(int n) {
    int totalFlips = 0;
    int headsCounter = 0;
    double constraint = 0.5;

    while (headsCounter < n) {
      Random randomNum = new Random();
      double flip = randomNum.nextDouble();

      if (flip < constraint) {
        totalFlips++;
        System.out.println("tails");

      } else if (flip > constraint) {
        totalFlips++;
        headsCounter++;
        System.out.println("heads");
      }

    }
    System.out.println("It took " + totalFlips + " flips to flip " + headsCounter + " head in a row.");
  }

  // Feature Command Line Clock

}