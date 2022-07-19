/*
@b-knd (jingru) on 19 July 2022 09:10:00
*/

import java.io.*;
import java.util.*;

public class ProjectEuler22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); in.nextLine();
        //add names into an arraylist and sort it alphabetically
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < N; i++){
            names.add(in.nextLine());
        }
        Collections.sort(names);
        
        //loop through each names and print out their scores
        int Q = in.nextInt(); in.nextLine();
        for(int i = 0; i < Q; i++){
            int target = names.indexOf(in.nextLine()) + 1;
            System.out.println(nameScore(target, names.get(target-1)));
        }       
        in.close();
    }
    
    //target is its index in the list and use it to multiply with sum of alphabetical value (A=1, B=2, ...)
    public static int nameScore(int target, String name){
        int sum = 0;
        for(int i = 0; i < name.length(); i++){
            sum += name.charAt(i)-64;
        }
        return target * sum;
    }
}
