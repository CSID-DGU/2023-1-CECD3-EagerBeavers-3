public class Main{	public static void main(String args[]) throws Exception
	{
		InputReader sc=new InputReader(System.in);
		int n=sc.readInt(),k=sc.readInt(),i,j,z;
		T m[]=new T[n];
		for(i=0;i<n;i++) {m[i]=new T();m[i].s=sc.readInt();m[i].p=sc.readInt();}
		for(i=0;i<n;i++) for(j=i+1;j<n;j++)	if(m[i].s<m[j].s){z=m[i].s;m[i].s=m[j].s;m[j].s=z;z=m[i].p;m[i].p=m[j].p;m[j].p=z;}
		for(i=0;i<n;i++) for(j=i+1;j<n;j++)	if(m[i].s==m[j].s&&m[i].p>m[j].p){z=m[i].s;m[i].s=m[j].s;m[j].s=z;z=m[i].p;m[i].p=m[j].p;m[j].p=z;}
		k--;int s=m[k].s,p=m[k].p,res=0;
		for(i=0;i<n;i++){if(m[i].s==s&&m[i].p==p)res++;}
		System.out.println(res);
	}
}