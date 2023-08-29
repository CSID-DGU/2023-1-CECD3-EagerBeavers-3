public class Main{	public static void main(String[] args) {
		int disks = getInt();
		int radii = getInt();
		if(disks == 1){
			System.out.println(radii);
		}
		else{
			double[][] diskcenters = new double[disks][2];
			for(int i = 0;i<disks;i++){
				diskcenters[i][0] = getInt();
			}
			diskcenters[0][1] = radii;
			for(int i = 1;i<disks;i++){
				double cmax = 0;
				for(int prev = 0;prev < i;prev++){
					cmax = Math.max(cmax, calcintersection(diskcenters[prev][0],diskcenters[prev][1],radii,diskcenters[i][0],radii));
				}
				diskcenters[i][1] = cmax;
			}
			for(int i = 0;i<diskcenters.length;i++){
				System.out.print(Double.toString(diskcenters[i][1]) + " ");
			}
			System.out.print("\n");
		}
		
	}
}