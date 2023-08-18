public class Main{    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        String input=br.readLine();
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<input.length();i++){
            set.add(input.charAt(i));
        }
        StringBuilder sb= new StringBuilder();
for(char x:set){
    sb.append(x);
}
        String substring1=sb.toString();
//        //System.out.println(substring1);
//        int[] count= new int[52];
//        int[] b= new int[52];
//
//        char k;
//        for(int i=0;i<substring1.length();i++){
//            k=substring1.charAt(i);
//            //System.out.println((int)'a');
//            count[(k-'A')]++;
//
//        }
//        for(int i=0;i<52;i++){
//          b[i]=count[i];
//
//            //System.out.println("count "+count[i]);
//        }
//        int answer=set.size();
//
//
//        for(int i=0;i<input.length();i++){
//
//        }
//        System.out.println(answer);
//
        //System.out.println("WAIT");
        System.out.println(solve(input,substring1).length());
        pw.close();
        br.close();
    }
}