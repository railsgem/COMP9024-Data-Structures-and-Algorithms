package homework01;

import java.util.Scanner;

/**
 * 
 * Q1 Write a Java program that reads 10 integers from the keyboard and outputs all the pairs whose
 * sum is 30.
 * @author yingchen
 *
 */
public class questionOne {

	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter 10 integers.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter an integer:");
			while(!s.hasNextInt()) {
				s.nextLine();
				System.out.println("That's not an integer; please enter an integer: ");
			}
			a[i] = s.nextInt(); 
		}
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length; j++)
				if (a[i] + a[j] == 30)
					System.out.println(a[i] + "+" + a[j] + "= 30" );
	}
}
