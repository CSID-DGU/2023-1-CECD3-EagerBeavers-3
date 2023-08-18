public class Main{    public static void main(String[] args)throws Throwable {
        MyScanner sc=new MyScanner();
        PrintWriter pw=new PrintWriter(System.out);

        int n=sc.nextInt();

        String [] s={"M","L","S","XL","XS","XXL","XXS","XXXL","XXXS"};
        int [] cnt=new int [9];
        for(int i=0;i<n;i++){
            String t=sc.next();
            for(int j=0;j<9;j++)
                if(t.equals(s[j]))
                    cnt[j]++;
        }
        for(int i=0;i<n;i++){
            String t=sc.next();
            for(int j=0;j<9;j++)
                if(t.equals(s[j]))
                    cnt[j]--;
        }
        for(int i=0;i<9;i++)
            cnt[i]=Math.abs(cnt[i]);
        int ans=0;
        for(int i=0;i<9;i++)
            ans+=cnt[i];
        pw.println(ans/2);
        pw.flush();
        pw.close();
    }
}