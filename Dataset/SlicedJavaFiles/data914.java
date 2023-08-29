public class Main{    public static void main(String[] args) {
        FastReader input = new FastReader();
        int n = input.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int maxIndex = 0;
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        int j = maxIndex - 1;
        int k = maxIndex + 1;
        while (j >= 0 && k < n){
            if(arr[j] > arr[k]){
                if(arr[j] < max){
                    max = arr[j];
                    j--;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
            else{
                if(arr[k] < max){
                    max = arr[k];
                    k++;
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }
        if(j >= 0){
            while (j >= 0){
                if(arr[j] < max){
                    max = arr[j];
                    j--;
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }
        if(k < n){
            while (k < n){
                if(arr[k] < max){
                    max = arr[k];
                    k++;
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }
        if(j == -1 && k == n){
            System.out.println("YES");
        }
    }
}