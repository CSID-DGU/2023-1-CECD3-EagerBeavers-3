public class Main{	public static void main(String[] args) {
		FastScanner input = new FastScanner();
		int n = input.nextInt();
		int radius = input.nextInt();
		ArrayList<Integer> diskXToFall = new ArrayList<Integer>();
		for (int a = 0; a < n; a++) {
			diskXToFall.add(input.nextInt());
		}
		ArrayList<P> stationaryDisks = new ArrayList<P>();
		for (int a = 0; a < n; a++) {
			double highCollision = radius;
			for (P i : stationaryDisks) {
				if (Math.abs(diskXToFall.get(a) - i.x) - 1e-8 <= 2 * radius) {
					double hypot = 2 * radius;
					double leg = Math.abs(diskXToFall.get(a) - i.x);
					double yOffset = Math.sqrt(Math.abs(hypot * hypot - leg * leg));
					highCollision = Math.max(highCollision, yOffset + i.y);
				}
			}
			stationaryDisks.add(new P(diskXToFall.get(a), highCollision));
		}
		for(int a = 0; a < n; a++) {
			System.out.print(stationaryDisks.get(a).y + " ");
		}
		

	}
}