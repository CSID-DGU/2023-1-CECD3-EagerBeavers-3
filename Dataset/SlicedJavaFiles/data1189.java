public class Main{	        		        public static void main(String[] args) {
	        		        	InputReader(System.in);
	        		    		pw = new PrintWriter(System.out); 
	        		            new Thread(null ,new Runnable(){
	        		               public void run(){
	        		                   try{
	        		                       solve();
	        		                       pw.close();
	        		                   } catch(Exception e){
	        		                       e.printStackTrace();
	        		                   }
	        		               }
	        		           },"1",1<<26).start();
	        		       }
}