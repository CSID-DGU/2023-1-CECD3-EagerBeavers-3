public class Main{        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;

                int n = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine());
                int a[] = new int[n];
                for(int i=0 ; i<n ; i++) {
                        a[i] = Integer.parseInt(st.nextToken());
                }

                Arrays.sort(a);

                boolean vis[] = new boolean[n];
                int count = 0;
                for(int i=0 ; i<n ; i++) {
                        if(!vis[i]) {
                                for(int j=i ; j<n ; j++) {
                                        if(!vis[j]) {
                                                if(a[j]%a[i] == 0) {
                                                        vis[j] = true;
                                                }
                                        }
                                }
                                count++;
                        }
                }

                System.out.println(count);
        }
}