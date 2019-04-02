import java.util.ArrayList;

public class BasicList {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 10; i < 100; i+=10) {
			a.add(i);
		}
		System.out.println(a);
		System.out.println("Size of the list is " + a.size());
		a.add(5 , 200);
		System.out.println(a);
		System.out.println("Size of the list is " + a.size());
		System.out.println("Value " + a.get(5) + " is located at index " + a.indexOf(200));
		}


}
