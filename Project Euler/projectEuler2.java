/*
@b-knd (jingru) on 13 July 2022 09:52:00
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class projectEuler.java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(evenFibonacci(n));
        }
    }
    
    public static long evenFibonacci(long n){
        long result = 0;
        long curr = 2;
        long previous = 1;
        while(curr <= n){
            //only update result if curr is even-valued
            if(curr % 2 == 0){
                result += curr;
            }
            //update current and previous value
            long temp = previous;
            previous = curr;
            curr = previous + temp;
        }
        return result;
    }
}
