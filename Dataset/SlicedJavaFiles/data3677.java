public class Main{    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        InputStream inputStream = System.in;
//        OutputStream outputStream = System.out;
//        InputReader s = new InputReader(inputStream);
//        PrintWriter out = new PrintWriter(outputStream);
        
        
         // input.txt / output.txt
         File file = new File("input.txt") ; 
         Scanner s = new Scanner(file) ; 
        
        int n = s.nextInt();
        int m = s.nextInt(); 
        
        marked = new boolean [n + 1 ][m + 1] ; 
        
        int k = s.nextInt();
        
        Queue<Point> queue = new LinkedList<Point>(); 
        
        
        for(int i =0 ; i < k ; ++i){
            int tempX = s.nextInt() ;
            int tempY = s.nextInt() ; 
            marked[tempX][tempY] = true ; 
            queue.add(new Point(tempX , tempY));             
        }
        
         Point c = null ;
        
         while(!queue.isEmpty()){
             c = queue.poll() ; 
            
            if(c.x>1 && !marked[c.x-1][c.y]){
                marked[c.x -1 ][c.y] = true ; 
                queue.add(new Point(c.x-1,c.y));
            }
            
            if(c.y>1 && !marked[c.x][c.y-1]){
                marked[c.x][c.y-1] = true ; 
                queue.add(new Point(c.x,c.y-1));
            }
            
            if(c.x < n  && !marked[c.x+1][c.y]){
                marked[c.x + 1 ][c.y] = true ; 
                queue.add(new Point(c.x + 1,c.y));
            }
            
            if(c.y < m && !marked[c.x][c.y+1]){
                marked[c.x][c.y+1] = true ; 
                queue.add(new Point(c.x,c.y+1));
            }
        }
        PrintWriter out = new PrintWriter(new File("output.txt"));
        out.println(c.x+" "+c.y); 
        out.close();

    }
}