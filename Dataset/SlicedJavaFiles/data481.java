public class Main{	public static void main(String[] args) {
		JS in = new JS();
		int n = in.nextInt();
		int m1 = 0;
		int s1 = 0;
		int l1 = 0;
		int ss1 = 0;
		int sss1 = 0;
		int ssss1 = 0;
		int ll1 = 0;
		int lll1 = 0;
		int llll1 = 0;
		
		int m2 = 0;
		int s2 = 0;
		int l2 = 0;
		int ss2 = 0;
		int sss2 = 0;
		int ssss2 = 0;
		int ll2 = 0;
		int lll2 = 0;
		int llll2 = 0;
		for(int i = 0; i < n; i++) {
			String s = in.next();
			if(s.equals("S")) s1++;
			else if(s.equals("M"))m1++;
			else if(s.equals("L"))l1++;
			else if(s.equals("XS")) ss1++;
			else if(s.equals("XXS")) sss1++;
			else if(s.equals("XXXS")) ssss1++;
			else if(s.equals("XL")) ll1++;
			else if(s.equals("XXL")) lll1++;
			else if(s.equals("XXXL")) llll1++;
		}
		for(int i = 0; i < n; i++) {
			String s = in.next();
			if(s.equals("S")) s2++;
			else if(s.equals("M"))m2++;
			else if(s.equals("L"))l2++;
			else if(s.equals("XS")) ss2++;
			else if(s.equals("XXS")) sss2++;
			else if(s.equals("XXXS")) ssss2++;
			else if(s.equals("XL")) ll2++;
			else if(s.equals("XXL")) lll2++;
			else if(s.equals("XXXL")) llll2++;
		}
		
		int res = 0;
		int res1 = 0;

		
		res1 += Math.abs(m2-m1);
		res1 += Math.abs(s2-s1);
		res1 += Math.abs(l2-l1);
		res += res1/2;
		res1 = 0;
		
		res1 += Math.abs(ss2-ss1);
		res1 += Math.abs(ll2-ll1);
		res += res1/2;
		res1 = 0;
		
		res1 += Math.abs(sss2-sss1);
		res1 += Math.abs(lll2-lll1);
		res += res1/2;
		res1 = 0;
		
		res1 += Math.abs(ssss2-ssss1);
		res1 += Math.abs(llll2-llll1);
		res += res1/2;
		res1 = 0;
		System.out.println(res);
		
		
	}
}