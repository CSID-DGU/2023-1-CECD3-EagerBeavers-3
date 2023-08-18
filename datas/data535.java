public class Main{    public static void main(String[] args){
        int t=r.nextInt();
        for (int v=0;v<t;v++){
            int n=r.nextInt();
            if (n%2==1){
                pw.println("NO");
            }
            else{
                int x=n/2;
                boolean check=false;
                for (int i=1;i<=(int)Math.sqrt(x)+1;i++){
                    if (i*i*2==x||i*i==x){
                        pw.println("YES");check=true;break;
                    }
                }
                if (!check){
                    pw.println("NO");
                }
            }


        }
        pw.close();


    }
}