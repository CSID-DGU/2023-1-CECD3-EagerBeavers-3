public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int test = 1;
        for (int ind = 0; ind < test; ind++) {
          int [] a=new int[3];
          a[0]=sc.nextInt();
          a[1]=sc.nextInt();
          a[2]=sc.nextInt();
          Arrays.sort(a);
          int k1=a[0];
          int k2=a[1];
          int k3=a[2];
          if(k1==1 || k2==1 || k3==1){
              out.println("YES");
          }
          else if((k1==2 && k2==2)||(k2==2 && k3==2)){
              out.println("YES");
            }
            else if(k1==3 && k2==3 && k3==3){
              out.println("YES");
          }
          else if(k1==2 && k2==4 && k3==4){
              out.println("YES");
          }
          else
              out.println("NO");

        }
        out.flush();
    }
}