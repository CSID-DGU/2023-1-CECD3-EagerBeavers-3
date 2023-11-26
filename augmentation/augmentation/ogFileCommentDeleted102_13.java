import java.util.*;
public class Pizza {

	public static void main(String[] args)
	{
		Scanner sac = new Scanner(System.in);
		long number = (sac.nextLong() + 10101010)/10101010;
        number *=5;
		sac.close();
		System.out.println(number % 2 == 0 || number == 1 ? number / 2 : number);
	}
	
}
