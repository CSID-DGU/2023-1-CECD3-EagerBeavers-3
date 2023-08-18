public class Main{    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	try {
	    n = scanner.nextInt();
	    a = scanner.nextInt();
	    b = scanner.nextInt();
	    initNodes(scanner);
	    calculate();
	} finally {
	    scanner.close();
	}
    }
}