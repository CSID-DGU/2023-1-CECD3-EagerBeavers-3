public class Main{	public static void main(String[] args) {		
	
		Scanner scan = new Scanner(System.in);
	
		int i , j , k , n , m;
		n = scan.nextInt();
		m = scan.nextInt();
		for (i = 0;i < n;i ++) {
			for (j = 0;j < m;j ++) {
				input[i][j] = scan.nextInt();
			}
		}
		for (i = 0;i < n;i ++) {
			for (j = i + 1;j < n;j ++) {
				int minDist = - 1;
				for (k = 0;k < m;k ++) {
					int dist = Math.abs(input[i][k] - input[j][k]);
					if (dist < minDist || minDist < 0) {
						minDist = dist;
					}
				}
				minDistBetweenRow[i][j] = minDistBetweenRow[j][i] = minDist;		
			}
		}
		for (i = 0;i < n;i ++) {
			for (j = 0;j < n;j ++) {
				if (i != j) {
					// i head , j tail
					int minDist = - 1;
					for (k = 0;k < m - 1;k ++) {						
						int dist = Math.abs(input[j][k] - input[i][k + 1]);
						if (dist < minDist || minDist < 0) {
							minDist = dist;
						}
					}
					minDistBetweenHeadAndTail[i][j] = minDist;
				}
			}
		}		
		for (i = 0;i < n;i ++) {
			int minDist = - 1;
			for (j = 0;j < m - 1;j ++) {
				int dist = Math.abs(input[i][j] - input[i][j + 1]);
				if (dist < minDist || minDist < 0) {
					minDist = dist;
				}
			}
			rowMinDist[i] = minDist;
		}
		int low = 0 , high = 1000000010;
		while (low < high) {
			int mid = (low + high) / 2;
			if (check(n , m , mid)) {				
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		System.out.println(high - 1);

	}
}