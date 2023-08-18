public class Main{    public static void main(String[] args) throws IOException { 
    //    Scanner sc=new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        br = new BufferedReader(new InputStreamReader(System.in));
        int n=nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nextInt();
        }
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int a=arr[i];
                c++;
                for(int j=i;j<n;j++){
                  //  System.out.println(arr[i]+" "+arr[j]);
                    if(arr[j]%a==0){
                        arr[j]=0;
                    }
                }
            }
        }
        pw.println(c);
        pw.close();

    }
}