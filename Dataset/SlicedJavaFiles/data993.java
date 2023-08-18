public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.valueOf(input[0]);
        int K = Integer.valueOf(input[1]);
        long sum = 0;
        for(int i = 0; i < N; i++){
            if(sum - (N - i) == K){
                System.out.println(Integer.valueOf(N-i));
                return;
            }
            sum += (i+1);
        }
        System.out.println("0");
    }
}