public class Main{    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
        	list.add(sc.nextInt());
        }
        int count = 0;
        while (list.size() > 0) {
        	count++;
        	int temp = list.get(minIndex(list));
//        	pw.println("min = " + temp);
        	for (int j = 0; j < list.size(); j++) {
        		if (list.get(j) % temp == 0) {
//        			pw.println("j = " + list.get(j));
//        			pw.println("min = " + temp);
        			list.remove(j);
        			j--;
        		}
        	}
//        	for (int i = 0; i < list.size(); i++) {
//        		pw.println(list.get(i) + " ");
//        	}
        }
        pw.println(count);
        
        pw.close();
    }
}