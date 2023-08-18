public class Main{	public static void main(String[] args) {
		int t = input.nextInt();
		for(int test = 0; test < t; test++){
			n = input.nextInt();
			int num = input.nextInt();
			if(num == 1){
				n--;
				recur("");
			}else{
				System.out.println("ERROR");
			}
		}
	}
}