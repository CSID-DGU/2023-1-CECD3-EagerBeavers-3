public class Main{public static void main(String[] args) throws IOException
{
    //Scanner input = new Scanner(new File("input.txt"));
    //PrintWriter out = new PrintWriter(new File("output.txt"));
  input.init(System.in);
  PrintWriter out  = new PrintWriter((System.out));
  
  int n = input.nextInt(), m = input.nextInt(), k = input.nextInt();
  long border = n-n/k;
  if(m<=border) out.println(m);
  else
  {
      long count = m- border;
      long first = ((pow(2, count+1) + mod - 2)*k)%mod;
      first += m - k*count;
      out.println(first%mod);
  }
  
  out.close();
}
}