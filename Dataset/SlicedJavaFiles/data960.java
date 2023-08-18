public class Main{	public static void main(String[] args) throws NumberFormatException, IOException {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 0;
		int cont = 0;
		while(cont<b) {
			i++;
			cont+=i;
		}
		
		if(i+cont-b==a) {
			System.out.println(cont-b);
		}else {
			while(i+cont-b!=a) {
				i++;
				cont+=i;
			}
			System.out.println(cont-b);
		}
	}
}