
public class Sess1_Assigmnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;
		System.out.println("The value of variables a and b are: " + a + " " + b);
		b = a-- - --a;//Val of a after this=18
		System.out.println("The value of expression (b = a-- - --a) is: " + b);
		int c = a--;//Val of a after this=17
		System.out.println("The value of expression (c = a--) is: " + c);
		int d = a >> 2;//Val of a after this=17
		System.out.println("The value of expression d = a >> 2 is: " + d);
		int e = a & b;//Val of a after this=17
		System.out.println("The value of expression (e = a & b) is: " + e);

	}

}
/*
******************************************************************************
The value of variables a and b are: 20 10
The value of expression (b = a-- - --a) is: 2
The value of expression (c = a--) is: 18
The value of expression d = a >> 2 is: 4
The value of expression (e = a & b) is: 0
******************************************************************************
*/