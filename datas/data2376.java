public class Main{	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] =new int[n];
		for(int i=0; i<=n-1; i++) {
			array[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int result = count(array);
		for(int i=1; i<=m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			result += (b-a)*(b-a+1)/2;
			result=result%2;
			if(result%2==1)
				System.out.println("odd");
			else
				System.out.println("even");
		}
	}
}