public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[][] sub = new int[n][n];
        for (int i = 0; i < n; i++) {
            sub[i][i] = arr[i];
            for (int j = i + 1; j < n; j++) {
                sub[i][j] = sub[i][j - 1] + arr[j];
            }
        }

        HashMap<Integer, List<P>> hm = new HashMap<>();
        /*for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (hm.containsKey(sub[i][j])) {
                    hm.get(sub[i][j]).add(new P(i, j));
                } else {
                    List<P> temp = new ArrayList<>();
                    temp.add(new P(i, j));
                    hm.put(sub[i][j], temp);
                }
            }
        }*/
        for(int stop=0; stop<n; stop++) {
            for(int start=0; start<=stop; start++) {
                if (hm.containsKey(sub[start][stop])) {
                    hm.get(sub[start][stop]).add(new P(start, stop));
                } else {
                    List<P> temp = new ArrayList<>();
                    temp.add(new P(start, stop));
                    hm.put(sub[start][stop], temp);
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        /*for(Map.Entry it : hm.entrySet()) {
            int or = overlap(it.getValue());
            ans = Math.max(ans, or);
        }*/

        List<P> ansList = null;
        for (List<P> it : hm.values()) {
            int or = overlap(it);
            if(or>ans) {
                ans = or;
                ansList = it;
            }
        }

        List<P> processedList = extractOverlapping(ansList);

        System.out.println(ans);
        for(int i=0; i<processedList.size(); i++) {
            int A = processedList.get(i).a + 1;
            int B = processedList.get(i).b + 1;
            System.out.println(A + " " + B);
        }
    }
}