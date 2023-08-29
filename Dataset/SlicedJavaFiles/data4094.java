public class Main{	public static void main(String[] args) {

		sx = in.nextInt();
		sy = in.nextInt();
		Arrays.fill(dp, -2);

		int n = in.nextInt();
		points = new int[n][3];

		for (int i = 0; i < n; i++) {
			points[i][0] = in.nextInt();
			points[i][1] = in.nextInt();
			points[i][2] = (sx - points[i][0]) * (sx - points[i][0]) + (sy - points[i][1]) * (sy - points[i][1]);
		}

		//System.out.println("ANS");
		System.out.println(solve(0));
		
		int mask=0;
		while(true){
			System.out.print(0+" ");
			if (mask==(1<<n)-1) break;
			int x = sol[mask];
			int count=0;
			for(int i=0; i<n; i++){
				if ((x&(1<<i))!=0) {
					count++;
					System.out.print((i+1)+" ");
					mask|=(1<<i);
				}
				if (count==2) break;
				
			}
		}
		System.out.println();

	}
}