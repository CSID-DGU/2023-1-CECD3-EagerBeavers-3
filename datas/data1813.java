public class Main{	public static void main(String[] args) {
		Reader r = new Reader();
		int filters = r.nextInt();
		int devices = r.nextInt();
		int sockets = r.nextInt();
		
		List<Integer> filtery = new ArrayList<>();
		for (int i = 0; i < filters; i++) {
			filtery.add(r.nextInt()-1);
		}
		
		//System.out.println(filtery);
		
		if(devices <= sockets){
			System.out.println(0);
			return;
		}else{
			Collections.shuffle(filtery);
			Collections.sort(filtery);
			devices -= sockets;
			int act = filtery.size()-1;
			int result = 0;
			while(devices > 0){
				//System.out.println(devices + " " + act);
				if(act < 0){
					System.out.println(-1);
					return;
				}
				devices -= filtery.get(act);
				act--;
				result++;
			}
			System.out.println(result);
		}
	}
}