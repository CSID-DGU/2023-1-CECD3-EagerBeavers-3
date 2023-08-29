public class Main{	public static void main(String[] args) {
		FS in = new FS();
		K = in.nextInt();
		sz = new int[K];
		valToBucket = new HashMap<Long, Integer>();
		vs = new long[K][];
		curSum = new long[K];
		sum = 0;
		for(int i = 0; i < K; i++) {
			sz[i] = in.nextInt();
			vs[i] = new long[sz[i]];
			for(int j = 0; j < sz[i]; j++) {
				long v = in.nextLong();
				sum += v;
				curSum[i] += v;
				vs[i][j] = v;
				valToBucket.put(v, i);
			}
		}
		
		if(sum % K != 0) {
			System.out.println("No");
			return;
		}
		
		sum /= K;
		maskIfPick = new int[K][];
		//go through if i pick each node
		for(int i = 0; i < K; i++) {
			maskIfPick[i] = new int[sz[i]];
			for(int j = 0; j < sz[i]; j++) {
				
				int mask = (1<<i);
				boolean works = false;
				long curLookfor = (sum - (curSum[i]-vs[i][j]));
				while(true) {
					if(!valToBucket.containsKey(curLookfor)) break;
					int nextBucket = valToBucket.get(curLookfor);
					if(nextBucket == i) {
						works = curLookfor == vs[i][j];
						break;
					}
					else if((mask & (1<<nextBucket)) > 0) break;
					else {
						mask |= (1<<nextBucket);
						curLookfor = (sum - (curSum[nextBucket]-curLookfor));
					}
				}
				if(works) maskIfPick[i][j] = mask;
			}
		}
//		System.out.println("S= "+sum);
		dp = new int[1<<K];
		Arrays.fill(dp, -1);
		int res = go(0);
		if(res == 0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
			pickId = new int[K];
			newBox = new int[K];
			Arrays.fill(pickId, -1);
			buildback(0);
			for(int i = 0; i < K; i++) {
				System.out.println(vs[i][pickId[i]]+" "+(newBox[i]+1));
			}
		}
		
	}
}