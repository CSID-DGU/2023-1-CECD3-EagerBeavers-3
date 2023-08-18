public class Main{    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberEntries = scan.nextInt();
        scan.nextLine();
        String[] numbers = scan.nextLine().split(" ");
        numbers = parity(numbers);
        int evenOdd = evenOdd(parity);
       
        for (int i = 0; i < parity.length; i++) {
            if (parity[i] == evenOdd) {
                System.out.println(i + 1);
                System.exit(0);
            }
        }
            
        
    }
}