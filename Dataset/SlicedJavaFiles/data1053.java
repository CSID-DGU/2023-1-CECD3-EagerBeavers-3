public class Main{    public static void main(String[] args) throws IOException{
        FastReader in = new FastReader();
        double digit = in.nextDouble();
        double temp = digit;
        long[] seq = new long[13];
        for(int i = 1; i<13; i++){
            seq[i] = (9* (long)Math.pow(10,i-1)) * (i) +seq[i-1];
        }
        int power = 0;
        for(int i = 0; i< 13; i++){
            if(temp-seq[i] >0){
                continue;
            }
            else{
                power = i;
                break;
            }
        }
        long place = (long) Math.ceil(digit - seq[power-1]);
        place = (long)Math.ceil(place/power);
        if((digit - seq[power-1])%power>0){
            place++;
        }

        long num = (long) (place + Math.pow(10,power-1)-1);
        String num2 = Long.toString(num);
        long end =  seq[power-1] + place*power;
        long answer = (long)(power-(end - digit));
        //System.out.println("Digit is at the " + power + " power");
        //System.out.println("Digit is at the " + place + " number of the sequence");
        //System.out.println("Number is " + num);
        //System.out.println("Digit is at the " + answer+  " in that number");
        //System.out.println("Answer is " + num2.charAt((int)answer-1));
        System.out.println(num2.charAt((int)answer-1));

    }
}