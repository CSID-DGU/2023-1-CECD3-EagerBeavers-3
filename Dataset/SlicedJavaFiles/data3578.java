public class Main{    public static void main(String[] args){
        try(BufferedReader in = new BufferedReader(new FileReader("input.txt"));
                BufferedWriter out = new BufferedWriter(new FileWriter("output.txt")))
        {
            StringTokenizer s = new StringTokenizer(in.readLine());
            n = Integer.parseInt(s.nextToken());
            m = Integer.parseInt(s.nextToken());
            k = Integer.parseInt(in.readLine());
            visited = new boolean[n][m];
            q = new LinkedList <>();
            s = new StringTokenizer(in.readLine());
            for(int i=0;i<k;i++){
                int x = Integer.parseInt(s.nextToken());
                int y = Integer.parseInt(s.nextToken());
                q.add(new Pair(--x,--y));
            }
            bfs();
            String ans = "" + (result.x+1) +" "+ (result.y+1);
            out.write(ans);
        }catch(IOException e){

        }
    }
}