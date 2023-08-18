// package CF1141;

import java.io.*;
import java.util.*;

public class CF1141F1 {
    static FastReader s;
    static PrintWriter out;
    static String INPUT = "7\n" +
            "4 1 2 2 1 5 3\n";

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        out = new PrintWriter(System.out);
        s = new FastReader(oj);
        int n = s.nextInt();
        int[] arr = s.nextIntArray(n);
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

//        int max = Integer.MIN_VALUE;
        HashMap<Integer, ArrayList<pair>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(i == 0) {
                    ArrayList<pair> list = map.getOrDefault(sum[j], new ArrayList<>());
                    list.add(new pair(i, j));
                    map.put(sum[j], list);
                } else {
                    ArrayList<pair> list = map.getOrDefault(sum[j] - sum[i - 1], new ArrayList<>());
                    list.add(new pair(i, j));
                    map.put(sum[j] - sum[i - 1], list);
                }
            }
        }

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        ArrayList<pair> ans = null;
        for (int curr : keys) {
            ArrayList<pair> list = map.get(curr);
            Collections.sort(list);
            ArrayList<pair> smallAns = new ArrayList<>();
            smallAns.add(list.get(0));
            for (int k = 1; k < list.size(); k++) {
                if(list.get(k).start > smallAns.get(smallAns.size() - 1).finish) {
                    smallAns.add(list.get(k));
                }
            }

            if(ans == null) {
                ans = smallAns;
            } else {
                if(ans.size() < smallAns.size()) {
                    ans = smallAns;
                }
            }
        }

//        out.println(ans.size() + "\n" + ans);
//
//        out.println(map);
//
//        out.println(Arrays.toString(sum));
        StringBuilder ans1 = new StringBuilder();
        ans1.append(ans.size() + "\n");
        for (pair p : ans) {
            ans1.append((p.start + 1) + " " + (p.finish + 1));
            ans1.append("\n");
        }
        out.println(ans1);

        if (!oj) {
            System.out.println(Arrays.deepToString(new Object[]{System.currentTimeMillis() - time + " ms"}));
        }
        out.flush();
    }

    private static class pair implements Comparable<pair>{
        int start;
        int finish;

        public pair(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }


        @Override
        public int compareTo(pair o) {
            return Integer.compare(this.finish, o.finish);
        }

        @Override
        public String toString() {
            return this.start + " " + this.finish;
        }
    }
    private static class Matrix {

        static long[][] I;
        static long mod = 1000000007;

        public static long[][] exp(long[][] M, long n) {
            if (n <= 0) {
                I = new long[M.length][M.length];
                for (int i = 0; i < M.length; i++) {
                    I[i][i] = 1L;
                }
                return I;
            }
            if (n == 1) return M;
            long[][] res = exp(M, n / 2);
            res = mult(res, res);
            if (n % 2 == 0) return res;
            return mult(res, M);
        }

        public static long[][] mult(long[][] p, long[][] q) {
            long[][] r = new long[p.length][q[0].length];
            for (int i = 0; i < p.length; i++)
                for (int j = 0; j < q[0].length; j++)
                    for (int k = 0; k < q.length; k++) {
                        r[i][j] += p[i][k] * q[k][j];
                        r[i][j] %= mod;
                    }
            return r;
        }
    }

    private static class Maths {
        static ArrayList<Long> printDivisors(long n) {
            // Note that this loop runs till square root
            ArrayList<Long> list = new ArrayList<>();
            for (long i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (n / i == i) {
                        list.add(i);
                    } else {
                        list.add(i);
                        list.add(n / i);
                    }
                }
            }
            return list;
        }


        //    GCD - Using Euclid theorem.
        private static long gcd(long a, long b) {
            if (b == 0) {
                return a;
            }

            return gcd(b, a % b);
        }

        //    Extended euclidean algorithm
