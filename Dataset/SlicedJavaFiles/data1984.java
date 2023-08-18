public class Main{	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner();
		N=sc.nextInt();
		K=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			array[i]=new team(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(array,0,N);
		/*
		for(int i=0;i<N;i++)
			System.out.println(array[i].problems);*/
		
		int shared=0;
		for(int i=K-1;i>=0 && array[K-1].igual(array[i]);i--,shared++);
		for(int i=K;i<N && array[K-1].igual(array[i]);i++,shared++);
		System.out.println(shared);
	}
}