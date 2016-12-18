import java.util.Scanner;

public class Sess2_ExtraAssigmnt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputReader = new Scanner(System.in);
		String name, bloodGroup, std, stream;
		int rollNo;
		int continueLoop;
		do {
			System.out.println("Enter the details of the student:");
			System.out.println("Enter Name of the student:");
			name = inputReader.nextLine();
			System.out.println("Enter Standard of the student:");
			std = inputReader.nextLine();
			System.out.println("Enter Stream of the student:");
			stream = inputReader.nextLine();
			System.out.println("Enter Blood Group of the student:");
			bloodGroup = inputReader.nextLine();
			System.out.println("Enter Roll No. of the student:");
			rollNo = inputReader.nextInt();

			System.out.println();
			System.out.println("ID Card generated is as follows:");
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("Name:" + name + "\tRoll No:" + rollNo);
			System.out.println("Std:" + std + "\t\tStream:" + stream);
			System.out.println("Blood Group:" + bloodGroup);
			System.out.println("-----------------------------------------");
			
			System.out.println();
			System.out.println("Do you wish to generate more IDs?\n Press 1 for Yes and 0 for No ");
			continueLoop=inputReader.nextInt();
			inputReader.nextLine();
			System.out.println();
		} while (continueLoop==1);

	}
}
/*
******************************************************************************
Enter the details of the student:
Enter Name of the student:
Adarsh
Enter Standard of the student:
BE
Enter Stream of the student:
Comps
Enter Blood Group of the student:
b+ve
Enter Roll No. of the student:
7007

ID Card generated is as follows:

-----------------------------------------
Name:Adarsh	Roll No:7007
Std:BE		Stream:Comps
Blood Group:b+ve
-----------------------------------------

Do you wish to generate more IDs?
 Press 1 for Yes and 0 for No 
1

Enter the details of the student:
Enter Name of the student:
Manoj
Enter Standard of the student:
BE
Enter Stream of the student:
COmps
Enter Blood Group of the student:
B=ve
Enter Roll No. of the student:
9870

ID Card generated is as follows:

-----------------------------------------
Name:Manoj	Roll No:9870
Std:BE		Stream:COmps
Blood Group:B=ve
-----------------------------------------

Do you wish to generate more IDs?
 Press 1 for Yes and 0 for No 
0

******************************************************************************
*/