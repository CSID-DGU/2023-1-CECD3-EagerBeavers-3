public class Main{	public static void main(String[] args) throws Exception {
		int N = INT(), T = INT();
		House[] list = new House[N];
		for(int i = 0;i<N;i++) {
			list[i] = new House(INT(),INT());
		}
		Arrays.sort(list);
		int cnt = 2;
		for(int i = 1;i<N;i++) {
			int room = list[i].center-list[i-1].center;
			if(2*T<2*room-list[i].side-list[i-1].side)cnt += 2;
			else if(2*T==2*room-list[i].side-list[i-1].side)cnt++;
		}
		System.out.println(cnt);
		
	}
}