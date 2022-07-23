package shree3;
import java.util.Scanner;

//demonstration of comparing string and other objects.
//right rotate array as well.

class cl {
	int k, arr[][];
	long l;
	cl (int k) {
		this.k = k;
	}
	void meth (int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			int temp[] = arr[i];
			for (int j = 0; j < temp.length; j++)
				System.out.print(temp[j] + " ");
			System.out.println();
		}
	}
}

public class Strmatch {
	@Override
	protected void finalize () throws Throwable {
		super.finalize();
	}
	int f = 3;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		int a[][] = new int[][] {{1, 2, 4}, {4, 5, 3}, {5, 3, 2}};
		
		String str = "tutorial";
		String str2 = "tutorial";
		String s = "null";
		System.out.println(s);
		System.out.println(str.indexOf("tor"));
		System.out.println(str.matches("tor"));
		
		Strmatch strm = new Strmatch();
		Strmatch strm2 = new Strmatch();
		System.out.println(strm.f);
		
		cl obj = new cl(3);
		cl obj2 = obj;
		obj.meth(a);
		
		//right rotate array
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{2, 5, 3, 6};
		int n = arr.length;
		int r = 3;
		for (int i = 0; i < r; i++) {
			int temp = arr[n - 1];
			for (int j = n - 2; j >= 0; j--) 
				arr[j + 1] = arr[j];
			arr[0] = temp;
		}
		for (int k = 0; k < n; k++)
			System.out.print(arr[k]);
		System.out.println();
		
		strm.finalize();
		System.out.println(strm2.hashCode());
		//strm = null;
		//System.gc();
		System.out.println(obj == obj2);
		System.out.println(str == str2);
	}

}
