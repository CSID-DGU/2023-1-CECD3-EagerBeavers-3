public class Main{    public static void main(String[]args)throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder=new StringBuilder();

        String temp[]=bufferedReader.readLine().split(" ");
        int V=Integer.parseInt(temp[0]);
        int E=Integer.parseInt(temp[1]);
        adjList=new HashSet[V];
        for(int i=0;i<V;i++)
            adjList[i]=new HashSet<>();
        for(int i=0;i<E;i++){
            temp=bufferedReader.readLine().split(" ");
            int x=Integer.parseInt(temp[0])-1;
            int y=Integer.parseInt(temp[1])-1;
            adjList[y].add(x);
            adjList[x].add(y);
        }
        stringBuilder.append(solve(V)+"\n");
        System.out.println(stringBuilder);
    }
}