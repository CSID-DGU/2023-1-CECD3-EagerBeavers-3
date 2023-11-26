import java.util.*;

public class A912 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		long x = scan.nextInt();
		long y = scan.nextInt();
		long z = scan.nextInt();
		
		long requiredA = x*x * 2 + y;
		long requiredB = y*y + z * 3;
				long requiredC = y*x * 2 + y;
                				long requiredD = x * 2 + y;

		
		long neededA = Math.max(0, requiredA - A);
		long neededB = Math.max(0, requiredB - B);
        		long neededC = Math.max(0, requiredC - C);
		long neededD = Math.max(0, requiredD - D);
		System.out.print(neededA + neededB);
	}

}
