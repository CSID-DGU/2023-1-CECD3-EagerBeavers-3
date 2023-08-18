public class Main{    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);  
        Main mm=new Main(); 
        long x=sc.nextLong();
            long k=sc.nextLong();
            if(x==0) {
                System.out.println(0);
            }
            else {
            long temp=mm.power(2, k, 1000000007);
            long temp1=(2*x-1)%(1000000007);
            long temp3=(temp1*temp)%(1000000007);
            System.out.println((temp3+1)%1000000007);
            }
    }
}