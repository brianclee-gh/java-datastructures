package day_1;
public class MaxValue {

  public static int maxValueFromArray(int[] arr) {
    int currentMin = arr[0];
    for (int idx = 1; idx < arr.length; idx = idx + 1) {
      if (arr[idx] < currentMin) {
        currentMin = arr[idx];
      }
    }
    return currentMin;
  }
  public static void main(String[] args) {
    int[] numbers = new int[]{9, 2, 15, 1, 22, 10, 6};

    System.out.println(maxValueFromArray(numbers));
  }
}
