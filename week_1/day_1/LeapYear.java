package day_1;
public class LeapYear {
  /** Will return true if year is a leap year, false if it is not */
  public static boolean isLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    }
    if (year % 4 == 0 && year % 100 != 0) {
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    int year = 1990;
    if (isLeapYear(year)) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }
  }
}

/**
 * javac LeapYear.java
 *    compiles, makes code fast as possible
 * java LeapYear
 */