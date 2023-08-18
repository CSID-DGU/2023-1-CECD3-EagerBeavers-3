public class Main{	public static void main(String args[]) {
		
		n = cin.nextInt();
		x = cin.nextInt();
		y = cin.nextInt();
		c = cin.nextLong();
		
		int low = 0, high = 1000000000;
		int ans = -1;
		while(low <= high) { 
			int mid = (low + high) / 2;
//			System.out.println(mid + " " + f(mid));
			if(f(mid) >= c) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println(ans);
	}
}