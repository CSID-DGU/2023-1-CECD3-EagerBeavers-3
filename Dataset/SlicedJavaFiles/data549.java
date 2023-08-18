public class Main{	public static void main(String[] havish) throws Exception{
		// TODO Auto-generated method stub
 		sc = new MyScanner();
 		out = new PrintWriter(System.out);
 		int t = sc.nextInt();
 		for(int i = 0;i<t;i++){
 			int n  =sc.nextInt();
 			if (n%2== 1)
 				out.println("NO");
 			else{

 				while(n%2 == 0){
 					n/=2;
 				}
 				verdict(isSquare(n) || isSquare(2*n));
 				

 			}
 		}
 		out.close();
 		
 	}
}