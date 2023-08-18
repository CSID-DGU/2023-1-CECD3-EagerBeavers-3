public class Main{	public static void main(String[] args) {	
		
		int N = sc.nextInt();
		ArrayList<Integer>[] l = new ArrayList[N];
		HashMap<Long,Integer> map = new HashMap<Long,Integer>();
		long sum = 0;
		long[] s = new long[N];
		for(int i=0;i<N;i++) {
			l[i] = new ArrayList<Integer>();
			int n = sc.nextInt();
			for(int j=0;j<n;j++) {
				int a = sc.nextInt();
				map.put((long)a, i);
				s[i] += a;
				sum += a;
				l[i].add(a);
			}
		}
		if(Math.abs(sum)%N!=0) {
			System.out.println("NO");
			return;
		}
		long make = sum/N;
		boolean[] dp = new boolean[(1<<N)];
		int[] first = new int[(1<<N)];
		int[] bef = new int[(1<<N)];

		Arrays.fill(first,mod);
		for(int i=0;i<N;i++) {
			for(int a:l[i]) {
				int used = 0;
				boolean f = true;
				long now = a;
				int see = i;
				while(true) {
					long next = make-(s[see]-now);
					
					if(next==a) {
						break;
					}
					if(!map.containsKey(next)) {
						f = false;
						break;
					}else {
						int k = map.get(next);
						if(mp.contains(used,k)&&k!=i) {
							f = false;
							break;
						}else {
							used = mp.bitadd(used,k);
							now = next;
							see = k;
						}
					}
				}
				if(f) {
					dp[mp.bitadd(used,i)] = true;
					first[mp.bitadd(used,i)] = a;
				}
			}
		}
		
		dp[0] = true;
		for(int i=1;i<(1<<N);i++) {
			for(int j=i;j>0;j=(j-1)&i) {
				if(dp[i^j]&&dp[j]) {
					dp[i]=true;
					bef[i] = j;
				}
			}
		}
		
		if(!dp[(1<<N)-1]) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
			ArrayDeque<Integer> q = new ArrayDeque<Integer>();
			int[] ans1 = new int[N];
			int[] ans2 = new int[N];
			q.add((1<<N)-1);
			while(!q.isEmpty()) {
				int Q = q.poll();
				if(first[Q]==mod) {
					q.add(bef[Q]);
					q.add(Q^bef[Q]);
				}else {
					
					int a = first[Q];
					long now = a;
					int befo = map.get((long)a);
					while(true) {
						long next = make-(s[befo]-now);
						if(next==a) {
							int k = map.get(next);
							ans1[k] = (int)next;
							ans2[k] = befo;
							break;
						}
						int k = map.get(next);
						ans1[k] = (int)next;
						ans2[k] = befo;
						now = next;
						befo = k;
					}
				}
			}
			for(int i=0;i<N;i++) {
				System.out.println(ans1[i]+" "+(ans2[i]+1));
			}
			
		}
		
		
		
		
	
	
	}
}