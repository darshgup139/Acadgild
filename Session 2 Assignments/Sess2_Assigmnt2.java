import java.util.Scanner;

public class Sess2_Assigmnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l,height;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the height of the pattern:");
		height=inputReader.nextInt();
		 for ( i = 0; i < height; i++) {
		        for (j = 0; j < height; j++) {
		            if (i == j || i + j == height - 1) {//Points with co-ordinates (0,0) or (0,4) etc.
		                System.out.print("*");
		            } else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    }
	
			
	}

}
/*
******************************************************************************
Enter the height of the pattern:
5
*   *
 * * 
  *  
 * * 
*   *
******************************************************************************
*/