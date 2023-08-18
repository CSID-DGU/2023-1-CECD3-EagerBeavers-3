public class Main{    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner();
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int[] data = new int[n];
        int[]u = new int[n];
        int[]s = new int[n];
        HashMap<Integer, Integer> map = new HashMap();
        
        for(int i = 0; i < n; i++){
            u[i] = i;
            data[i] = in.nextInt();
            map.put(data[i], i);
        }        
        boolean ok = true;
        boolean[]check = new boolean[n];
        for(int i = 0; i < n; i++){
            if(map.containsKey(a - data[i])){
                u[find(i, u)]= u[find(map.get(a- data[i]), u)];
                s[i] |= 1;
            }
            if(map.containsKey(b - data[i])){
                u[find(i, u)]= u[find(map.get(b- data[i]), u)];
                s[i] |= 2;
            }
            
        }
        int[]g = new int[n];
        Arrays.fill(g,3);
        for(int i = 0;  i< n; i++){
            if(s[i] == 0){
                ok = false;
                break;
            }
            g[find(i, u)] &= s[i];
            if(g[find(i,u)] == 0){
                ok = false;
                break;
            }
        }
        //System.out.println(Arrays.toString(g));
        if(ok){
            out.println("YES");
            for(int i = 0; i < n; i++){
                if((g[find(i,u)] & 1) == 0){
                    out.print(1 + " ");
                }else{
                    out.print(0 + " ");
                }
            }
        }else{
            out.println("NO");
        }

        out.close();
    }
}