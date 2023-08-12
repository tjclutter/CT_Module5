import java.util.Scanner;

public class CT_Module_5_option1 {
	public static int MultiplyNum(int numLeft, int sum) {
		Scanner scnr = new Scanner(System.in);
		if (numLeft == 0) {
			return sum;
		}else {
			System.out.println("Enter number: ");
			int num = scnr.nextInt();
			sum = num * sum;
			sum = MultiplyNum(numLeft - 1, sum);
		}
		return sum;
	}
	public static void main(String[] args) {
		int product = MultiplyNum(5, 1);
		System.out.println("The product of your five numbers is: " + product);
	}
}
