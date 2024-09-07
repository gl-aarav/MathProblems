//Aarav Goyal
/* 9-6-24
 * Period: 6
 * 
 * MathProblems.java
 * 
 * This program declares and initializes variables, stores the results of and
 * expression in a variable, then prints the variable using println as well as
 * printf and Format to print a double to two places, ints, and a char.
 * 
 * Working on: Declare & Initilaise variables, formatting using printf & Format
 */

public class MathProblems
{
	public static void main(String[] Args)
	{
		double  prob1 = 5.6*1.7/3 - 49%11/2; 
		int  prob2 = 16-17*(5%6/3); 
		char prob3 = (char)(56/2+17*3-9%9);
		int prob4 = (int)((double)9/12*3-6.5);
		double prob5 = (int)('g')+(double)('2')/7;
		
		System.out.println("\n\n\n1) 5.6*1.7/3 - 49%11/2= " + Format.left (prob1,5,2));
		System.out.println("2) 16-17*(5%6/3)= " + prob2);
		System.out.println("3) (char)56/2+17*3-9%9 = " + prob3);
		System.out.println("4) (int)(double)9/12*3-6.5 = " + prob4);
		System.out.println("5) (int)('g')+(double)('2')/7 = " + Format.left (prob5,5,2));
		

		System.out.println("\n\n\n");




	}

}