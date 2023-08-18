public class Main{    public static void main(String ar[]) throws Exception { 
        
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(buff.readLine());
        if(input==0){
            System.out.println("0 0 0");
        }else if(input==1){
            System.out.println("0 0 1");
        }else if(input==2){
            System.out.println("0 1 1");
        }else if(input==3){
            System.out.println("1 1 1");
        }else {
            int output[] = checkFibo(input);
            int get[] = checkFibo(output[1]);
            output[0] = get[1];
            output[1] = get[2];
            System.out.print(output[0]);
            System.out.print(" " + output[1]);
            System.out.println(" " + output[2]);    
        }
    }
}