public class Main{    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());
        char[] A = br.readLine().toCharArray();

        HashSet<Character> cndD = new HashSet<Character>();
        for(int i = 0; i < N; i++){
            cndD.add(A[i]);
        }

        int cnt = cndD.size();

        int a = 0;
        int b = 0;

        int ans = (1 << 30);
        HashMap<Character, Integer> d = new HashMap<Character, Integer>();
        while(b < N){
            if(d.containsKey(A[b])){
                if(A[a] == A[b]){
                    a++;
                    while(d.get(A[a]) > 1){
                        d.put(A[a], d.get(A[a])-1);
                        a++;
                    }
                } else{
                    d.put(A[b], d.get(A[b])+1);
                }
            } else{
                d.put(A[b], 1);
            }
            if(d.size() == cnt){
                ans = Math.min(b-a+1, ans);
            }
            b++;
        }

        pw.print(ans + "\n");
        pw.close();
        br.close();
    }
}