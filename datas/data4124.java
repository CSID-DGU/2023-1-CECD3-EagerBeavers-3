public class Main{	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		hx = sc.nextInt();
		hy = sc.nextInt();
		N = sc.nextInt();
		X = new int[N];
		Y = new int[N];
		for(int i = 0; i < N;i++){
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		DP = new int[1<<N];
		Arrays.fill(DP,-1);
		int ans = recur(0);
		ArrayList<Integer> aa = new ArrayList<Integer>();
		int U = 0;
		aa.add(0);
		int test = 0;
		while(U != (1<<N)-1){
			int a = 0;
			for(int i = 0; i < N;i++)
				if(((1<<i)&U) == 0){
					a = i;
					break;
				}		
			int ans2 = recur(U|(1<<a))+2*(pw(X[a]-hx)+pw(Y[a]-hy));
			int temp = 2*(pw(X[a]-hx)+pw(Y[a]-hy));
			int best = -1;
			for(int i = a+1;i<N;i++){
				if(((1<<i)&U) == 0){
					int ans3 = pw(X[a]-X[i])+pw(Y[a]-Y[i])+pw(X[a]-hx)+pw(Y[a]-hy)+pw(X[i]-hx)+pw(Y[i]-hy)+recur(U|(1<<a)|(1<<i));
					if(ans3 < ans2){
						ans2 = ans3;
						best = i;
						temp = pw(X[a]-X[i])+pw(Y[a]-Y[i])+pw(X[a]-hx)+pw(Y[a]-hy)+pw(X[i]-hx)+pw(Y[i]-hy);
					}
				}
			}
			if(best == -1){
				aa.add(a+1);
				aa.add(0);
				U |= (1<<a);
			}else{
				aa.add(a+1);
				aa.add(best+1);
				aa.add(0);
				U |= (1<<a) | (1<<best);
			}
			test += temp;
		}
//		System.out.println(test);
		if(test != ans)
			throw new RuntimeException();
		System.out.println(ans);
		for(int i = 0; i < aa.size();i++)
			System.out.print(aa.get(i)+(i == aa.size()-1?"":" "));
		System.out.println();
	}
}