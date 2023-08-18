public class Main{    public static void main(String[] args) throws IOException 
    { 
       Scanner sc=new Scanner(System.in); 
       //int T=sc.nextInt();
       int T=1;
       while(T-- > 0){
           int N=sc.nextInt();
           int a[]=new int[N];
           int count=0;
           int ans=0;
           boolean flag=false;

           for(int i=0;i<N;++i){
               a[i]=sc.nextInt();
           }
           Arrays.sort(a);
           for(int i=0;i<N;++i){
               if(a[i]==-1)
                continue;
            for(int j=i+1;j<N;++j){
                if(a[j]%a[i]==0 && a[j]!=-1){
                    a[j]=-1;;
                }
            }
           }
           //int i=0;
           for(int i=0;i<N;++i){
               if(a[i]!= -1)
               count++;
           }

           System.out.println(count);
        } // End of test cases loop 

        
    }//end of main function
}