public class Main{	public static void main(String[] args) throws FileNotFoundException {
		FasterScanner s = new FasterScanner();
		int test = 1;
		testloop: while (test-- > 0) {
			int n = s.nextInt();
			int left = 1;
			int right = n;
			int x[][] = new int[2][2];
			int y[][] = new int[2][2];
			while (left < right) {
				int mid = (left + right) / 2;
				query(1, mid, 1, n);
				int ans = s.nextInt();
				if (ans < 2) {
					left = mid + 1;
				} else {
					right = mid;
				}
			}
			x[0][0] = left;
			left = 1;
			right = n;
			while (left < right) {
				int mid = (left + right) / 2;
				query(1, mid, 1, n);
				int ans = s.nextInt();
				if (ans < 1) {
					left = mid + 1;
				} else {
					right = mid;
				}
			}
			x[0][1] = left;
			left = 1;
			right = n;
			while (left < right) {
				int mid = (left + right + 1) / 2;
				query(mid, n, 1, n);
				int ans = s.nextInt();
				if (ans < 2) {
					right = mid - 1;
				} else {
					left = mid;
				}
			}
			x[1][0] = left;
			left = 1;
			right = n;
			while (left < right) {
				int mid = (left + right + 1) / 2;
				query(mid, n, 1, n);
				int ans = s.nextInt();
				if (ans < 1) {
					right = mid - 1;
				} else {
					left = mid;
				}
			}
			x[1][1] = left;
			// System.out.println(Arrays.deepToString(x));

			left = 1;
			right = n;
			while (left < right) {
				int mid = (left + right) / 2;
				query(1, n, 1, mid);
				int ans = s.nextInt();
				if (ans < 2) {
					left = mid + 1;
				} else {
					right = mid;
				}
			}
			y[0][0] = left;
			left = 1;
			right = n;
			while (left < right) {
				int mid = (left + right) / 2;
				query(1, n, 1, mid);
				int ans = s.nextInt();
				if (ans < 1) {
					left = mid + 1;
				} else {
					right = mid;
				}
			}
			y[0][1] = left;
			left = 1;
			right = n;
			while (left < right) {
				int mid = (left + right + 1) / 2;
				query(1, n, mid, n);
				int ans = s.nextInt();
				if (ans < 2) {
					right = mid - 1;
				} else {
					left = mid;
				}
			}
			y[1][0] = left;
			left = 1;
			right = n;
			while (left < right) {
				int mid = (left + right + 1) / 2;
				query(1, n, mid, n);
				int ans = s.nextInt();
				if (ans < 1) {
					right = mid - 1;
				} else {
					left = mid;
				}
			}
			y[1][1] = left;
//			System.out.println(Arrays.deepToString(x));
//			System.out.println(Arrays.deepToString(y));
			
			int x11 = 0, x12 = 0, y11 = 0, y12 = 0;
			int x21 = 0, x22 = 0, y21 = 0, y22 = 0;
			for (int x1 = 0; x1 < 2; x1++) {
				x11 = x[1][x1];
				x21 = x[1][1 - x1];
				for (int x2 = 0; x2 < 2; x2++) {
					x12 = x[0][x2];
					x22 = x[0][1 - x2];
					if (x11 > x12)
						continue;
					if (x21 > x22)
						continue;
					for (int y1 = 0; y1 < 2; y1++) {
						y11 = y[1][y1];
						y21 = y[1][1 - y1];
						for (int y2 = 0; y2 < 2; y2++) {
							y12 = y[0][y2];
							y22 = y[0][1 - y2];
							if (y11 > y12)
								continue;
							if (y21 > y22)
								continue;
							query(x11, x12, y11, y12);
							int ans1 = s.nextInt();

							query(x21, x22, y21, y22);
							int ans2 = s.nextInt();
							if (ans1 == 1 && ans2 == 1) {
								System.out.println("! " + x11 + " " + y11 + " " + x12 + " " + y12 + " " + x21 + " "
										+ y21 + " " + x22 + " " + y22);
								System.out.flush();
								break testloop;
							}
						}
					}
				}
			}

		}
	}
}