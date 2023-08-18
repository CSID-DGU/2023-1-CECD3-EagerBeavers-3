public class Main{    public static void main(String args[])throws Exception{
        br=new BufferedReader(new InputStreamReader(System.in));

        int nm[] = toIntArray();
        int n = nm[0];
        int a = nm[1];
        int b = nm[2];
        nm=toIntArray();
        Arrays.sort(nm);
        int k=nm[b-1];
        int res=nm[b]-k;
        System.out.println(res);

    }
}