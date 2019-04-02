import java.util.Scanner;

public class Distinct {
	public static void main(String[] args) {
		int numberOfNumbers = 10;
		int[] numbers = getNumbers(numberOfNumbers);
		int[] Distinct = distinct(numbers);
		Print(Distinct);
	}

	public static int[] getNumbers(int a) {
		Scanner input = new Scanner(System.in);
		int[] temp = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.print("Enter integer " + (i + 1) + ":");
			temp[i] = input.nextInt();
		}
		input.close();
		return temp;
	}

	public static int[] distinct(int[] a) {
		int distinct = 0, f = 0, m = 0;

		for (int i = 0; i < a.length; i++) {
			f = 0;
			for (int j = i; j >= 0; j--) {
				if (a[i] == a[j] && i != j) {
					f = -1;
					break;
				}
			}
				if (f == 0) {
					distinct++;
				}
			
		}
		int[] temp = new int[distinct];
		for (int i = 0; i < a.length; i++) {
			f = 0;
			for (int j = i; j >= 0; j--) {
				if (a[i] == a[j] && i != j) {
					f = -1;
					break;
				}
			}
				if (f == 0) {
					temp[m] = a[i];
					m++;
				}
			
		}
		return temp;
	}

	public static void Print(int[] a) {
		System.out.println("Distinct numbers are: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
