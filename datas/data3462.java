public class Main{    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            String in = scanner.next();
            int max = 0;
            for(int j=0;j<in.length()-1;j++){
                for(int i=j;i<in.length();i++){
                    if(in.indexOf(in.substring(j, i)) != in.lastIndexOf(in.substring(j, i)) && (i-j)>max){
                        max = i-j;
                    }
                }
            }
            System.out.println(max);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}