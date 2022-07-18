/*
@b-knd (jingru) on 18 July 2022 10:38:00
*/

import java.io.*;
import java.util.*;
import java.math.*;

public class ProjectEuler20 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(sumOfDigit(in.nextInt()));
        }
        in.close();
    }
  
    /* Alternative, cleaner solution using big integer */
    public static int sumOfDigit(int n){
      
        BigInteger fact = new BigInteger("1"); // Or BigInteger.ONE
        int sum = 0;
      
        // Calculate factorial as usual with loop, but using method for big integer
        for (int i = 2; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));   
        }
 
        while(fact.compareTo(new BigInteger("0")) == 1){
            sum += fact.mod(new BigInteger("10")).intValue();
            fact = fact.divide(new BigInteger("10"));
        }
        return sum;
    }
  
  
    /* Solution using array */
    public static int sumOfDigit(int n){
        //maximum number of digit is for factorial 1000 (2568 digits)
        int[] fact = new int[2600];
        fact[0] = 1;
        int size = 1;
        int sum = 0;
        
        //calculate the factorial of number as usual but calling a helper function to find out the new size (and update the array)
        for(int x = 2; x <= n; x++){
            size = multiply(x, fact, size);
        }
        
        //calculate sum of all digits
        for(int i = 0; i < size; i++){
            sum += fact[i];
        }
        return sum;
    }
    
    public static int multiply(int x, int[] factorial, int size){
        int carry = 0;
        
        //calculate the product of each digit in array with x, update carry (accumulated) and digit in array
        for(int i = 0; i < size; i++){
            int product = factorial[i] * x + carry;
            factorial[i] = product % 10;
            carry = product/10;
        }
        
        //add carry to array and increment size if neccessary
        while(carry != 0){
            factorial[size] = carry % 10;
            carry /= 10;
            size++;
        }
        
        //return new size of the array
        return size;
    }
}
