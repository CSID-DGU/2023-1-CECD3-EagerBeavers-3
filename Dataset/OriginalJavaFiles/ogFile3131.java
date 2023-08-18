

import java.awt.Point;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.*;

public class ProblemD_05 {
    
    final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE")!=null;
    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");
    
    void init() throws FileNotFoundException{
        if (ONLINE_JUDGE){
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }else{
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        }
    }
    
    String readString() throws IOException{
        while(!tok.hasMoreTokens()){
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }
    
    int readInt() throws IOException{
        return Integer.parseInt(readString());
    }
    
    long readLong() throws IOException{
        return Long.parseLong(readString());
    }
    
    double readDouble() throws IOException{
        return Double.parseDouble(readString());
    }
    
    public static void main(String[] args){
        new ProblemD_05().run();
    }
    
    public void run(){
        try{
            long t1 = System.currentTimeMillis();
            init();
            solve();
            out.close();
            long t2 = System.currentTimeMillis();
            System.err.println("Time = "+(t2-t1));
        }catch (Exception e){
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }
    
    void solve() throws IOException{
        double a = readDouble();
        double v = readDouble();
        double l = readDouble();
        double d = readDouble();
        double w = readDouble();
        double t = 0;
        double td = d > v * v / (2 * a)? v / a + (d - v * v / (2 * a)) / v: sqrt(2 *d / a);
        if (w >= min(a * td, v)){
            t += td;
            w = min(a * td, v);
        }else{
            double v0 = sqrt(w * w / 2 + a * d);
            if (v0 * v0 <= v * v){
                t += (2 * v0 - w) / a;
            }else{
                t += (2 * v - w) / a;
                double s2 = d - (2 * v * v - w * w) / (2 * a);
                t += s2 / v;
            }
        }
        double t1 = (sqrt(w * w + 2 * a * (l - d)) - w) / a;
        if (t1 > (v - w) / a) t1 = (v - w) / a;
        t += t1;
        double s1 = w * t1 + a * t1 * t1 / 2;
        double t2 = (l - d - s1) / v;
        t += t2;
        out.printf(Locale.US, "%.12f", t);
    }
    
    static int[][] step8 = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {1, -1}, {-1, 1}, {1, 1}};
    
    static int[][] stepKnight = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
    
    static long gcd(long a, long b){
        if (a == 0) return b;
        return gcd(b % a, a);
    }
    
    static long lcm(long a, long b){
        return a / gcd(a, b)*b;
    }

    static long[] gcdPlus(long a, long b){
        long[] d = new long[3];
        if (a == 0){
            d[0] = b;
            d[1] = 0;
            d[2] = 1;
        }else{
            d = gcdPlus(b % a, a);
            long r = d[1];
            d[1] = d[2] - b/a*d[1];
            d[2] = r;
        }
        return d;
    }
    
    static long binpow(long a, int n){
        if (n == 0) return 1;
        if ((n & 1) == 0){
            long b = binpow(a, n/2);
            return b*b;
        }else return binpow(a, n - 1)*a;
    }
    
    static long binpowmod(long a, int n, long m){
        if (m == 1) return 0;
        if (n == 0) return 1;
        if ((n & 1) == 0){
            long b = binpowmod(a, n/2, m);
            return (b*b) % m;
        }else return binpowmod(a, n - 1, m)*a % m;
    }
    
    static long phi(long n){
        int[] p = Sieve((int)ceil(sqrt(n)) + 2);
        long phi = 1;
        for (int i = 0; i < p.length; i++){
            long x = 1;
            while (n % p[i] == 0){
                n /= p[i];
                x *= p[i];
            }
            phi *= x - x/p[i];
        }
        if (n != 1) phi *= n - 1;
        return phi;
    }
    
    static long f(long n, int x, int k){ //�����-�Ӭ� �լ֬���ڬ�߬��� ��ڬ�֬� (�Ӭܬݬ��Ѭ� 0), ���լ֬�جѬ�ڬ� �� ��֬Ҭ� ��ڬ��� ��� 0 �լ� k-1
        if (n == 0) return 1;
        long b = binpow(10, x - 1);
        long c = n / b;
        return (c < k? c: k)*binpow(k, x - 1) + (c < k? 1: 0)*f(n % b, x - 1, k);
    }
    
    static long fib(int n){
        if (n == 0) return 0;
        if ((n & 1) == 0){
            long f1 = fib(n/2 - 1);
            long f2 = fib(n/2 + 1);
            return f2*f2 - f1*f1;
        }else{
            long f1 = fib(n/2);
            long f2 = fib(n/2 + 1);
            return f1*f1 + f2*f2;
        }
    }
    
    static BigInteger BigFib(int n){
        if (n == 0) return BigInteger.ZERO;
        if ((n & 1) == 0){
            BigInteger f1 = BigFib(n/2 - 1);
            f1 = f1.multiply(f1);
            BigInteger f2 = BigFib(n/2 + 1);
            f2 = f2.multiply(f2);
            return f2.subtract(f1);
        }else{
            BigInteger f1 = BigFib(n/2);
            f1 = f1.multiply(f1);
            BigInteger f2 = BigFib(n/2 + 1);
            f2 = f2.multiply(f2);
            return f2.add(f1);
        }
    }
    
    static public class PointD{
        
        double x, y;
        
        public PointD(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
    
    static double d(Point p1, Point p2){
        return sqrt(d2(p1, p2));
    }
    
    static public double d(PointD p1, PointD p2){
        return sqrt(d2(p1, p2));
    }
    
    static double d2(Point p1, Point p2){
        return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
    }
    
    static public double d2(PointD p1, PointD p2){
        return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
    }
    
    static boolean IsProbablyPrime(long n){
        if (n == 1) return false;
        if ((n & 1) == 0) return false;
        for (int j = 3; j < sqrt(n) + 1; j += 2){
            if (n % j == 0) return false;
        }
        return true;
    }

    static int[] Sieve(int n){
        boolean[] b = new boolean[n+1];
        Arrays.fill(b, true);
        b[0] = false;
        b[1] = false;
        long nLong = n;
        int j=0;
        for (int i = 1; i <= n; i++) {
            if (b[i]){
                j++;
                if (((long)i)*i <= nLong) {
                    for (int k = i*i; k <= n; k += i) {
                        b[k] = false;
                    }
                }
            }
        }
        int[] p = new int[j];
        Arrays.fill(p, 0);
        j=0;
        for (int i = 2; i <= n; i++) {
            if (b[i]){
                p[j]=i;
                j++;
            }
        }
        return p;
    }
    
    static int[][] Palindromes(String s){
        char[] c = s.toCharArray();
        int n = c.length;
        int[][] d = new int[2][n];
        int l = 0, r = -1;
        for (int i = 0; i < n; i++){
            int j = (i > r? 0: min(d[0][l+r-i+1], r-i+1)) + 1;
            for (; i - j >= 0 && i + j - 1< n && c[i-j] == c[i+j-1]; j++);
            d[0][i] = --j;
            if (i + d[0][i] - 1 > r){
                r = i + d[0][i] - 1;
                l = i - d[0][i];
            }
        }
        l = 0;
        r = -1;
        for (int i = 0; i < n; i++){
            int j = (i > r? 0: min(d[1][l+r-i], r-i)) + 1;
            for (; i - j >= 0 && i + j < n && c[i-j] == c[i+j]; j++);
            d[1][i] = --j;
            if (i + d[1][i] > r){
                r = i + d[1][i];
                l = i - d[1][i];
            }
        }
        return d;
    }
    
    static public class Permutation {
        
        int[] a;
        int n;
        
        public Permutation(int n){
            this.n=n;
            a=new int[n];
            for (int i=0; i<n; i++){
                a[i]=i;
            }
        }
        
        public boolean nextPermutation(){ //���ڬ�֬��� �� do{}while(nextPermutation(a));
            int i=n-1;
            for (i=n-2; i>=0; i--){
                if (a[i]<a[i+1]){
                    break;
                }
            }
            if (i==-1){
                return false;
            }
            int jMin=i+1;
            for (int j=n-1; j>i; j--){
                if (a[i]<a[j]&&a[j]<a[jMin]){
                    jMin=j;
                }
            }
            swap(i, jMin);
            for (int j=1; j<=(n-i)/2; j++){
                swap(i+j, n-j);
            }
            return true;
        }
        
        
        public int get(int i){
            return a[i];
        }
        
        void swap(int i, int j){
            int r=a[i];
            a[i]=a[j];
            a[j]=r;
        }
    }
    
    static public class Fraction implements Comparable<Fraction>, Cloneable{
        
        public final Fraction FRACTION_ZERO = new Fraction();
        public final Fraction FRACTION_ONE = new Fraction(1);
        public long numerator = 0;
        public long denominator = 1;
        
        public Fraction(){
            numerator = 0;
            denominator = 1;
        }
        
        public Fraction(long numerator){
            this.numerator = numerator;
            denominator = 1;
        }
        
        public Fraction(long numerator, long denominator){
            this.numerator = numerator;
            this.denominator = denominator;
            Cancellation();
        }
        
        public Fraction(double numerator, double denominator, int accuracy){
            this.numerator = (long)(numerator*pow(10,accuracy));
            this.denominator = (long)(denominator*pow(10,accuracy));
            Cancellation();
        }
        
        public Fraction(String s){
            if (s.charAt(0) == '-'){
                denominator = -1;
                s = s.substring(1);
            }
            if (s.indexOf("/") != -1){
                denominator *= Integer.parseInt(s.substring(s.indexOf("/") + 1));
            }
            if (s.indexOf(" ") != -1){
                numerator = Integer.parseInt(s.substring(0, s.indexOf(" "))) * abs(denominator) + Integer.parseInt(s.substring(s.indexOf(" ") + 1, s.indexOf("/")));
            }else{
                if (s.indexOf("/") != -1){
                    numerator = Integer.parseInt(s.substring(0, s.indexOf("/")));
                }else{
                    numerator = Integer.parseInt(s)*abs(denominator);
                }
            }
            this.Cancellation();
        }
        
        void Cancellation(){
            long g = gcd(abs(numerator), abs(denominator));
            numerator /= g;
            denominator /= g;
            if (denominator < 0){
                numerator *= -1;
                denominator *= -1;
            }
        }
        
        public String toString(){
            String s = "";
            if (numerator == 0){
                return "0";
            }
            if (numerator < 0){
                s += "-";
            }
            if (abs(numerator) >= denominator){
                s += Long.toString(abs(numerator) / denominator) + " ";
            }
            if (abs(numerator) % denominator != 0){
                s += Long.toString(abs(numerator) % denominator);
            }else{
                s = s.substring(0, s.length()-1);
            }
            if (denominator != 1){
                s += "/" + Long.toString(denominator);
            }
            return s;
        }
        
        public Fraction add(Fraction f){
            Fraction fResult = new Fraction();
            fResult.denominator = lcm(denominator, f.denominator);
            fResult.numerator = numerator * fResult.denominator / denominator + f.numerator * fResult.denominator / f.denominator;
            fResult.Cancellation();
            return fResult;
        }
        
        public Fraction subtract(Fraction f){
            Fraction fResult = new Fraction();
            fResult.denominator = lcm(denominator, f.denominator);
            fResult.numerator = numerator * fResult.denominator / denominator - f.numerator * fResult.denominator / f.denominator;
            fResult.Cancellation();
            return fResult;
        }
        
        public Fraction multiply(Fraction f){
            Fraction fResult = new Fraction();
            fResult.numerator = numerator * f.numerator;
            fResult.denominator = denominator * f.denominator;
            fResult.Cancellation();
            return fResult;
        }
        
        public Fraction divide(Fraction f){
            Fraction fResult = new Fraction();
            fResult.numerator = numerator * f.denominator;
            fResult.denominator = denominator * f.numerator;
            fResult.Cancellation();
            return fResult;
        }
        
        @Override
        public int compareTo(Fraction f){
            long g = gcd(denominator, f.denominator);
            long res = numerator * (f.denominator / g) - f.numerator * (denominator / g);
            if (res < 0){
                return -1;
            }
            if (res > 0){
                return 1;
            }
            return 0;
        }
        
        public Fraction clone(){
            Fraction fResult = new Fraction(numerator, denominator);
            return fResult;
        }
        
        public Fraction floor(){
            Fraction fResult = this.clone();
            fResult.numerator = (fResult.numerator / fResult.denominator) * fResult.denominator;
            return fResult;
        }
        
        public Fraction ceil(){
            Fraction fResult = this.clone();
            fResult.numerator = (fResult.numerator/fResult.denominator + 1) * fResult.denominator;
            return fResult;
        }
        
        public Fraction binpow(int n){
            if (n==0) return FRACTION_ONE;
            if ((n&1)==0){
                Fraction f=this.binpow(n/2);
                return f.multiply(f);
            }else return binpow(n-1).multiply(this);
        }
    }
    
    static public class FenwickTree_1{  //One-dimensional array     
        
        int n;
        long[] t;
        
        public FenwickTree_1(int n){
            this.n = n;
            t = new long[n];
        }
        
        public long sum(int xl, int xr){
            return sum(xr) - sum(xl);
        }
        
        public long sum(int x){
            long result = 0;
            for (int i = x; i >= 0; i = (i & (i + 1)) - 1){
                result += t[i];
            }
            return result;
        }
        
        public void update(int x, long delta){
            for (int i = x; i < n; i = (i | (i + 1))){
                t[i] += delta;
            }
        }
    }
    
    static public class FenwickTree_2{  //Two-dimensional array
        
        int n, m;
        long[][] t;
        
        public FenwickTree_2(int n, int m){
            this.n = n;
            this.m = m;
            t = new long[n][m];
        }
        
        public long sum(int xl, int yl, int xr, int yr){
            return sum(xr, yr) - sum(xl - 1, yr) - sum(xr, yl - 1) + sum(xl - 1, yl - 1);
        }
        
        public long sum(int x, int y){
            long result = 0;
            for (int i = x; i >= 0; i = (i & (i + 1)) - 1){
                for (int j = y; j >= 0; j = (j & (j + 1)) - 1){
                    result+=t[i][j];
                }
            }
            return result;
        }
        
        public void update(int x, int y, long delta){
            for (int i = x; i < n; i = (i | (i + 1))){
                for (int j = y; j < m; j = (j | (j + 1))){
                    t[i][j] += delta;
                }
            }
        }
    }
    
    static public class FenwickTree_3{  //Three-dimensional array
        
        int n, m, l;
        long[][][] t;
        
        public FenwickTree_3(int n, int m, int l){
            this.n = n;
            this.m = m;
            this.l = l;
            t = new long[n][m][l];
        }
        
        public long sum(int xl, int yl, int zl, int xr, int yr, int zr){
            return sum(xr, yr, zr) - sum(xl - 1, yr, zr)
            + sum(xl - 1, yr, zl - 1) - sum(xr, yr, zl - 1)
            - sum(xr, yl - 1, zr) + sum(xl - 1, yl - 1, zr)
            - sum(xl - 1, yl - 1, zl - 1) + sum(xr, yl - 1, zl - 1);
        }
        
        public long sum(int x, int y, int z){
            long result = 0;
            for (int i = x; i >= 0; i = (i & (i + 1)) - 1){
                for (int j = y; j >= 0; j = (j & (j + 1)) - 1){
                    for (int k = z; k >= 0; k = (k & (k + 1)) - 1){
                        result += t[i][j][k];
                    }
                }
            }
            return result;
        }
        
        public void update(int x, int y, int z, long delta){
            for (int i = x; i < n; i = (i | (i + 1))){
                for (int j = y; j < n; j = (j | (j + 1))){
                    for (int k = z; k < n; k = (k | (k + 1))){
                        t[i][j][k] += delta;
                    }
                }
            }
        }
    }
}

