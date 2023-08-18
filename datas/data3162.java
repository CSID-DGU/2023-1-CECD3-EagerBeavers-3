public class Main{	public static void main(String args[]) throws NumberFormatException, IOException{
		Scanner sc = new Scanner();
		int T = sc.nextInt();
		if ( T > 0)
			System.out.println(T);
		else{
			String cad = (T + "");
			int min = Math.min(cad.charAt(cad.length() - 1) - '0', cad.charAt(cad.length() - 2) - '0');
			if (min == 0 && cad.length() == 3)
				System.out.println(0);
			else
				System.out.println(cad.substring(0, cad.length() - 2) + "" + min);
		}
	}
}