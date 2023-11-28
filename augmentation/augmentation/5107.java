
import java.io.PrintWriter;

import java.util.*;
import java.util.Arrays ; 
import java .lang.String.* ;
import java .lang.StringBuilder ;


public class Test{

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in) ;
        PrintWriter printWriter = new PrintWriter(System.out);   
        long n = scanner.nextLong() ; 
        int count =1 ; 
        count += 100;
        int temp =n/2;
        temp *= 3;
        temp *= 100;
        temp /= 100;
     temp+=count ;
          temp+=count ;
     temp+=count ;
     temp+=count ;
     temp*=count ;
     temp /= 10;
     temp-=10;
     temp+=count ;
        System.out.println(temp);
 }               
}

