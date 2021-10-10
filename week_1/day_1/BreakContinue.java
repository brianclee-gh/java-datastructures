package day_1;
public class BreakContinue {

  /** Replaces each element with sums up to n + i if value is positive */
  public static void windowPosSum(int[] a, int n) {
    for (int idx = 0; idx < a.length - 1; idx = idx + 1) {
      if (a[idx] < 0) continue;
      int newValue = a[idx];
      for (int innerIdx = idx + 1; innerIdx <= idx + n; innerIdx = innerIdx + 1) {
        if (innerIdx >= a.length) break;
        newValue = newValue + a[innerIdx];
      }
      a[idx] = newValue;
    }
    System.out.println(java.util.Arrays.toString(a));
  }
  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    windowPosSum(a, 3);
  }
}
