public class Main{    public static void main(String args[]){

        PrintWriter out = new PrintWriter(System.out);
        Reader in = new Reader();
        long k = in.nextLong();
        if(k<10){
            System.out.println(k);
            return;
        }
        long sum = 0;
        long cur = 9;
        long prev = 0;
        int count = 1;
        while(k>cur){
            k= k - cur;
            sum  = sum + cur/count;
            prev = cur;
            cur = 9*(count+1)*(long)Math.pow(10,count);
            count++;
        }

        long num = k/(count);
        sum = sum + num;

        if(k%count == 0){
            System.out.println(sum%10);
        }
        else{
            sum++;
            k = k%(count);
            String str = String.valueOf(sum);
            System.out.println(str.charAt((int)k-1));
        }






        out.flush();
        out.close();
    }
}