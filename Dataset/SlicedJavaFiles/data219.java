public class Main{  public static void main(String[] args) throws IOException {
	 Scanner sc = new Scanner(System.in);
	
	 //rec
	 int xr1=sc.nextInt(), yr1=sc.nextInt(), xr2=sc.nextInt(),yr2=sc.nextInt();
	 int xr3=sc.nextInt(), yr3=sc.nextInt(), xr4=sc.nextInt(),yr4=sc.nextInt();
	
	 Point pr1 = new Point(xr1, yr1);
	 Point pr2 = new Point(xr2, yr2);
	 Point pr3 = new Point(xr3, yr3);
	 Point pr4 = new Point(xr4, yr4);
	 
	 LineSegment lr1 = new LineSegment(pr1, pr2);
	 LineSegment lr2 = new LineSegment(pr2, pr3);
	 LineSegment lr3 = new LineSegment(pr3, pr4);
	 LineSegment lr4 = new LineSegment(pr4, pr1);
	 
	 //diamond
	 int xd1=sc.nextInt(), yd1=sc.nextInt(), xd2=sc.nextInt(),yd2=sc.nextInt();
	 int xd3=sc.nextInt(), yd3=sc.nextInt(), xd4=sc.nextInt(),yd4=sc.nextInt();
	 
	 Point p1 = new Point(xd1, yd1);
	 Point p2 = new Point(xd2, yd2);
	 Point p3 = new Point(xd3, yd3);
	 Point p4 = new Point(xd4, yd4);
	 
	 Point [] pt = new Point [5];
	 pt[0]=p1;  pt[1]=p2;  pt[2]=p3;  pt[3]=p4;  pt[4]=p1;
	 Polygon pg = new Polygon(pt);
	 
	 if(pg.inside(pr1)||pg.inside(pr2)||pg.inside(pr3)||pg.inside(pr4)) {
		 System.out.println("YES");
		 return;
	 }
	
	 
	 LineSegment ld1 = new LineSegment(p1, p2);
	 LineSegment ld2 = new LineSegment(p2, p3);
	 LineSegment ld3 = new LineSegment(p3, p4);
	 LineSegment ld4 = new LineSegment(p4, p1);
	 
	 Rectangle rec = new Rectangle(new Point(Math.min(Math.min(xr3,xr4),Math.min(xr1,xr2)), Math.min(Math.min(yr3,yr4),Math.min(yr1,yr2))), 
			 new Point(Math.max(Math.max(xr3,xr4),Math.max(xr1,xr2)), Math.max(Math.max(yr3,yr4),Math.max(yr1,yr2))) );
	 
	 if(rec.contains(p1)||rec.contains(p2)||rec.contains(p3)||rec.contains(p4)) {
		 System.out.println("YES");
	     return;
	 }
	 
	 if(ld1.intersect(lr1)||ld1.intersect(lr3)||ld1.intersect(lr3)||ld1.intersect(lr4)) {
		 System.out.println("YES");
	     return;
	 }
	 
	 if(ld2.intersect(lr1)||ld2.intersect(lr3)||ld2.intersect(lr3)||ld2.intersect(lr4)) {
		 System.out.println("YES");
	     return;
	 }
	 
	 if(ld3.intersect(lr1)||ld3.intersect(lr3)||ld3.intersect(lr3)||ld3.intersect(lr4)) {
		 System.out.println("YES");
	     return;
	 }
	 
	 if(ld4.intersect(lr1)||ld4.intersect(lr3)||ld4.intersect(lr3)||ld4.intersect(lr4)) {
		 System.out.println("YES");
	     return;
	 }
	 
	 System.out.println("NO");
	 
	 
	 
	 
}
}