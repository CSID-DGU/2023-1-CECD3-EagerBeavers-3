public class Main{    public static void main(String args[])
    {
        Reader sc=new Reader();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.i();
        String s1=sc.s();
        String s2=sc.s();
        int pos1=-1;
        int pos2=-1;
        int arr[][][]=new int[100][100][2];
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(arr[s2.charAt(i)-97][s1.charAt(i)-97][0]==1)
                {
                    pos2=i;
                    pos1=arr[s2.charAt(i)-97][s1.charAt(i)-97][1];
                    break;
                }
                arr[s1.charAt(i)-97][s2.charAt(i)-97][0]=1;
                arr[s1.charAt(i)-97][s2.charAt(i)-97][1]=i;
            }
        }
        int ham=0;
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            ham++;
        }
        if(pos1!=-1&&pos2!=-1)
        {
            System.out.println(ham-2);
            System.out.println(pos1+1+" "+(pos2+1));
            System.exit(0);
        }
        
        int arr1[][]=new int[100][2];
        int arr2[][]=new int[100][2];
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                if(arr1[s1.charAt(i)-97][0]==1)
                {
                    pos2=i;
                    pos1=arr1[s1.charAt(i)-97][1];
                    break;
                }
                if(arr2[s2.charAt(i)-97][0]==1)
                {
                    pos2=i;
                    pos1=arr2[s2.charAt(i)-97][1];
                    break;
                }
                arr1[s2.charAt(i)-97][0]=1;
                arr1[s2.charAt(i)-97][1]=i;
                arr2[s1.charAt(i)-97][0]=1;
                arr2[s1.charAt(i)-97][1]=i;
            }
        }
        if(pos1!=-1&&pos2!=-1)
        {
            System.out.println(ham-1);
            System.out.println(pos1+1+" "+(pos2+1));
            System.exit(0);
        }
        System.out.println(ham);
        System.out.println(pos1+" "+pos2);
    }
}