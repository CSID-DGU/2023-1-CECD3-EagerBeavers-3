public class Main{    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            hs.add(str.charAt(i));
        }
        if(hs.size()==1)
        System.out.println(0);
        else if(palin(str)==0)
        System.out.println(str.length());
        else
        System.out.println(str.length()-1);
    }
}