//    Used to solve equations of the form ax + by = gcd(a,b)
//    return array [d, a, b] such that d = gcd(p, q), ap + bq = d
        static long[] extendedEuclidean(long p, long q) {
            if (q == 0)
                return new long[]{p, 1, 0};

            long[] vals = extendedEuclidean(q, p % q);
            long d = vals[0];
            long a = vals[2];
            long b = vals[1] - (p / q) * vals[2];
            return new long[]{d, a, b};
        }

        // X ^ y mod p
        static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;

            while (y > 0) {
                if ((y & 1) == 1)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }

        // Returns modulo inverse of a
        // with respect to m using extended
        // Euclid Algorithm. Refer below post for details:
        // https://www.geeksforgeeks.org/multiplicative-inverse-under-modulo-m/
        static long inv(long a, long m) {
            long m0 = m, t, q;
            long x0 = 0, x1 = 1;

            if (m == 1)
                return 0;

            // Apply extended Euclid Algorithm
            while (a > 1) {
                q = a / m;
                t = m;
                m = a % m;
                a = t;
                t = x0;
                x0 = x1 - q * x0;
                x1 = t;
            }

            // Make x1 positive
            if (x1 < 0)
                x1 += m0;

            return x1;
        }

        // k is size of num[] and rem[].
        // Returns the smallest number
        // x such that:
        // x % num[0] = rem[0],
        // x % num[1] = rem[1],
        // ..................
        // x % num[k-2] = rem[k-1]
        // Assumption: Numbers in num[] are pairwise
        // coprime (gcd for every pair is 1)
        static long findMinX(long num[], long rem[], long k) {
            int prod = 1;
            for (int i = 0; i < k; i++)
                prod *= num[i];

            int result = 0;
            for (int i = 0; i < k; i++) {
                long pp = prod / num[i];
                result += rem[i] * inv(pp, num[i]) * pp;
            }

            return result % prod;
        }
    }

    private static class BS {
        //  Binary search
        private static int binarySearch(int[] arr, int ele) {
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == ele) {
                    return mid;
                } else if (ele < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }

        //    First occurence using binary search
        private static int binarySearchFirstOccurence(int[] arr, int ele) {
            int low = 0;
            int high = arr.length - 1;
            int ans = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == ele) {
                    ans = mid;
                    high = mid - 1;
                } else if (ele < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return ans;
        }


        //    Last occurenece using binary search
        private static int binarySearchLastOccurence(int[] arr, int ele) {
            int low = 0;
            int high = arr.length - 1;
            int ans = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == ele) {
                    ans = mid;
                    low = mid + 1;
                } else if (ele < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return ans;
        }
    }

    private static class arrays {
        // Merge sort
        static void merge(int arr[], int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;
            int L[] = new int[n1];
            int R[] = new int[n2];
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];
            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        static void sort(int arr[], int l, int r) {
            if (l < r) {
                int m = (l + r) / 2;
                sort(arr, l, m);
                sort(arr, m + 1, r);
                merge(arr, l, m, r);
            }
        }

        static void sort(int[] arr) {
            sort(arr, 0, arr.length - 1);
        }
    }

    private static class UnionFindDisjointSet {
        int[] parent;
        int[] size;
        int n;
        int size1;

        public UnionFindDisjointSet(int n) {
            this.n = n;
            this.parent = new int[n];
            this.size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }

            for (int i = 0; i < n; i++) {
                size[i] = 1;
            }

            this.size1 = n;
        }

        private int numDisjointSets() {
            System.out.println(size1);
            return size1;
        }

        private boolean find(int a, int b) {
            int rootA = root(a);
            int rootB = root(b);
            if (rootA == rootB) {
                return true;
            }
            return false;
        }

        private int root(int b) {
            if (parent[b] != b) {
                return parent[b] = root(parent[b]);
            }
            return b;
        }

        private void union(int a, int b) {
            int rootA = root(a);
            int rootB = root(b);
            if (rootA == rootB) {
                return;
            }

            if (size[rootA] < size[rootB]) {
                parent[rootA] = parent[rootB];
                size[rootB] += size[rootA];
            } else {
                parent[rootB] = parent[rootA];
                size[rootA] += size[rootB];
            }
            size1--;
            System.out.println(Arrays.toString(parent));
        }
    }

    private static class SegTree {
        int[] st;
        int[] arr;

        public SegTree(int[] arr) {
            this.arr = arr;
            int size = (int) Math.ceil(Math.log(arr.length) / Math.log(2));
            st = new int[(int) ((2 * Math.pow(2, size)) - 1)];
            buildSegmentTree(1, 0, arr.length - 1);
        }

        //**********JUST CALL THE CONSTRUCTOR, THIS FUNCTION WILL BE CALLED AUTOMATICALLY******
        private void buildSegmentTree(int index, int L, int R) {
            if (L == R) {
                st[index] = arr[L];
                return;
            }

            buildSegmentTree(index * 2, L, (L + R) / 2);
            buildSegmentTree(index * 2 + 1, (L + R) / 2 + 1, R);
//          Replace this line if you want to change the function of the Segment tree.
            st[index] = Math.min(st[index * 2], st[index * 2 + 1]);
        }

        //***********We have to use this function **************
        private int Query(int queL, int queR) {
            return Query1(1, 0, arr.length - 1, queL, queR);
        }

        //This is a helper function.
        //************* DO NOT USE THIS ****************
        private int Query1(int index, int segL, int segR, int queL, int queR) {
            if (queL > segR || queR < segL) {
                return -1;
            }

            if (queL <= segL && queR >= segR) {
                return st[index];
            }

            int ans1 = Query1(index * 2, segL, (segL + segR) / 2, queL, queR);
            int ans2 = Query1(index * 2 + 1, (segL + segR) / 2 + 1, segR, queL, queR);
            if (ans1 == -1) {
                return ans2;
            }

            if (ans2 == -1) {
                return ans1;
            }
//             Segment tree implemented for range minimum query. Change the below line to change the function.
            return Math.min(ans1, ans2);
        }

        private void update(int idx, int val) {
            update1(1, 0, arr.length - 1, idx, val);
        }

        private void update1(int node, int queL, int queR, int idx, int val) {
            // idx - index to be updated in the array
            // node - index to be updated in the seg tree
            if (queL == queR) {
                // Leaf node
                arr[idx] += val;
                st[node] += val;
            } else {
                int mid = (queL + queR) / 2;
                if (queL <= idx && idx <= mid) {
                    // If idx is in the left child, recurse on the left child
                    update1(2 * node, queL, mid, idx, val);
                } else {
                    // if idx is in the right child, recurse on the right child
                    update1(2 * node + 1, mid + 1, queR, idx, val);
                }
                // Internal node will have the min of both of its children
                st[node] = Math.min(st[2 * node], st[2 * node + 1]);
            }
        }
    }

    private static class FastReader {
        InputStream is;

        public FastReader(boolean onlineJudge) {
            is = onlineJudge ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        }

        byte[] inbuf = new byte[1024];
        public int lenbuf = 0, ptrbuf = 0;

        int readByte() {
            if (lenbuf == -1)
                throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0)
                    return -1;
            }
            return inbuf[ptrbuf++];
        }

        boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b))
                ;
            return b;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        char nextChar() {
            return (char) skip();
        }

        String next() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        String nextLine() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while ((!isSpaceChar(b) || b == ' ')) { // when nextLine, (isSpaceChar(b) && b != ' ')
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        char[] next(int n) {
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }

        int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
                ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
                ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        char[][] nextMatrix(int n, int m) {
            char[][] map = new char[n][];
            for (int i = 0; i < n; i++)
                map[i] = next(m);
            return map;
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        int[][] next2DInt(int n, int m) {
            int[][] arr = new int[n][];
            for (int i = 0; i < n; i++) {
                arr[i] = nextIntArray(m);
            }
            return arr;
        }

        long[][] next2DLong(int n, int m) {
            long[][] arr = new long[n][];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLongArray(m);
            }
            return arr;
        }

        int[] shuffle(int[] arr) {
            Random r = new Random();
            for (int i = 1, j; i < arr.length; i++) {
                j = r.nextInt(i);
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
            return arr;
        }

        int[] uniq(int[] arr) {
            Arrays.sort(arr);
            int[] rv = new int[arr.length];
            int pos = 0;
            rv[pos++] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) {
                    rv[pos++] = arr[i];
                }
            }
            return Arrays.copyOf(rv, pos);
        }
    }

}
