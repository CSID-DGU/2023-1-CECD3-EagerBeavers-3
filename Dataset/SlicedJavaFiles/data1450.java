public class Main{    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(str.nextToken());
        int x = Integer.parseInt(str.nextToken());
        int y = Integer.parseInt(str.nextToken());
        long c = Long.parseLong(str.nextToken());
        if(c == 1){
            System.out.println(0);
            return;
        }
        long high = 1;
        while(howMany(n, x, y, high) < c){
            high <<= 1;
        }
        long low = high>>1;
        while(high - low > 1){
            long med = (high+low)/2;
            if(howMany(n, x, y, med) < c){
                low = med;
            }else{
                high = med;
            }
        }
        System.out.println(high);
    }
}