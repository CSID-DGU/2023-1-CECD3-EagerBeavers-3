public class Main{    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        Long []a = new Long[n];
        for (int i = 0; i<n; i++)
            a[i] = in.nextLong();
        HashSet<Long> hash = new HashSet<Long>();
        Arrays.sort(a);
        for (int i = 0; i<n; i++)
            if (!hash.contains(a[i])){
                hash.add(a[i] * k);
            }
        System.out.println(hash.size());
    }
}