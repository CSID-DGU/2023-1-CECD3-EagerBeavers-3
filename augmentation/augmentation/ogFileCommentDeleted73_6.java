
import java.io.PrintWriter;

import java.util.*;
import java.util.Arrays ; 
import java .lang.String.* ;
import java .lang.StringBuilder ;


public class Test{

    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in) ;
        PrintWriter pw = new PrintWriter(System.out);   
        long n = in.nextLong() ; 
        long count =1 ; 
        count += 100;
        long temp =n/2;
        temp *= 3;
        temp *= 100;
     temp+=count ;
          temp+=count ;
     temp+=count ;
     temp+=count ;

      
       
        System.out.println(temp);
 }               
}

