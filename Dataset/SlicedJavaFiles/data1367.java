public class Main{	public static void main(String [] args){
		try (Scanner s = new Scanner(System.in)){
			final long n = s.nextLong();
			final long k = s.nextLong();
			System.out.println(howMany(n, k));
		}
	}
}