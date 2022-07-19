//past test case, failed

import java.io.*;
import java.util.*;
import java.math.*;


public class Solution {
    static ArrayList<String> roman = new ArrayList<>(Arrays.asList("M", "D", "CD", "C", "L", "XL", "X", "V", "IV", "I"));
    static int[] values = {1000, 500, 400, 100, 50, 40, 10, 5, 4, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); in.nextLine();
        for(int i = 0; i < T; i++){
            String string = in.nextLine();
            System.out.println(romanNumeral(string));
        }
        in.close();
    }
    
    public static String romanNumeral(String str){
        BigInteger value = new BigInteger("0");
        for(int i = 0; i < str.length() - 1; i++){
            int next = roman.indexOf(str.substring(i+1, i+2));
            int curr = roman.indexOf(str.substring(i, i+1));
            if(next < curr){
                value.subtract(BigInteger.valueOf(values[curr]));
            } else{
                value.add(BigInteger.valueOf(values[curr]));

            }
        }
        value.add(BigInteger.valueOf(values[roman.indexOf(str.substring(str.length()-1))]));
        return numeralToRoman(value);
    }
    
    public static String numeralToRoman(BigInteger value){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(value.compareTo(BigInteger.valueOf(values[i])) == 1 || value.compareTo(BigInteger.valueOf(values[i])) == 0) {
                value.subtract(BigInteger.valueOf(values[i]));
                res.append(roman.get(i));
            }   
        }
        return String.valueOf(res);
    }
}
