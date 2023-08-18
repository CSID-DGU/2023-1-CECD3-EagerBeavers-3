public class Main{    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in) ;
        PrintWriter pw = new PrintWriter(System.out);   
     int k=in.nextInt(), n=in.nextInt(), s=in.nextInt(), p=in.nextInt() ;
     int paper =n/s; 
     if(n%s!=0) paper++ ; 
     paper*=k ; 
     int fin = paper/p ; 
     if(paper%p!=0) fin++ ; 
        System.out.println( fin );
       
       
 }               
}