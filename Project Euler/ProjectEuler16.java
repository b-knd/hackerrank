/*
@b-knd (jingru) on 17 July 2022 10:31:00
- store powered value as bigInteger
- then loop through string elements after converting bigInteger to string and sum up their values
*/

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(powerDigitSum(in.nextInt()));
        }
        in.close();
    }
    
    public static int powerDigitSum(int n){
        int sum = 0;
        //store the value of 2^n as bigInteger
        BigInteger power = new BigInteger(String.valueOf(2)).pow(n);
        //loop through each 'string' element and sum up their values
        for(String str: String.valueOf(power).split("")){
            sum += Integer.parseInt(str);
        }
        return sum;
    }
}
