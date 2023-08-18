public class Main{    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int[] num = new int[n];
        for(int i = 0 ; i < n ; i++){
        	num[i] = input.nextInt();
        }
        
        System.out.println(str(n,m,k,num));
    }
}