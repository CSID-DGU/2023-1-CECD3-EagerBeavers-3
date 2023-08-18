public class Main{    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter w = new PrintWriter(System.out);

        //SWEEP LINE BABYY
        
        int n = Integer.parseInt(r.readLine());
        
        char[] pokemans = r.readLine().toCharArray();
        
        int[] counts = new int[52];
        boolean[] exists = new boolean[52];
        
        for (int i = 0; i < pokemans.length; i++) {
            exists[index(pokemans[i])] = true;
        }
        
        int left = 0, right = 0;
        counts[index(pokemans[0])] = 1;
        
        int answer = 1000000000;
        
        while (left < n && right < n) {
            if (!valid(counts, exists)) {
                //move right
                right++;
                if (right < n)
                counts[index(pokemans[right])]++;
            } else {
                answer = Math.min(answer, right - left + 1);
                left++;
                if (left - 1 >= 0)
                counts[index(pokemans[left - 1])]--;
            }
        }
        
        w.println(answer);
        w.flush();
    }
}