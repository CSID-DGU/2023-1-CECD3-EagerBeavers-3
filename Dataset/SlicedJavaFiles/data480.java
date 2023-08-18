public class Main{    public static void main(String[] z){
        StreamTokenizer st = new StreamTokenizer(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), o=0;
        String i = "";
        ArrayList<String> l1 = new ArrayList<>(), l2 = new ArrayList<>();
        for(int q=0; q<a; q++){
            l1.add(s.next());
        }
        for(int q=0; q<a; q++){
            i = s.next();
            if(l1.contains(i)) l1.remove(i);
            else l2.add(i);
        }
        Collections.sort(l1);
        Collections.sort(l2);

        for(int q=0; q<l1.size(); q++){
            if(l1.get(q).charAt(l1.get(q).length()-1)!=l2.get(q).charAt(l2.get(q).length()-1)) o++;
        }
        System.out.println(o);
        pw.flush();
    }
}