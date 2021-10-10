package day_1;
public class PrintTriangle {
  public static String printStars(int x) {
    String stars = "";
    while (x > 0) {
      stars = stars + '*';
      x = x - 1;
    }
    return stars;
  }

  public static void drawTriangle(int y) {
    int x = 1;

    while (x <= y) {
      System.out.println(printStars(x));
      x = x + 1;
    }
  }
  public static void main(String[] args) {
    drawTriangle(10);
  }
}
