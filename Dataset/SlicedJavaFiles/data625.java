public class Main{	public static void main(String[] args) throws IOException {
		int N = readInt(), D = readInt(); long arr[] = new long[N+2]; arr[0] = -3000000000L; arr[N+1] = -arr[0];
		for(int i = 1; i<=N; i++) arr[i] = readInt();
		int cnt = 1; if(Math.abs(arr[2]-(arr[1] + D)) >= D) cnt++; for(int i = 2; i<=N; i++) {
			if(Math.abs(arr[i-1]-(arr[i] - D)) > D) cnt++;
			if(Math.abs(arr[i+1]-(arr[i] + D)) >= D) cnt++;
		}
		println(cnt); exit();
	}
}