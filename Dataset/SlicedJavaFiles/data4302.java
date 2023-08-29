public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] d = line.split(" ");
        int gnum = Integer.valueOf(d[0]);
        int cnum = Integer.valueOf(d[1]);
        int level = Integer.valueOf(d[2]);
        _gnum = gnum;
        _cnum = cnum;
        _needs = (gnum + 1) / 2;
        if (gnum % 2 == 0) {
        	_needs += 1;
        }
        _level = level;
        
        int[][] grl = new int[gnum][2];
        for (int g = 0 ; g < gnum ; g++) {
        	line = br.readLine();
        	String[] gg = line.split(" ");
        	grl[g][0] = Integer.valueOf(gg[0]);
        	grl[g][1] = Integer.valueOf(gg[1]);
        }
        
        for (int a = 0 ; a < gnum ; a++) {
            for (int b = 0 ; b < gnum - 1 ; b++) {
            	if (grl[b][1] < grl[b+1][1]) {
            		int tmp = grl[b][0];
            		grl[b][0] = grl[b+1][0];
            		grl[b+1][0] = tmp;
            		tmp = grl[b][1];
            		grl[b][1] = grl[b+1][1];
            		grl[b+1][1] = tmp;
            	}
            } 	
        }
        
        int ag = 0;
        int xnum = cnum;
        for (int g = 0 ; g < gnum ; g++) {
        	int needs = (100 - grl[g][1]) / 10;
        	int roy = 0;
        	if (needs <= xnum) {
        		xnum -= needs;
        		roy = 100;
        	} else {
        		roy = grl[g][1] + xnum * 10;
        		xnum = 0;
        	}
        	if (roy >= 100) {
        		ag++;
        	}
        }
        if (ag >= _needs) {
        	System.out.println(1.0);
        	return;
        }
        
        candydfs(grl, 0, _cnum);
        
        System.out.println(_maxans);
        br.close();
	}
}