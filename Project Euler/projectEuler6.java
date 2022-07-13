/*
@b-knd (jingru) on 13 July 2022 11:11:00
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(sumSquareDiff(n));
        }
        in.close();
    }
    
    public static long sumSquareDiff(long n){
        long sumOfSquares = (n*(n+1)*(2*n+1))/6;
        long squareOfSum = (long) Math.pow(n*(n+1)/2, 2);
        return Math.abs(sumOfSquares - squareOfSum);
    }
}
