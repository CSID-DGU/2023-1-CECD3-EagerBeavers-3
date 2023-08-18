public class Main{        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line);
            long n = Long.parseLong(tokenizer.nextToken());
            long k = Long.parseLong(tokenizer.nextToken());
            if (n == 1){
                System.out.println("0");
                return;
            }

            if (n <= k){
                System.out.println("1");
                return;
            }
            long first = 0;
            long end  = k;
            long mid;

            while (first < end){
                mid = first + (end - first)/2;
                if (is_exist(n, k , mid - 1)){
                    end = mid;
                } else {
                    first = mid + 1;
                }
            }
            if (is_exist(n, k, end - 1)){
                System.out.println((end ));
                return;
            }
            System.out.println("-1");
            return;

        }
}