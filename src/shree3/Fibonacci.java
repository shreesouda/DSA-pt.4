package shree3;
import java.util.*;

public class Fibonacci {
	
	static void fibseq (int n) {
		
		//printing n terms of the fibonacci sequence.
		int temp = 0, n1 = 0, n2 = 1;
		if (n <= 0)
			System.out.println("Enter valid");
		else if (n == 1)
			System.out.println(n1);
		else if (n == 2)
			System.out.println(n1 + " " + n2);
		else {
			System.out.print(n1 + " " + n2 + " ");
			for (int i = 3; i <= n; i++) {
				temp = n1 + n2;
				n1 = n2;
				n2 = temp;
				System.out.print(temp + " ");
			}
			//return temp;
		}
	}
	
	int fibitr (int n) {
		//nth term in a fib sequence using iteration.
		int temp = 0, n1 = 0, n2 = 1;
		if (n <= 0)
			return -1;
		else if (n == 1)
			return n1;
		else if (n == 2)
			return n2;
		else {
			for (int i = 3; i <= n; i++) {
				temp = n1 + n2;
				n1 = n2;
				n2 = temp;
			}
			return temp;
		}
	}
	
	int fib (int n) {
		//nth term in a fib sequence using recursion.
		System.out.println(fibitr(n));
		if (n <= 0)
			return -1;
		else if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fibonacci fb = new Fibonacci();
		
		int n = sc.nextInt();
		sc.close();
		try {
		if (n < 0)
			throw new Exception();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fb.fib(n));
		System.out.println(fb.fibitr(n));
		fibseq(n);
		
	}

}
