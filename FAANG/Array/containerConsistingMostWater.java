// In Coding blocks test Kartik bhaiya gave students an array of n non-negative integers a1, a2, …, an ,where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). The task is to find two lines, which together with x-axis forms a container, such that the container contains the most water.
// Note: You may not slant the container.

// Input Format
// First line contains integer n as size of array.
// Next line contains N space separated integers that are the elements of the array.

// Constraints
// n>=2

// Output Format
// Output maximum water the container contains.

// Sample Input
// 9
// 1 8 6 2 5 4 8 3 7
// Sample Output
// 49
// Explanation
// None

import java.util.*;
public class Main {
    public static void main (String args[]) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int arr[] = new int[n];
          for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
          }

          solve(arr,n);
    }
    public static void solve(int arr[],int n ){
           int start = 0;
           int end = n-1;
           int area = 0 ;

           while(start< end){
                 int currArea = Math.min(arr[start],arr[end]) * (end - start);
                 area = Math.max(area,currArea);

                 if(arr[start] < arr[end]){
                      start++;
                 }else{
                    end--;
                 }
           }
           System.out.println(area);
    }
}