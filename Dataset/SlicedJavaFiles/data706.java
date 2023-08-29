public class Main{    public static void main(String[] args)throws Exception{
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int i = 0;i<cases;i++){
            String str = in.next();
            if(str.charAt(0)=='R' && str.charAt(1)>='0'&&str.charAt(1)<='9' && str.indexOf('C')!=-1){
                System.out.println(toA(str));
            }
            else System.out.println(toB(str));
        }
        
    }
}