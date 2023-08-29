public class Main{	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//idea 1 : K/2�������� �����ؼ�, �� �ּڰ� *2�� �ϸ� �ȴ�
		//bfs�� i,jĭ�� ũ�ų� ���� ���� ������ �����ϸ�, ��� cut
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = pint(st.nextToken());
		m = pint(st.nextToken());
		k = pint(st.nextToken());
		
		//up down left right
		//0 is wall
		map = new int[n][m][4];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m-1; j++) {
				int temp = pint(st.nextToken());
				map[i][j][3]=temp;
				map[i][j+1][2]=temp;
			}
		}
		for (int i = 0; i < n-1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				int temp = pint(st.nextToken());
				map[i][j][1]=temp;
				map[i+1][j][0]=temp;
			}
		}
		
		ans = new int[n][m][k/2+1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(k%2==1) {
					sb.append("-1 ");
					continue;
				}
				
				int min=rec(i,j,0,k/2);
				
				sb.append(min*2).append(" ");
				
			}sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}