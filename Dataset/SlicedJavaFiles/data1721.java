public class Main{    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        double [] left = new double[n];
        double [] right = new double[n];
        for (int i = 0; i<n; i++){
            int x = sc.nextInt();
            int a = sc.nextInt();
            double l = x - (double)a/2;
            double r = x + (double)a/2;
            left[i] = l;
            right[i] = r;
        }
        int answer = 2;
        quickSort(left, right, 0, n-1);
        for (int i = 0; i<n-1; i++){
            if (left[i+1] - right[i] == t){
                answer++;   
            }
            if (left[i+1] - right[i] > t){
                answer += 2;
            }
        }
        System.out.println(answer);
    }
}