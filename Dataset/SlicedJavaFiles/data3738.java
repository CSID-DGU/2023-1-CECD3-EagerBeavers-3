public class Main{	public static void main(String[] args) throws IOException {
		
		
		is = System.in;
		int n = ni();
		int[] a = na(n);
		long[] fact = new long[n+2];
		fact[0] = 1;
		for (int i = 1; i < fact.length; i++) {
			fact[i] = (fact[i-1]*i)%mod;
		}
		
		HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int cp = a[i];
			int sfree = 1;
			for(int p = 2; p*p <= a[i] && cp > 1; p++){
				int count = 0;
				while(cp % p == 0){
					cp /= p;
					count++;
				}
				if(count % 2 == 1) sfree *= p;
			}
			if(cp != 1) sfree *= cp;
			if(!hm.containsKey(sfree)) hm.put(sfree, new ArrayList<Integer>());
			hm.get(sfree).add(a[i]);
		}
		
		
		
		counts = new int[hm.size()];
		int dex = 0;
		
		//System.out.println(hm);
		long bigmult = 1;
		for(Integer key : hm.keySet()){
			ArrayList<Integer> list = hm.get(key);
			counts[dex++] = list.size();
			bigmult = bigmult*fact[list.size()] % mod;
//			HashMap<Integer,Integer> dups = new HashMap<>();
//			for(int x : list){
//				if(!dups.containsKey(x)){
//					dups.put(x, 0);
//				}
//				dups.put(x, dups.get(x)+1);
//			}
			
//			for (int k : dups.keySet()) {
//				int amount = dups.get(k);
//				long tomult = new BigInteger(fact[amount]+"").modInverse(new BigInteger(mod+"")).longValue();
//				bigmult*= tomult;
//				bigmult %= mod;
//			}
			
		}
		Arrays.sort(counts);
		sufsum = new int[counts.length];
		for(int i = counts.length-2; i >= 0; i--){
			sufsum[i] = sufsum[i+1]+counts[i+1];
		}
			
		choose = new long[2*n+3][2*n+3];
		for(int i = 0; i < choose.length; i++){
			choose[i][0] = 1;
			for(int j = 1; j <=i; j++){
				choose[i][j] = (choose[i-1][j]+choose[i-1][j-1])%mod;
			}
		}
		
		memo = new long[counts.length][700];
		for (int i = 0; i < memo.length; i++) {
			Arrays.fill(memo[i], -1);
		}
		//System.out.println("bigmult: " + bigmult);
		System.out.println((bigmult*dp(counts.length-2,counts[counts.length-1]-1))%mod);
	}
}