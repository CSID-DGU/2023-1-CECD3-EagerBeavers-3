public class Main{    public static void main (String[] args) throws java.lang.Exception
    {
     int n,a,b;
     Scanner obj=new Scanner(System.in);
    
     n=obj.nextInt();
    
     if(n%4==0){a=n/2;b=n/2;System.out.println(a+" "+b);}
     else if(n%2==0 && n%4!=0)
     {a=n/2-1;b=n/2+1;System.out.println(a+" "+b);}
     
     else if(n%2!=0)
     {  a=4;b=0;
       while(b!=1)
       { b=n-a;
         if(b%3==0){ System.out.println(a+" "+b);break; }
         else{a=a+2;}
       }
     }
    }
}