package recursion;

public class TowersOfHanoi {
	public static void towerOfHanoi(int disk, int source, int destination, int temp) {
//		base case
//		print from source to destination
		if (disk == 1) {
			System.out.printf("%n%d --> %d", source, destination);
			return;
		}

//		move disks from src to temp through destination
		towerOfHanoi(disk - 1, source, temp, destination);

//		if all but one (largest) left, move from src to dest and print
		System.out.printf("%n%d --> %d", source, destination);

//		move all from temp to dest through src
		towerOfHanoi(disk - 1, temp, destination, source);
	}
}
