public class Main{	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int k = myScanner.nextInt();
		Team[] queue = new Team[n];
		for (int i = 0; i < n; i++)
		{
			queue[i] = new Team(myScanner.nextInt(), myScanner.nextInt());
		}
		Arrays.sort(queue);
		
		int counter = 0;
		int i = 0;
		int p = -1;
		int t = -1;
		for (; i < k; i++)
		{
			if (p == queue[i].problems && t == queue[i].penalty)
				counter++;
			else
			{
				p = queue[i].problems;
				t = queue[i].penalty;
				counter = 1;
			}
		}
		for (; i < n; i++)
		{
			if (p == queue[i].problems && t == queue[i].penalty)
				counter++;
			else
				break;
		}
		System.out.println(counter);
	}
}