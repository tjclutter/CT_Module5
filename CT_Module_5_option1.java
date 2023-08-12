import java.util.Scanner;

public class CT_Module_5_option1 {
	//header of recursive method MultiplyNum
	public static double MultiplyNum(int numLeft, double sum) {
		//create scanner object named scnr
		Scanner scnr = new Scanner(System.in);
		//check if numLeft is equal to zero
		//if so return sum
		if (numLeft == 0) {
			return sum;
		//if numLeft does not equal zero:
		}else {
			//prompt user to enter a number
			//and store it in num
			System.out.println("Enter number: ");
			double num = scnr.nextDouble();
			//calculate new sum using new number num
			//and the value of the old sum
			sum = num * sum;
			//call recursive method MultiplyNum
			//with updated sum and one less than numLeft
			//store output in sum
			sum = MultiplyNum(numLeft - 1, sum);
		}
		//return sum
		return sum;
	}
	public static void main(String[] args) {
		//call recursive method with numLeft equaling five for five numbers
		//and sum equaling one. store output in variable product 
		double product = MultiplyNum(5, 1);
		//print product which stores product of the five numbers entered by user
		System.out.println("The product of your five numbers is: " + product);
	}
}
