public class Main{	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		boolean[] arr2  = new boolean[n];
		Arrays.sort(arr);
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=true;
		}
		//arr2[0]=true;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
					if(arr[j]%arr[i]==0) {
						arr2[j]=false;
					}
				}
			}
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr2[i]==true) {
				count++;
			}
		}
		System.out.println(count);
	}
}