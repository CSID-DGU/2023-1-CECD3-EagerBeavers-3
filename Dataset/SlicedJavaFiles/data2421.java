public class Main{    public static void main(String[] args) throws Exception{
        IO io = new IO(null,null);
        int n = io.getNextInt(),ans = 0;
        int [] A = new int[n];
        for (int i = 0;i < n;i++) {
            A[i] = io.getNextInt();
            for (int j = 0;j < i;j++)
                ans ^= (A[j] > A[i]) ? 1 : 0;
        }
        String [] word = {"even","odd"};
        int m = io.getNextInt();
        for (int i = 0;i < m;i++) {
            int l = io.getNextInt(),r = io.getNextInt();
            int len = r - l + 1;
            long tot = len*(len - 1L)/2;
            ans ^= tot & 1;
            io.println(word[ans]);
        }
        io.close();
    }
}