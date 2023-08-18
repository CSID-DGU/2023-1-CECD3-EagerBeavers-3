public class Main{      public static void main(String args[])throws IOException
    {
         Reader ob=new Reader();
        Writer out=new Writer(System.out);
        Random oo=new Random();
        long k=ob.nL(),ans=0,p=9,num=0;
        for(int i=1;i<18;i++)
        {
            if(num+i*p<k)
            {
                num+=i*p;p*=10;
                ans=0;
                for(int j=0;j<i;j++)
                ans=9+ans*10;
            }
            else
            {
                long left=k-num;
                long r=left/i;
                left-=r*i;
                ans+=r;
                if(left>0)
                {
                 String s=Long.toString(ans+1);
                
                out.pln(s.charAt((int)left-1));
            }
            else
            {
                
                String s=Long.toString(ans);
                
                out.pln(s.charAt(i-1-(int)left));
            }
                break;
            }
            
        }
out.flush();
}
}