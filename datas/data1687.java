public class Main{public static void main(String[] args) throws IOException
{
  input.init(System.in);
  PrintWriter out = new PrintWriter(new PrintStream(System.out));
  //Scanner input = new Scanner(new File("input.txt"));
  //PrintWriter out = new PrintWriter(new File("output.txt"));

  int n = input.nextInt(), t = input.nextInt();
  int res = 2;
  Cottage[] data = new Cottage[n];
  int[] xs = new int[n], as = new int[n];
  for(int i = 0; i<n; i++)
  {
    data[i] = new Cottage(input.nextInt(), input.nextInt());
  }
  Arrays.sort(data);
  for(int i = 0; i<n; i++)
  {
    xs[i] = data[i].x;
    as[i] = data[i].a;
  }
  for(int i = 0; i<n-1; i++)
  {
    if(2*(xs[i+1]-xs[i]) == 2*t+as[i]+as[i+1]) res++;
    else if(2*(xs[i+1]-xs[i]) > 2*t+as[i]+as[i+1]) res+=2;
  }
  out.println(res);

  out.close();
}
}