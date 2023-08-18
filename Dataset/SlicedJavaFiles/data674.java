public class Main{	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int nums = Integer.parseInt(reader.readLine());
		
		String line = reader.readLine();
		int[] ar = new int[nums];
		String[] par = line.split(" ");
		
		for(int i=0; i<nums; i++){
			ar[i] = Integer.parseInt(par[i]);
		}
		A a = new A();
		
		System.out.print(a.getDif(ar));
	}
}