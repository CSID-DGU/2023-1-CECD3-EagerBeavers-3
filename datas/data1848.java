public class Main{	public static void main(String[] args) throws IOException {
		int n = in.nextInt();
		TreeSet <Vector> vectors = new TreeSet <> ();
		for(int i = 0; i < n; i ++) {
			Vector v = new Vector(in.nextLong(), in.nextLong(), i);
			vectors.add(v);
		}
		while(vectors.size() > 2) {
			//System.out.println(vectors);
			//stop(500);
			
			TreeSet <Vector> support = new TreeSet <> ();
			
			while(vectors.size() > 0) {
				Vector curr = vectors.pollFirst();
				Vector next1 = vectors.higher(curr);
				Vector next2 = vectors.lower(curr.negate());
				Vector next3 = vectors.higher(curr.negate());
				Vector next4 = vectors.lower(curr);
				
				//System.out.println("CURR: " + curr + "\n" + next1 + "\n" + next2);
				
				if(next1 != null) {
					if(ok(curr, next1)) {
						support.add(curr.add(next1));
						vectors.remove(next1);
						continue;
					}
				}
				if(next1 != null) {
					if(ok(curr, next1.negate())) {
						support.add(curr.subtract(next1));
						vectors.remove(next1);
						continue;
					}
				}
				if(next2 != null) {
					if(ok(curr, next2)) {
						support.add(curr.add(next2));
						vectors.remove(next2);
						continue;
					}
				}
				if(next2 != null) {
					if(ok(curr, next2.negate())) {
						support.add(curr.subtract(next2));
						vectors.remove(next2);
						continue;
					}
				}
				if(next3 != null) {
					if(ok(curr, next3)) {
						support.add(curr.add(next3));
						vectors.remove(next3);
						continue;
					}
				}
				if(next3 != null) {
					if(ok(curr, next3.negate())) {
						support.add(curr.subtract(next3));
						vectors.remove(next3);
						continue;
					}
				}
				if(next4 != null) {
					if(ok(curr, next4)) {
						support.add(curr.add(next4));
						vectors.remove(next4);
						continue;
					}
				}
				if(next4 != null) {
					if(ok(curr, next4.negate())) {
						support.add(curr.subtract(next4));
						vectors.remove(next4);
						continue;
					}
				}
				
				support.add(curr);
			}
			
			vectors = support;
		}
		
		if(vectors.size() == 2) {
			Vector curr = vectors.pollFirst();
			Vector next = vectors.pollFirst();
			Vector add = curr.add(next);
			Vector sub = curr.subtract(next);
			if(sub.euclideanNorm() <= add.euclideanNorm())
				vectors.add(sub);
			else
				vectors.add(add);
		}
		
		//System.out.println(vectors.first().euclideanNorm());
		
		StringBuilder buffer = new StringBuilder();
		int[] ans = new int[n];
		dfs(vectors.pollFirst(), ans);
		for(int i = 0; i < n; i ++)
			buffer.append(ans[i] + " ");
		System.out.println(buffer);
	}
}