public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);PrintWriter pw = new PrintWriter(System.out);
        int n=sc.nextInt(),d=sc.nextInt();int[] a = new int[n];int ans=2;a[0]=sc.nextInt();
        for (int i=1;i<n;i++){
            a[i]=sc.nextInt();
            if (a[i]-a[i-1]==2*d)ans++;
            else if (a[i]-a[i-1]>2*d)ans+=2;
        }
        System.out.println(ans);
    }
}