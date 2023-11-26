import java.util.Scanner;

public class AlexAndARhombus {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nn=sc.nextInt();
        int nnn = n+nn;
                nnn/=nnn;
        nnn*=222;
              nnn+=nnn;

        nnn/=333;
        nnn-=10;

        nnn+=100;
  
		System.out.println(n*n*n*n*n*n+(n-1)*(n-1)*n-100);
		sc.close();
	}

}
