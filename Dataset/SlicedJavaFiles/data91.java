public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //FileWriter f = new FileWriter("C:\\Users\\Ibrahim\\out.txt");
        PrintWriter pw = new PrintWriter(System.out);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int q = sc.nextInt();
        TreeSet<Integer>length= new TreeSet<>();
        length.add(0);
        length.add(n);
        TreeSet<Integer>width= new TreeSet<>();
        width.add(0);
        width.add(m);
        TreeMap<Integer,Integer>len= new TreeMap<>();
        len.put(n,1);
        TreeMap<Integer,Integer>wid= new TreeMap<>();
        wid.put(m,1);
        while (q-->0){
            String t= sc.next();
            if (t.equals("H")) {
                int x = sc.nextInt();
                int k1 = length.ceiling(x);
                int k2 = length.floor(x);
                if (x != k1) {
                    int s = k1 - k2;
                    int con = len.get(s);
                    if (con == 1) len.remove(s);
                    else len.put(s, con - 1);
                    len.put((k1 - x), len.getOrDefault((k1 - x), 0) + 1);
                    len.put((x - k2), len.getOrDefault((x - k2), 0) + 1);
                    length.add(x);
                }
            }
            else {
                int x = sc.nextInt();
                int k1 = width.ceiling(x);
                int k2 = width.floor(x);
                if (x != k1) {
                    int s = k1 - k2;
                    //System.out.println(s+" "+k1+" "+k2);
                    int con = wid.get(s);
                    if (con == 1) wid.remove(s);
                    else wid.put(s, con - 1);
                    wid.put((k1 - x), wid.getOrDefault((k1 - x), 0) + 1);
                    wid.put((x - k2), wid.getOrDefault((x - k2), 0) + 1);
                    width.add(x);
                }
            }
            pw.println(1l*len.lastKey()*wid.lastKey());
        }

        pw.flush();
    }
}