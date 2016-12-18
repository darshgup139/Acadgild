import java.util.Scanner;

public class Sess2_Assigmnt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int highest,a,b,c;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the 3 integers:");
		a=inputReader.nextInt();
		b=inputReader.nextInt();
		c=inputReader.nextInt();
		highest=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(highest);
	}

}
/*
******************************************************************************
Enter the 3 integers:
11
12
10
12
******************************************************************************
*/