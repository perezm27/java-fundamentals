public class Main {
  public static void main(String[] args) {
    // Feature Pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
  }

  // Feature Pluralize
  public static String pluralize(String word, int count) {
    String plural = "" + 's';

    if (count >= 0) {
      word += plural;
    }
    return word;
  }
}