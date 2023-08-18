public class Main{    public static void main(String[] args) throws IOException {
        int test = f.nextInt();

//        System.out.println(MAX_N);

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 1 ; i <= MAX_N ; i++) {
            set.add(i*i*2);
            set.add(i*i*4);
        }

//        System.out.println(set);

        for(int t = 1 ; t <= test ; t++) {
            int n = f.nextInt();
            if(set.contains(n)) {
                sb.append("YES").append("\n");
            }
            else {
                sb.append("NO").append("\n");
            }

        }
        System.out.println(sb);
    }
}