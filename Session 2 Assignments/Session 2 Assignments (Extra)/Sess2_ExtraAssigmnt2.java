import java.util.Scanner;

public class Sess2_ExtraAssigmnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		int i, j, k, n, row = 1, l, temp;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the no. of rows in the pyramid: ");
		n = inputReader.nextInt();
		temp = n;
		for (i = 1; i <= n+1; i++) { // To keep track no. of rows printed
			for (j = 1; j <= 2 * temp - 1; j++) {// To print 2n-1 spaces before printing the no.
				System.out.print(" ");
			}
			for (k = 1; k <= row; k++) {//To print no. of numbers corresponding to row no.
				System.out.print(k - 1 + " ");//k-1 because we want 1st element as 0 and not 1
			}

			for (l = row - 1; l >= 1; l--) {//To print (no. of numbers-1) corresponding to row no.
				System.out.print(l - 1 + " ");//l-1 because we want 1st element as 0 and not 1
			}
			System.out.println();
			row++;
			temp--;
		}

	}
}
/*
******************************************************************************
Enter the no. of rows in the pyramid: 
7
             0 
           0 1 0 
         0 1 2 1 0 
       0 1 2 3 2 1 0 
     0 1 2 3 4 3 2 1 0 
   0 1 2 3 4 5 4 3 2 1 0 
 0 1 2 3 4 5 6 5 4 3 2 1 0 
******************************************************************************
*/