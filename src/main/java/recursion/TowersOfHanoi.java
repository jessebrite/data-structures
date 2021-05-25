package recursion;

public class TowersOfHanoi {
/**
 * This is the classic Towers of Hanoi recursion problem
 * We are trying to move all disks from source to destination
 * using an auxiliary location
 *
 * @param disk This is the number of disks to move
 * @param source This is where the disks initially are
 * @param destination This is where we finally want to send the disks
 * @param temp This is a temporary holder for moving disks around
 */
	public static void towerOfHanoi(int disk, int source, int destination, int temp) {
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
