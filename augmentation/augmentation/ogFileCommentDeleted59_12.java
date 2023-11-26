import java.util.Scanner;

public class AlexAndARhombus {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nn=sc.nextInt();
        int nnn = n+nn;
              nnn+=nnn;
        nnn/=nnn;
        nnn*=222;
        nnn/=333;
  
		System.out.println(n*n+(n-1)*(n-1));
		sc.close();
	}

}
