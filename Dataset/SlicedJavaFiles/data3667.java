public class Main{    public static void main(String[] args) throws IOException {
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
          BufferedReader in=new BufferedReader(new FileReader("input.txt"));
          BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
         StringTokenizer s = new StringTokenizer(in.readLine());
         int n=Integer.parseInt(s.nextToken());
         int m=Integer.parseInt(s.nextToken());
         fired=new boolean[n][m];
         Pair result=null;
         s = new StringTokenizer(in.readLine());
         int firenum=Integer.parseInt(s.nextToken());
         s = new StringTokenizer(in.readLine());
         int i;
         ArrayList<Integer> tree=new ArrayList<>();
         for(i=0;i<firenum*2;i++){
             tree.add(Integer.parseInt(s.nextToken())-1);
         }
        for(i=0;i<2*firenum-1;i+=2){
           fired[tree.get(i)][tree.get(i+1)]=true;
           q.add(new Pair(tree.get(i),tree.get(i+1)));
        }
        index=(Pair) q.peek();
         result=bfs((int)index.getKey(),(int)index.getValue(),n,m);
       int x1=(int)result.getKey()+1;
       int x2=(int)result.getValue()+1;
        String str = x1 + " " + x2;
        writer.write(str);

        writer.close();
    }
}