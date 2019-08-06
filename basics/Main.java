import java.time.LocalDateTime;
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

    // Feature Command Line Clock
    clock();
  }

  // Feature Pluralize
  public static String pluralize(String word, int count) {
    String plural = "s";

    if (count == 0 || count > 1) {
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
      totalFlips++;

      if (flip < constraint) {
        headsCounter = 0;
        System.out.println("tails");

      } else {
        headsCounter++;
        System.out.println("heads");
      }
    }
    System.out.println("It took " + totalFlips + " flips to flip " + headsCounter + " head in a row.");
  }

  // Feature Command Line Clock
  public static void clock() {
    LocalDateTime now = LocalDateTime.now();
    int initialSecond = now.getSecond();

    while (true) {
      LocalDateTime time = LocalDateTime.now();
      int hours = time.getHour();
      int minutes = time.getMinute();
      int seconds = time.getSecond();

      if (initialSecond < seconds) {
        initialSecond = seconds;
        System.out.println("time: " + hours + ":" + minutes + ":" + seconds);
      }
    }
  }

}