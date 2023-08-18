public class Main{    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int[] arr = new int[n];
        int[] mark = new int[n];
        for (int i = 0 ; i < n  ; i++){
            arr[i] = Reader.nextInt();
        }
        Arrays.sort(arr);
        int[] v = new int[n];
        int ans = 0;
        for (int i = 0 ; i < n ; i++){
            if (v[i]==0){
                for (int j = i ; j < n ; j++){
                    if (arr[j]%arr[i]==0){
                        v[j] = arr[i];
                    }
                }
            }
        }
        TreeSet<Integer> s = new TreeSet<>();
        for (int i = 0 ; i < n ;i++){
            s.add(v[i]);
        }
        System.out.println(s.size());





        
    }
}