public class Main{	public static void main(String[] args) throws Exception{
		int n = readInt();
		a = readInt();
		b = readInt();
		ts = new TreeSet<Integer>();
		int[] table = new int[n];
		for(int i = 0; i<n; i++){
			table[i] = readInt();
			ts.add(table[i]);
		}
		A = new HashSet<Integer>();
		B = new HashSet<Integer>();
		noAns = false;
		for(Integer cur:ts){
			boolean fitsA = false;
			boolean fitsB = false;
			if(A.contains(cur) || B.contains(cur)){
				continue;
			}
			if(ts.contains(a-cur)){
				fitsA = true;
			}
			if(ts.contains(b-cur)){
				fitsB = true;
			}
			if(fitsA && fitsB){
				continue;
			}
			else if(!(fitsA || fitsB)){
				noAns = true;
			}
			else if(fitsA){
				tour(cur, false);
			}
			else if(fitsB){
				tour(cur, true);
			}
		}
		for(Integer cur:ts){
			if(A.contains(cur) || B.contains(cur)){
				continue;
			}
			else{
				A.add(cur);
			}
		}
		if(!noAns){
			System.out.println("YES");
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i< n; i++){
				if(A.contains(table[i])){
					sb.append("0");
				}
				else{
					sb.append("1");
				}
				sb.append(" ");
			}
			System.out.println(sb);
		}
		else{
			System.out.println("NO");
		}
	}
}