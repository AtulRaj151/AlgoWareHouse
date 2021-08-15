// You have to given an array A of size N.
// Find all the elements which appear more than floor(N/3) times in the given array.
// Wait Wait!
// There is a condition that you have to do your job in O(N) time complexity and O(1) space complexity.

// Input Format
// First line contains N ->No. of elements in the array
// Second line has N integers denoting the elements of the array A ie A1,A2,A3…….AN.

// Constraints
// 1<=N<=10^7
// 0<=Ai<=10^9

// Output Format
// Print a single line containing all the majority elements occurring more than floor(N/3) times.
// If there is no majority element then just print "No Majority Elements".

// Sample Input
// 8
// 2 2 3 1 3 2 1 1 
// Sample Output
// 1 2
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
           int el1 = 0 , el2  = 0 , ec1 = 0, ec2  = 0;

           for(int i = 0;i < n; i++){
                 if(arr[i] ==  el1) {
                      ec1++;
                 }else if(arr[i] ==  el2){
                      ec2++;
                 }else if(ec1  == 0){
                      el1 = arr[i];
                 }else if(ec2 ==  0){
                      el2 = arr[i];
                 }else {
                      ec1--;
                      ec2--;
                 }
           }
           ec1 = 0; ec2 = 0;
           for(int x : arr){
                if(x == el1 ){
                     ec1++;
                }else if(x == el2){
                     ec2++;
                }
           }
           if( ec1 > n/3 ) {
                System.out.print(el1+" ");
           }
           if( ec2 > n / 3){
                System.out.print(el2 + " ");
           }
           if(ec1 < (n/3) && ec2  < (n/3)) {
                  System.out.print("No Majority Elements");
           }
    }
}