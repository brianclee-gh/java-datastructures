public class Dog {

  public int weightInPounds;

  /** One int constructor for dogs */
  public Dog(int weight) {
    weightInPounds = weight;
  }

  public void makeNoise() {
    if (weightInPounds < 10) {
      System.out.println("yip");
    } else {
      System.out.println("bark!");
    }
  }
}

/**
 * Non static methods:
 *    if the method is going to be invoked by an instance of the
 *    class, then it should be non-static
 *
 *    if the method needs to use "my instance variables",
 *    the method must be non-static
 */