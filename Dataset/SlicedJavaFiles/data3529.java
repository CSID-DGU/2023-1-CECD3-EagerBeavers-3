public class Main{	public static void main(String[] args) throws Exception  {

		log(400*400*400);
		reader=new InputReader(System.in);
		int n=reader.readInt();
		mod=reader.readInt();
		
		System.out.println(solve(n));

	}
}