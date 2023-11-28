import java.util.*;
public class Pizza {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong() + 1;
		sc.close();
		System.out.println(number % 2 == 0 || number == 1 ? number / 2 : number);
	}
	
}
