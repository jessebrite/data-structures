import java.lang.IllegalArgumentException;

/**
 * This is a simple recursion that sums numbers in an array from first to the target
 */
public class LinearRecursion {
  public static int linearRecursion(int[] data, int target) {
    if (target == 0) return 0;
    if (target > data.length) throw new IllegalArgumentException();
    // recursively add the indeces until target is reached
    return linearRecursion(data, target - 1) + data[target - 1];
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int point = 10;

    System.out.println(linearRecursion(array, point));
  }
}
