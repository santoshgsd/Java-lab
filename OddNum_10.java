import java.util.Scanner;
public class OddNum_10 {
	public static void main(String[] args){
	Scanner obj = new Scanner(System.in);
	int n1, n2;
	System.out.println("Enter the first number n1:");
	n1 = obj.nextInt();
	System.out.println("Enter the last number n2:");
	n2 = obj.nextInt();
		System.out.println("Odd numbers between n1 to n2 are:");
	for (int i=n1; i<=n2; i++) {
		if (i%2 != 0) {
			//System.out.println("Odd numbers are:" + i);
			System.out.println(i);
		}
	}
	}
}
