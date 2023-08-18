public class Main{    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        char[] input =  in.nextLine().toCharArray();
        int length = input.length;
        int max = 0;
        for(int i=0; i<length; i++){
            char[] subString = Arrays.copyOfRange(input, 1, input.length);
            int temp = solve(input, subString);
            if(temp > max) max = temp;
            input = Arrays.copyOfRange(input, 1, input.length);
        }
        System.out.println(max);
        
    }
}