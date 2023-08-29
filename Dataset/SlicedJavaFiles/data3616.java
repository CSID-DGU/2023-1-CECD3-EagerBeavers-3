public class Main{    public static void main(String[] args)throws Exception {
        n = nextInt();
        m = nextInt();
        int k = nextInt();
        int[][] mas = new int[k][2];
        
        for(int i = 0; i<k; i++) {
            mas[i][0] = nextInt()-1;
            mas[i][1] = nextInt()-1;
        }
        
        mind = new int[n][m];
        used = new boolean[n][m];
        for(int i = 0; i<n; i++) {
            Arrays.fill(mind[i], Integer.MAX_VALUE);
        }
        
        ArrayDeque<int[]> ad = new ArrayDeque<int[]>();
        
        for(int i = 0; i<k; i++) {
            ad.add(new int[] {mas[i][0], mas[i][1], 0});
        }
        
        while(!ad.isEmpty()) {
            int[] cur = ad.remove();
            
            if(used[cur[0]][cur[1]])continue;
            int x = cur[0]; int y = cur[1]; int d = cur[2];
            mind[x][y] = ++d;
            used[x][y] = true;
            //if(isValid(x+1,y+1) && !used[x+1][y+1])   ad.add(new int[] {x+1,  y+1, d});
            if(isValid(x+1,y)   && !used[x+1][y])   ad.add(new int[] {x+1,  y,   d});
            //if(isValid(x+1,y-1) && !used[x+1][y-1])   ad.add(new int[] {x+1,  y-1, d});
            if(isValid(x,y+1)   && !used[x][y+1])   ad.add(new int[] {x,    y+1, d});
            if(isValid(x,y-1)   && !used[x][y-1])   ad.add(new int[] {x,    y-1, d});
            //if(isValid(x-1,y+1) && !used[x-1][y+1])   ad.add(new int[] {x-1,  y+1, d});
            if(isValid(x-1,y)   && !used[x-1][y])   ad.add(new int[] {x-1,  y,   d});
            //if(isValid(x-1,y-1) && !used[x-1][y-1])   ad.add(new int[] {x-1,  y-1, d});
        }
        
        int max = Integer.MIN_VALUE;
        int maxx = 0, maxy = 0;
        
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(mind[i][j] > max) {
                    max = mind[i][j];
                    maxx = i+1;
                    maxy = j+1;
                }
            }
        }
        
        out.println(maxx + " " + maxy);
        out.flush();
    }
}