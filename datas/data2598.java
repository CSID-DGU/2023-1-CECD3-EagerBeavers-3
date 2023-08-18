public class Main{    public static void main(String[] args)
    {
		int n = io.getInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = io.getInt();
		
		Arrays.sort(a);
		int[] color = new int[n];
		int num = 1;
		for(int i=0; i<n; i++){
			if(color[i]==0){
				for(int j=i+1; j<n; j++){
					if(a[j]%a[i]==0)
						color[j] = num;
				}
				num++;
			}
		}
		
		io.println(num-1);

		
		
		
        io.close();
    }
}