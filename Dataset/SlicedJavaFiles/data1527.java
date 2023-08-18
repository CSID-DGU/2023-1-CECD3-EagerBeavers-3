public class Main{    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Integer[] a = scanner.getIntArray(n);
        Arrays.sort(a);
        TreeSet<Integer> res = new TreeSet<Integer>();
        for (Integer i: a){
            if (!res.contains(i/k)||(i%k!=0))
                res.add(i);
        }
        println(res.size());
    }
}