public class Main{	public static void main(String[] args)
	{
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int t = fs.nextInt();
		for(int tt=0;tt<t;tt++)
		{
			int n = fs.nextInt();
			int[] arr = fs.readArray(n);
			List<String> ans = new ArrayList();
			List<Integer> temp = new ArrayList();
			temp.add(arr[0]);
			ans.add(""+arr[0]);
			for(int i=1;i<n;i++)
			{
				int ch = arr[i];
				if(ch == 1)
				{
					temp.add(1);
					StringBuilder sb = new StringBuilder();
					for(int j=0;j<temp.size();j++)
					{
						sb.append(temp.get(j));
						if(j != temp.size()-1)
						{
							sb.append('.');
						}
					}
					ans.add(sb.toString());
				}
				else
				{
					int j = temp.size()-1;
					while(j>=0)
					{
						if(ch - temp.get(j) == 1)
						{
							temp.set(j,ch);
							break;
						}
						else
						{
							j--;
						}
					}
					int extra = temp.size()-1;
					while(extra>j)
					{
						temp.remove(temp.size()-1);
						extra--;
					}
					StringBuilder sb = new StringBuilder();
					for(int jj=0;jj<temp.size();jj++)
					{
						sb.append(temp.get(jj));
						if(jj != temp.size()-1)
						{
							sb.append('.');
						}
					}
					ans.add(sb.toString());
				}
//				out.println("Here: "+temp);
			}
			for(String str:ans)
			{
				out.println(str);
			}
		}
		out.close();
	}
}