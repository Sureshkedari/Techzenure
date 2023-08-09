import java.util.Scanner;

public class LargestOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 3 numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int lar;
		
		if(n1 > n2) {
			if(n1 > n3) {
				lar = n1;
			}else {
				lar = n3;
			}
		}else {
			if(n2 > n3) {
				lar = n2;
			}else {
				lar = n3;
			}
		}
		
		System.out.printf("largest of (%d, %d, %d) = %d", n1, n2, n3, lar);
		
		sc.close();
	}
}
