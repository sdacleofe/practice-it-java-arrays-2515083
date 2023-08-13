public class App {
  
  public static void main(String[] args) {
    int[] arr = new int[]{92, 12, 38, 74};

    int[] arr = new int[] { 92, 12, 38, 74 };
    // iterate forward
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println();

    // iterate backwards
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(arr[i]);
    }
    System.out.println();

    // another option use an enhance for loop or foreach
    for (int item : arr) {
      System.out.println(item);
    }
    System.out.println();

    // another option use Java Streams (Newer Version)
    Arrays.stream(arr).forEach(System.out::println);

    // Arrays.stream(arr).filter()
    // Arrays.stream(arr).average()
    // Arrays.stream(arr).sum()
  }
}