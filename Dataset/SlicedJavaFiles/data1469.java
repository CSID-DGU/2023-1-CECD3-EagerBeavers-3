public class Main{    public static void main(String[] args)throws Exception {        
        long l = parseLong(next());
        long r = parseLong(next());
        long [] min = new long [61];
        for(int i = 1 ; i <= 60 ; ++i){//(2^i)-1 is obtained by min[i]^min[i]+1
            min[i] = (long) pow(2, i - 1) - 1;          
        }
        for(int i = 60 ; i >= 0 ; --i){//try to get 2^i-1 as answer.                
            if(min[i] >= r)
                continue;
            if(min[i] >= l && min[i] + 1 <= r){             
                out.println((1L << i) - 1);
                out.flush();
                return;
            }
            if(min[i] < l){
                long one_jump = (long) pow(2, i);
                long  jumps = (long) ceil((l - min[i]) / (one_jump * 1.0));             
                long cur = min[i] + (jumps * one_jump);
                if(cur >= l && cur + 1 <= r){                                       
                    out.println((1L << i) - 1);
                    out.flush();
                    return;
                }               
            }
        }
        out.println(0);
        out.flush();
    }
}