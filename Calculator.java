import java.util.Scanner;
public class Activity_1{

	public static void main(String[]args){
	int num1, num2,largest,smallest;
	Scanner num = new Scanner(System.in);
	
	System.out.println("Enter first number:");
	num1 = num.nextInt();
	System.out.println("Enter second number");
	num2 = num.nextInt();

	System.out.println("Addition is:"+(num1+num2));
	System.out.println("Substraction is:"+(num1-num2));
	System.out.println("Multipication is:"+(num1*num2));
	System.out.println("Division is:"+(num1/num2));
	System.out.println("Remainder is:"+(num1%num2));

	largest=(num1>num2)?num1:num2;
	System.out.println("largest number is:"+largest);
	smallest=(num1<num2)?num1:num2;
	System.out.println("Smallest number is:"+smallest);
	}
}
