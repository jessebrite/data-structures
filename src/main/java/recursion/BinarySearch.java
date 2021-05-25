public class BinarySearch {
/**
 * This is a binary search that checks if a target exists in a given array
 *
 * @param data This is the array to look search
 * @param target This is the value we're looking for
 * @return The target or -1
 */

  public static int binarySearch(int[] data, int target, int low, int high) {
    if (low > high) return -1;

    int mid = (low + high) / 2;

    if (target == data[mid]) return target;
    else if (target < data[mid])
      return binarySearch(data, target, low, mid - 1);
    else
      return binarySearch(data, target, mid + 1, high);
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 13, 15, 19 };
    int target = 5;
    int fisrt = array[0];
    int last = array.length - 1;
    System.out.println(binarySearch(array, 5, fisrt, last));
    System.out.println(binarySearch(array, 19, fisrt, last));
    System.out.println(binarySearch(array, 21, fisrt, last));
    System.out.println(binarySearch(array, 0, fisrt, last));
  }
}
