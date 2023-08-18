public class Main{public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(bf.readLine());
	  System.out.println((n%4==0||n%7==0||n%47==0||n%74==0||n%447==0||n%474==0||n%477==0||n%744==0||n%747==0||n%774==0)?"YES":"NO");
}
}