public class Main{	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> map1 = new HashMap<>(), map2 = new HashMap<>(); int N = readInt();
		for(int i = 1; i<=N; i++) {
			String s = read(); if(!map1.containsKey(s)) map1.put(s, 1); else map1.put(s, map1.get(s)+1);
		}
		int tot = 0; for(int i = 1; i<=N; i++) {
			String s = read(); if(!map2.containsKey(s)) map2.put(s, 1); else map2.put(s, map2.get(s)+1);
		}
		for(String s : map2.keySet()) {
			tot += Math.max(0, map2.get(s) - (map1.containsKey(s) ? map1.get(s) : 0));
		}
		println(tot); exit();
	}
}