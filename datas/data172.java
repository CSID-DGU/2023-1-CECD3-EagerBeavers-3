public class Main{	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Comp c1 = getComp(scanner);
		Comp c2 = getComp(scanner);
		c1.sortByPrice();
		c2.sortByPrice();	
		int i = 0;
		int j = 0;
		while(i < c1.num || j < c2.num) {
			Elem xi = (i < c1.num) ? c1.elems.get(i) : null;
			Elem yj = (j < c2.num) ? c2.elems.get(j) : null;
			if(xi != null && yj != null) {
				if(xi.price >= yj.price) {
					if(!c2.resultSet.contains(xi)) {
						c1.resultSet.add(xi);
					}
					i++;
				} else {
					if(!c1.resultSet.contains(yj)) {
						c2.resultSet.add(yj);
					}
					j++;
				}
			} else
			if(xi != null) {
				if(!c2.resultSet.contains(xi)) {
					c1.resultSet.add(xi);
				}
				i++;
			} else {
				if(!c1.resultSet.contains(yj)) {
					c2.resultSet.add(yj);
				}
				j++;
			}				
		}
		
		long result = c1.getResultPrice() + c2.getResultPrice();
		System.out.println(result);
   }
}