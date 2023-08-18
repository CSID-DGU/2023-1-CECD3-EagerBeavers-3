public class Main{	public static void main(String[] args) {
		br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int[] a1 = readIntArr();
			int[] a2 = readIntArr();
			br.close();
			int f = a1[0];
			int d = a1[1];
			int s = a1[2];
			Arrays.sort(a2);

			if (d <= s)
				System.out.println(0);

			else {
				int cur = d - s + 1;

				
				int num=0;
				for(int i=0;i<f;i++){
					num++;
					cur-=a2[f-i-1];
					if(cur<=0)break;
					cur++;
				}
				if (cur > 0)
					System.out.println(-1);
				else{
					
				
					System.out.println(num);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}