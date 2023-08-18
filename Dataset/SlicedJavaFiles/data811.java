public class Main{    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();

        int[] primes = getPrimesFast(N);
        Set<Integer> ints = new HashSet<Integer>();
        for(int i=0;i<primes.length;i++) {
            ints.add(primes[i]);
        }

        for(int i=1;i<primes.length;i++) {
            ints.remove(primes[i] + primes[i-1]+1);
        }

        boolean res = primes.length - ints.size() >= K;
        System.out.print(res?"YES":"NO");
        
    }
}