public class Main{    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        long l = in.nextLong();
        long r = in.nextLong();
        
        if(r-l < 2 ){
            System.out.println("-1");
        }
        
        else if(r-l == 2 && l %2 ==1){
            System.out.println("-1");
        }
        else{
            
            
            if(l%2 == 0){
                System.out.println(l+ " "+(l+1)+" "+(l+2));
                
            }
            else{
                System.out.println((l+1)+ " "+(l+2)+" "+(l+3));
            }
        }
            
        }
}