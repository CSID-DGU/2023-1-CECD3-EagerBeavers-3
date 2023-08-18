public class Main{    public static void main(String[] args) {
        FS in = new FS(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        int numZ = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] == 0) numZ++;
        }
        
        Arrays.sort(arr);
        
        
        if(numZ > 1) {
            System.out.println("cslnb");
            return;
        }
        int numDup = 0;
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr2[i] = arr[i];
            if(i != 0) {
                if(arr2[i] == arr2[i-1]) {
                    arr2[i-1]--;
                    numDup++;
                }
            }
        }
        
        if(numDup > 1) {
            System.out.println("cslnb");
            return;
        }
        
        
        for(int i = 0; i < n; i++) {
            if(i != 0) {
                if(arr2[i] == arr2[i-1]) {
                    System.out.println("cslnb");
                    return;
                }
            }
        }
        long num = 0;
        if(numDup == 1) num++;
        for(int i = 0; i < n; i++) {
            num += arr2[i]-i;
        }
        
        if(num%2 == 0) {
            System.out.println("cslnb");
        } else {
            System.out.println("sjfnb");
        }
        

        out.close();
    }
}