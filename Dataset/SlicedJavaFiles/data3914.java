public class Main{    public static void main (String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        PrintWriter p=new PrintWriter(System.out);
        while(t-->0)
        {
            //StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(br.readLine());
            String a[]=new String[n];
            for(int i=0;i<n;i++)
            {
                a[i]=br.readLine();
            }
            String pre="1";
            for(int i=1;i<n;i++)
            {
                if(a[i].equals("1"))
                {
                    a[i]=pre+".1";
                    pre=a[i];
                    continue;
                }
                int li=pre.lastIndexOf('.');
                while(li!=-1 && Integer.parseInt(pre.substring(li+1))+1!=Integer.parseInt(a[i]))
                {
                    pre=pre.substring(0,li);
                    li=pre.lastIndexOf('.');
                }
                //li=pre.lastIndexOf('.');
                if(li!=-1)
                a[i]=pre.substring(0,li+1)+a[i];
                pre=a[i];
            }
            for(int i=0;i<n;i++)
            {
                p.println(a[i]);
            }
            p.flush();
        }
	}
}