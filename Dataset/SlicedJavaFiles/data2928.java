public class Main{    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int uno = 4;
        int dos = n-4;

        while(isPrime(dos) || isPrime(uno)){
            dos--;
            uno++;
        }

        System.out.println(uno+" "+dos);
        
    }
}