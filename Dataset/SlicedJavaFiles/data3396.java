public class Main{    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new InputStreamReader(System.in));
        String str = s.next();
        int x;
        int max= 0;
        
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                x = str.indexOf(str.substring(i,j),i+1) ;
                if (x != -1){
                    if (j-i > max) max = j-i;
                }
            }
        }
        System.out.println(max);
    }
}