public class Main{    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n=in.nextLong();
        k=in.nextLong();
        n--;
        k--;
        if(k*(k+1)/2<n)
            ans=-1;
        else
            ans=binsearch(0, k);
        System.out.println(ans);            
    }
}