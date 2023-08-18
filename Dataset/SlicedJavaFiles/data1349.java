public class Main{	public static void main(String[] args) {
		Scanner qwe = new Scanner(System.in);
		
		int n = qwe.nextInt();
		
		//! x11 y11 x12 y12 x21 y21 x22 y22" 
		
		
		
		int x11 = bins(true,1,2,n,qwe,true);
		int y11 = bins(true,1,2,n,qwe,false);
		int x12 = bins(false,0,1,n,qwe,true);
		int y12 = bins(false,0,1,n,qwe,false);
		int x21 = bins(true,0,1,n,qwe,true);
		int y21 = bins(true,0,1,n,qwe,false);
		int x22 = bins(false,1,2,n,qwe,true);
		int y22 = bins(false,1,2,n,qwe,false);
		
		int[] xsl = {x11,x21};
		int[] xsr = {x12,x22};
		int[] ysl = {y11,y21};
		int[] ysr = {y12,y22};
		
		
		int[] ans = new int[8];
		
		for(int xpl = 0; xpl < 2; xpl++){
			for(int xpr = 0; xpr < 2; xpr++)
				for(int ypl = 0; ypl < 2; ypl++){
					for(int ypr = 0; ypr < 2; ypr++){
						
						if(xsl[xpl] <= xsr[xpr] && xsl[1-xpl] <= xsr[1-xpr] && ysl[ypl] <= ysr[ypr] && ysl[1-ypl] <= ysr[1-ypr]){
							System.out.printf("? %d %d %d %d",xsl[xpl],ysl[ypl],xsr[xpr],ysr[ypr]);
							System.out.println();
							System.out.flush();
							int response1 = qwe.nextInt();
							
							System.out.printf("? %d %d %d %d",xsl[1-xpl],ysl[1-ypl],xsr[1-xpr],ysr[1-ypr]);
							System.out.println();
							System.out.flush();
							int response2 = qwe.nextInt();
							
							if(response1 == 1 && response2 == 1){
								ans = new int[]{xsl[xpl],ysl[ypl],xsr[xpr],ysr[ypr],xsl[1-xpl],ysl[1-ypl],xsr[1-xpr],ysr[1-ypr]};
							}
							
						}
						
						
					}
				
				
				
			}
		}
		
		
		System.out.printf("! %d %d %d %d %d %d %d %d",ans[0],ans[1],ans[2],ans[3],ans[4],ans[5],ans[6],ans[7]);
		System.out.println();
		System.out.flush();
		
		qwe.close();
	}
}