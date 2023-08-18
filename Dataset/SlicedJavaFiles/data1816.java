public class Main{	public static void main(String args[]) throws NumberFormatException, IOException{
		Scanner sc=new Scanner();
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		int[] array=new int[N];
		for(int i=0;i<N;i++)
			array[i]=sc.nextInt();
		Arrays.sort(array);
		int val=K;
		int index=N - 1;
		while(index>=0 && val<M){
			val--;
			val+=array[index];
			index--;
		}
		if (val<M)
			System.out.println("-1");
		else
			System.out.println((N - 1) - index);
	}
}