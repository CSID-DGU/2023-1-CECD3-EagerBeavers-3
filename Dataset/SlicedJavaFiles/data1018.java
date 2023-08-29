public class Main{    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        long []a = new long[16];
        a[0] = 0;
        for(int i=1; i<16; ++i)
            a[i] = a[i-1]+((9*(long)Math.pow(10, i-1))*i);
        long N = in.nextLong();
        int pos = 0;
        for(int i=0; i<16; ++i){
            if(N<=a[i]){
                pos = i;
                break;
            }
        }
        if(pos==1){
            System.out.println(N);
            System.exit(0);
        }
        long prev = a[pos-1];
        long curr = N;
        long rem = curr - prev;
        long ans = 0;
        for(int i=1; i<pos; ++i){
            ans = ans*10 + 9;
        }
        long g = (rem+(pos-1))/pos;
        long take = (rem+(pos-1))%pos;
        long number = ans + g;
        String str = Long.toString(number);
        System.out.println(str.charAt((int)take));
    }
}