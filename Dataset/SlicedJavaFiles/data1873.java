public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for(int n=0;n<N;n++){
			arr[n] = in.nextInt();
		}
		
		Wavelet waveyMcWaveFace = new Wavelet(arr);
		
		BigInteger bigSum = BigInteger.ZERO;
		for(int n=0;n<N;n++){
			// calculate the amount added for all j = n all at once
			// it's a[j] - a[i]
			
			// step one
			// positive part
			long amtPlus = arr[n] * (long)(waveyMcWaveFace.numValsBtwn(1, arr[n] - 2, 0, n)
										+ waveyMcWaveFace.numValsBtwn(arr[n] + 2, 2147483647, 0, n));
			
			// step two
			// negative part
			long amtMinus = waveyMcWaveFace.sumOfValsBtwn(1, arr[n] - 2, 0, n)
							+ waveyMcWaveFace.sumOfValsBtwn(arr[n] + 2, 2147483647, 0, n);
			
//			System.out.println(amtPlus+" "+amtMinus);
			bigSum = bigSum.add(new BigInteger(""+(amtPlus - amtMinus)));
		}
		
		System.out.println(bigSum);
	}
}