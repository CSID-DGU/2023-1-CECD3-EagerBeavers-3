public class Main{	public static void main(String[] havish) throws Exception{
		// TODO Auto-generated method stub
 		sc = new MyScanner();
 		out = new PrintWriter(System.out);
 		int t = sc.nextInt();
 		while(t-->0) {
 	 		int n = sc.nextInt();
 	 		
 	 		Stack<Integer> st = new Stack<>();
 	 		Stack<Integer> temporary = new Stack<>();
 	 		for(int j = 0;j<n;j++){
 	 			int val = sc.nextInt();
 	 			boolean found = false;
 	 			while(!st.isEmpty()){
 	 				int temp = st.peek();
 	 				if (val == temp+1){
 	 					found = true;
 	 					st.pop();
 	 					break;
 	 				}
 	 				else{
 	 					temporary.add(st.pop());
 	 				}
 	 			}
 	 			if (!found){
	 	 			while(!temporary.isEmpty()){
	 	 				st.add(temporary.pop());
	 	 			}
 	 			}
 	 			st.add(val);
 	 			ArrayList<Integer> arr = new ArrayList<>();
 	 			
 	 			for(int s : st){
 	 				arr.add(s);
 	 			}
 	 			for (int s =0 ;s<arr.size()-1;s++){
 	 				out.print(arr.get(s));
 	 				out.print(".");
 	 			}
 	 			out.println(arr.get(arr.size()-1));
 	 			temporary.clear();
 	 		}
 			
 		}
 		
 		out.close();
 		
 	}
}