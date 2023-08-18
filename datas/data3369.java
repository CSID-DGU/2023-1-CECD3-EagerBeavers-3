public class Main{    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        
        int i;
        for(i=str.length()-1;i>=1;i--)
            if(isOK(str,i))
            {
        	break;
            }
        
        System.out.println(i);
    }
}