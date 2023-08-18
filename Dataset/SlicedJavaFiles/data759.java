public class Main{	public static void main(String args[]){
		InputReader in = new InputReader(System.in);
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		//----------My Code----------
		int n=in.nextInt();
		int l=0,r=0;
		String s=in.nextLine();
		HashSet<Character> size=new HashSet<>();
		for(int i=0;i<n;i++){
			char p=s.charAt(i);
			size.add(p);
		}
		int chk=size.size();
		HashMap<Character, Integer> hm=new HashMap<>();
		int ans=Integer.MAX_VALUE;
		while(l<n){
			if(hm.size()<chk && r<n){
				char p=s.charAt(r);
				if(hm.containsKey(p)){
					hm.put(p, hm.get(p)+1);
				}
				else{
					hm.put(p, 1);
				}
				r++;
			}
			else{
				char p=s.charAt(l);
				if(hm.get(p)==1){
					hm.remove(p);
				}
				else{
					hm.put(p, hm.get(p)-1);
				}
				l++;
			}
			if(hm.size()==chk){
				ans=Math.min(ans, r-l);
			}
		}
		out.println(ans);
		out.close();
		//---------------The End------------------
 
	}
}