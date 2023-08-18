public class Main{    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
       // System.out.println("entet strig");
        String str = scr.nextLine();
        int len =0;
      //  System.out.println(str.substring(0, str.length()));
        for(int i=0;i<(str.length()-1);i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                String sub = str.substring(i, j);
                //int a=i+sub.indexOf(sub.charAt(0));
                int ind = str.indexOf(sub, i+1);
                if(ind!=-1 && sub.length()>len )
                {
                    len = sub.length();
                }
            }
        }
        System.out.println(len);
        // TODO code application logic here
    }
}