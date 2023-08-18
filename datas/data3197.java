public class Main{	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String cur = sc.nextToken();
		int first = Integer.parseInt(cur);
		if(cur.length() > 1){
			String second = cur.substring(0,cur.length()-1);
			if(Character.isDigit(second.charAt(second.length()-1))){
				first = Math.max(first, Integer.parseInt(second));
			}
		}
		
		if(cur.length() > 2){
			String third = cur.substring(0,cur.length()-2) + cur.charAt(cur.length()-1);
			if(Character.isDigit(cur.charAt(cur.length()-2))){
				first = Math.max(first, Integer.parseInt(third));
			}
		}
		System.out.println(first);
		out.close();
	}
}