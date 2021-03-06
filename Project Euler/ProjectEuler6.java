/*
@b-knd (jingru) on 13 July 2022 11:11:00
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProjectEuler6 {

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
        //using formula for sum of N squares
        long sumOfSquares = (n*(n+1)*(2*n+1))/6;
        
        //using the summation formula and square it
        long squareOfSum = (long) Math.pow(n*(n+1)/2, 2);
        
        //find difference
        return Math.abs(sumOfSquares - squareOfSum);
    }
}
