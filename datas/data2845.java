public class Main{public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long b =  Long.parseLong(st.nextToken());
        long c =  Long.parseLong(st.nextToken());
        if(c-b<2 ||((c-b==2)&& GCD(c,b)==1) ){
            System.out.println("-1");
        }else{
                if(b%2==0 ){
                    System.out.println(b+" "+(b+1)+" "+(b+2));
            }else
                System.out.println((b+1)+" "+(b+2)+" "+(b+3));
        
    
    
}
        

        

}
}