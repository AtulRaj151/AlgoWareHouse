// Ramu has an array of strings. He want to find a string s such that it is a concatenation of sub-sequence of given array and have unique characters.Since,he has just started coding so he needs your help.
// A sub-sequence of an array is a set of elements that can be obtained by deleting some elements(posssibly none) from the array and keeping the order same.
// Print the maximum possible length of s.

// Input Format
// The first line of input contains an interger n -the length of array.Next n lines contains the element(strings) of the array

// Constraints
// 1 <= n <= 18, 1 <= arr[i].length<= 26

// Output Format
// Print one integer - the maximum length of s.

// Sample Input
// 3
// ab
// cd
// ab
// Sample Output
// 4

import java.util.*;
public class Main {
    public static void main (String args[]) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         ArrayList<String> arr = new ArrayList<>();
         for(int i=0;i<n;i++){
              String str = sc.next();
              arr.add(str);

         }
         System.out.println(solve(arr,"",0));
    }

    public static int solve(ArrayList<String> arr,String str,int i){
        // base case

         if(i == arr.size()){
             int freq[] = new int[26];
             for(int j=0;j<str.length();j++){
                  if(freq[str.charAt(j)-'a']==1){
                          return 0;
                  }
                      freq[str.charAt(j)-'a']++;
             }

             return str.length();
         }
          
        //   include 
        int ans1 = Integer.MIN_VALUE;
        int ans2  = Integer.MAX_VALUE;
        if(str.length() + arr.get(i).length() <= 26){
             ans1  =  solve(arr,str+arr.get(i),i+1);
        }
       
        ans2 = solve(arr,str,i+1);

        return Math.max(ans1,ans2);


        
    }
}