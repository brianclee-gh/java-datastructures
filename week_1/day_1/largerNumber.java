package day_1;
public class largerNumber {
  /** Returns the larger of x and y */
  public static int larger(int x, int y) {
    if (x > y) {
      return x;
    }

    return y;
  }
  public static void main(String[] args) {
    System.out.println(larger(5, 10));
  }
}

/*
 * Functions must be declared as part of a class in Java
 *    A function that is part of a class is called a method
 *    So in Java, all functions are methods
 *
 * To define a function in Java
 *    We will see alternate ways of defining functions later
 *
 * All parameters of a function must have a declared type, and the return
 * value of the function must have a declared type
 *
 * Functions in Java only return one value
 *
 */