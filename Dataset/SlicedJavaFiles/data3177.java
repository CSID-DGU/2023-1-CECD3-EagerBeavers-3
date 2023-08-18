public class Main{	public static void main(String[] args)
	{
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int num2 = num/10;
		int num3 = num%10;
		int num4 = (num2/10)*10+num3;
		first fs = new first();
		int result = fs.max(num,num2,num4);
		System.out.println(result);
	}
}