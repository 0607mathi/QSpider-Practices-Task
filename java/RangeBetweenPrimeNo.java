
import java.util.Scanner;

class RangeBetweenPrimeNo {
	static Scanner sc = new Scanner(System.in);

	static boolean isPrimeOrNot(int value) {
		boolean p = true;
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				p = false;
			break;
		}
		return p;
	}

	public static void main(String[] args) {
		System.out.print("Enter Starting Point  : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Point    : ");
		int end = sc.nextInt();

		if (start < end && start > 0) {
			if (start != 0 && start != 1) {
				System.out.print("Prime Number in Range : ");
				for (int i = start; i <= end; i++) {
					if (isPrimeOrNot(i))
						System.out.print(i + " ");
				}
			} else
				System.out.println(start + " is Neigther Prime or Composite");
		} else
			System.out.print("Invalid Input");
	}
}
