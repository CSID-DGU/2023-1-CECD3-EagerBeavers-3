public class Main{	public static void main(String[] args) throws IOException{
		// Solver Machine = new Solver() ;
		// Machine.Solve() ;
		// Machine.Finish() ;
		new Thread(null,new Runnable(){
			public void run(){
				Solver Machine = new Solver() ;
				try{
					Machine.Solve() ;
					Machine.Finish() ;
				}catch(Exception e){
					e.printStackTrace() ;
					System.out.flush() ;
					System.exit(-1) ;
				}catch(Error e){
					e.printStackTrace() ;
					System.out.flush() ;
					System.exit(-1) ;
				}
			}
		},"Solver",1l<<27).start() ;
	}
}