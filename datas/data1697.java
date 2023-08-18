public class Main{    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        double nm[][]=new double[n][2];
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            nm[i][0]=a-(double)b/2;
            nm[i][1]=a+(double)b/2;
        }


        Arrays.sort(nm, new ArrayColumnComparator(1));

        int sum=0;
        for(int i=0;i<n-1;i++){
            if(nm[i+1][0]-nm[i][1]==t)
                sum++;
            else if(nm[i+1][0]-nm[i][1]>t){
                sum+=2;
            }

        }

        System.out.println(sum+2);
    }
}