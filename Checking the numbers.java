import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter First Number");
	    int num1 = sc.nextInt();
	    System.out.println(" Enter Second Number");
	    int num2 = sc.nextInt();
	    System.out.println("Enter Third Number");
	    int num3 = sc.nextInt();
	    System.out.println("Enter Fourth Number");
	    int num4 = sc.nextInt();
	    if(num1 == num2 && num2 == num3 && num3 == num4){
	        System.out.println("Numbers are equal");
	    }
	    else{
	        System.out.println("Numbers are not equal");
	    }
		
	}
}