/*
@b-knd (jingru) on 15 July 2022 11:18:00
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
            int k = in.nextInt();
            String num = in.next();
            System.out.println(largeProduct(num, n, k));
        }
        in.close();
    }
    
    //use a window sliding technique and compare product with max
    public static long largeProduct(String num, int n, int k){
        long max = Integer.MIN_VALUE;
        for(int i = 0; i < n-k; i++){
            long product = 1;
            String str = num.substring(i, i+k);
            for(String s: str.split("")){
                product *= Integer.parseInt(s);
                //stop if product = 0 (no need to continue iterating)
                if(product == 0){
                    break;
                }
            }
            max = Math.max(max, product);
        }
        return max;
    }
}
