import java.util.Scanner;

public class Lottery {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int[] lottery = new int[5];
		int[] user = new int[lottery.length];
		int[] sameNumbers = null;
		lottery = getStartValues(lottery);
		user = getValues(lottery, user);
		sameNumbers = compareNumbers(lottery, user, sameNumbers);
		Print(lottery, sameNumbers);
	}

	public static int[] getValues(int[] a, int[] b) {
		System.out.println("Enter a series of " + a.length + " numbers.");
		for (int i = 1; i <= a.length; i++) {
			System.out.print("Enter number " + i + ": ");
			b[i - 1] = input.nextInt();
		}
		System.out.println();
		return b;
	}

	public static int[] getStartValues(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (10 * Math.random());
		}
		return a;
	}

	public static int[] compareNumbers(int[] a, int[] b, int[] c) {
		int sameCount = 0, k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				sameCount++;
			}
		}
		c = new int[sameCount + 1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				c[k] = a[i];
				k++;
			}
		}
		c[c.length - 1] = sameCount;
		return c;
	}

	public static void Print(int[] a, int[] b) {
		System.out.print("The lottery numbers are: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nYou matched " + b[b.length - 1] + " numbers");
		if (b[b.length - 1] != 0) {
			System.out.println("The matching numbers are: ");
			for (int i = 0; i < b.length - 1; i++) {
				System.out.print(b[i] + " ");
			}
		}
	}
}
