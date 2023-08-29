public class Main{	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(), h = sc.nextInt() , n = sc.nextInt();
		TreeSet<Integer> vCuts = new TreeSet<>() , hCuts = new TreeSet<>();
		TreeMap<Integer, Integer> vSegments = new TreeMap<>() , hSegments = new TreeMap<>();
		vCuts.add(0);vCuts.add(w);
		hCuts.add(0);hCuts.add(h);
		insert(vSegments, w, 1);
		insert(hSegments, h, 1);
		StringBuilder sb = new StringBuilder();
		while(n-->0)
		{
			if(sc.next().equals("H"))
				cut(hCuts, hSegments, sc.nextInt());
			else
				cut(vCuts, vSegments, sc.nextInt());
			sb.append(1l*hSegments.lastKey() * vSegments.lastKey() + "\n");
		}
		System.out.println(sb);
	}
}