/*
b-knd (jingru) on 09 July 2022 11:05:00
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class projectEuler1 {
    
/*
Sum of multiples of 3 or 5 is simply:
    sum of multiples of 3 + sum of multiples of 5 - sum of  multiples of 15 (3 and 5)
To calculate sum: use arithmetic progression, 
    eg. sum of multiples of 3 below 10
    n = 10/3 = 3, a = 3, d = 3 -> S = [n(2a + (n-1)d)]/2 = n(3+3n)/2 (Similar concept for other multiples)
*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a = 0; a < t; a++){
            int n = in.nextInt();
            System.out.println(
                sumMultiple(n, 3)+
                sumMultiple(n, 5)-
                sumMultiple(n, 15)
            );
        }
        in.close();
    }
    
    public static long sumMultiple(int x, int mult){
        long n = (x-1)/mult;
        return n*(mult+mult*n)/2;
    }
    
}
