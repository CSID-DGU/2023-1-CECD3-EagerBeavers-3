public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = sc.nextInt();
        String S = sc.next();
        HashSet<Character> unique = new HashSet<>();
        for(char c : S.toCharArray()){
            unique.add(c);
        }
        int number = unique.size();

        Hashtable<Character, Integer> indexes = new Hashtable<>();
        TreeSet<Integer> tree = new TreeSet<>();

        int min = N+1;
        int total = 0;
        for(int i = 0; i<N; i++){
            char c = S.charAt(i);
            if(!indexes.containsKey(c)){
                total++;
                indexes.put(c, i);
                tree.add(i);
            }
            else{
                int old = indexes.get(c);
                indexes.put(c, i);
                tree.remove(old);
                tree.add(i);
            }

            if(total == number){
                int dist = tree.last() - tree.first() + 1;
                min = Math.min(dist, min);
            }
        }

        System.out.println(min);
    }
}