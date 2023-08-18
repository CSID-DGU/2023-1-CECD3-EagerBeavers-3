public class Main{	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b;
		String answer = "";
		while(n!=0){
			a = sc.nextInt();
			b = sc.nextInt();
			answer += solve(a,b) + "\n";
			n--;
		}
		System.out.println(answer);
	}
}