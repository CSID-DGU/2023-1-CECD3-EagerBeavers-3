public class Main{    public static void main(String[] args) {
        int n = nextInt();
        int a[] = new int[9];
        int b[] = new int[9];
        for(int i=0;i<n;i++){
            String s = next();
            if(s.equals("M")){
                a[0]++;
            }else if (s.equals("L")){
                a[1]++;
            }
            else if (s.equals("XL")){
                a[2]++;
            }
            else if (s.equals("XXL")){
                a[3]++;
            }
            else if (s.equals("XXXL")){
                a[4]++;
            }
            else if (s.equals("S")){
                a[5]++;
            }
            else if (s.equals("XS")){
                a[6]++;
            }
            else if (s.equals("XXS")){
                a[7]++;
            }
            else if (s.equals("XXXS")){
                a[8]++;
            }
        }
        for(int i=0;i<n;i++){
            String s = next();
            if(s.equals("M")){
                b[0]++;
            }else if (s.equals("L")){
                b[1]++;
            }
            else if (s.equals("XL")){
                b[2]++;
            }
            else if (s.equals("XXL")){
                b[3]++;
            }
            else if (s.equals("XXXL")){
                b[4]++;
            }
            else if (s.equals("S")){
                b[5]++;
            }
            else if (s.equals("XS")){
                b[6]++;
            }
            else if (s.equals("XXS")){
                b[7]++;
            }
            else if (s.equals("XXXS")){
                b[8]++;
            }
        }

        int ans = 0;
        ans+=Math.abs(a[2]-b[2]);
        ans+=Math.abs(a[3]-b[3]);
        ans+=Math.abs(a[4]-b[4]);
        int max = Math.abs(a[0]-b[0]);
        max = max(max,Math.abs(a[1]-b[1]));
        max = max(max,Math.abs(a[5]-b[5]));
        ans+=max;
        out.print(ans);
        out.flush();
    }
}