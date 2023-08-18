public class Main{public static void main(String[] args) throws Exception{
        
    div168C a=new div168C();
        Parserdoubt pd=a.new Parserdoubt(System.in);
        StringBuffer sb = new StringBuffer();
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int max=0;
        int n=pd.nextInt();
        int k=pd.nextInt();
        for(int i=0;i<n;i++){
            arr.add(pd.nextInt());
            max=Math.max(max, arr.get(i));
        }
        Collections.sort(arr);
    
        int count=0;
        int[] mat=new int[n+1];
        for(int i=n-1;i>=0;i--){
            if(mat[i]!=1){
                int x=arr.get(i);
                if(x%k==0){
                int ans=Collections.binarySearch(arr, x/k);
                
            //  System.out.println("index "+ans);
                
                if(ans>=0&&arr.get(ans)==(x/k)){
                    count++;
                    mat[ans]=1;
                }
                else{
                    count++;
                }
                }
                else{
                    count++;
                }
            }
        }
        /*for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        */
        if(n==1)
            count=1;
        System.out.println(count);
        
}
}