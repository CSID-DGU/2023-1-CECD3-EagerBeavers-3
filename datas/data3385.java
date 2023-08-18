public class Main{    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner in = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        String val = in.next();
        ArrayList<String> list = new ArrayList();
        for(int i = 0; i < val.length() ; i++){
            list.add(val.substring(i));
        }
        Collections.sort(list);
        int result = 0;
        for(int i = 1; i < list.size() ; i++){
            String other = list.get(i - 1);
            int temp = 0;
            for(int j = 0; j < list.get(i).length() && j < other.length() ; j++){
                if(other.charAt(j) == list.get(i).charAt(j)){
                    temp++;
                }else{
                    break;
                }
            }
            if(temp > result){
                result = temp;
            }
        }
        out.println(result);
        out.close();
    }
}