public class Main{	public static void main(String[] args) throws Exception {
		FastIO io = new FastIO();
		int test=io.nextInt();
		while(test>0)
		{
		    int n=io.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)arr[i]=io.nextInt();
		    List<int[]> list=new ArrayList<>();
		    Stack<int[]> stk=new Stack<>();
		    int temp[]={1};
		    list.add(temp);
		    stk.push(temp);
		    for(int i=1;i<n;i++)
		    {
		        if(arr[i]==1)
		        {
		            int t[]=stk.peek();
		            int nt[]=new int[t.length+1];
		            for(int j=0;j<t.length;j++)nt[j]=t[j];
		            nt[nt.length-1]=arr[i];
		            stk.push(nt);
		            list.add(nt);
		            continue;
		        }
		        while(stk.size()>0)
		        {
		            int t[]=stk.peek();
		            if(t[t.length-1]+1==arr[i]){
		                int nt[]=new int[t.length];
		                for(int j=0;j<t.length-1;j++)nt[j]=t[j];
		                nt[t.length-1]=arr[i];
		                stk.pop();
		                stk.push(nt);
		                list.add(nt);
		                break;
		            }
		            else
		            {
		                stk.pop();
		            }
		        }
		    }
		    for(int i=0;i<list.size();i++)
		    {
		        StringBuilder sb=new StringBuilder();
		        sb.append(list.get(i)[0]);
		        for(int j=1;j<list.get(i).length;j++)
		        {
		            sb.append("."+list.get(i)[j]);
		        }
		        io.println(sb.toString());
		    }
		    test--;
		}
		io.close();
	}
}