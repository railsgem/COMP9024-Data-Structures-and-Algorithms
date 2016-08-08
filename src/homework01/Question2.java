package homework01;

/**
 * Q2 Write a Java program that takes two arrays a and b of length n storing int values, and returns the
 * dot product of a and b. That is, it returns an array c of length n such that c[i]=a[i]*b[i].
 * 
 * @author yingchen
 *
 */

class ArraySizeException extends Exception {
	public ArraySizeException() {
		super();
	}

	public ArraySizeException(String s) {
		super(s);
	}
}
public class Question2 extends Exception{
	
	public int[] compute(int[] a, int[] b) throws ArraySizeException {
		if (a.length != b.length) {
			throw new ArraySizeException("arrays must have same length");
		}
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] * b[i];
		}
		return c;
	}
	
	public static void main(String[] args) throws Exception{
		Question2 q2 = new Question2();
		
		//test
		int a[] = {1, 2, 3, 4, 5};
		int b[] = {1, 2, 3, 4, 8};
		int c[] = new int[5];
		c = q2.compute(a, b);
		for (int i = 0; i < c.length; i++)
			System.out.print(c[i] + ", ");
		System.out.println();
		
		//test
		int f[] = {1, 2, 3, 4, 5};
		int d[] = {1, 2, 3, 4};
		int e[] = new int[5];
		e = q2.compute(f, d);
		for (int i = 0; i < e.length; i++)
			System.out.print(e[i] + ", ");
	}

}
