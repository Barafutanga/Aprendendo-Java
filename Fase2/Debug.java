import java.util.Scanner;
public class Debug {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert number to be fatored \n nFat: ");
		int[] nFat = new int[sc.nextInt()];

		for (int i = nFat.length; i <= nFat.length; i--) {
			nFat[i] = nFat[i] * (nFat[i] - i);
			System.out.println(nFat);
		}
			sc.close();
	}
}