/*
@b-knd (jingru) on 11:01:00
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProjectEuler7 {
    //Arraylist keeping first 10 prime numbers
    static ArrayList<Integer> primeNum = new ArrayList<>(Arrays.asList(new Integer[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}));

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(nPrime(n));
        }
        in.close();
    }
    
    public static int nPrime(int n){
        //if already in arraylist, straightaway access from there, else update arraylist and return the value
        if(primeNum.size() > n){
            return primeNum.get(n-1);
        } else{
            int currentN = primeNum.size();
            while(currentN <= n){
                int j = primeNum.get(primeNum.size()-1)+2;
                while(!isPrime(j)){
                    j += 2;
                }
                primeNum.add(j);
                currentN++;
            }
            return primeNum.get(n-1);
        }
    }
    
    //method to check if a number is prime number
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        } else if(n % 2 == 0){
            return false;
        } for(int i = 3; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
