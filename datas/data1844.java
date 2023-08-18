public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wide = new int[n], sta = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
        	wide[i] = sc.nextInt();
        	hm.put(wide[i], i + 1);
        }
        Util.sort(wide);
        sc.nextLine();
        String s = sc.nextLine();
        int tp = 0, pos = 0;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
        	int t;
        	if (s.charAt(i) == '0') {
        		t = wide[pos++];
        		sta[tp++] = t;
        	} else t = sta[--tp];
        	out.append(hm.get(t) + " ");
        }
        System.out.println(out.toString());
        sc.close();
    }
}