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
    public static int next(int arr[], int i){
        return (arr[i] + i + arr.length)% arr.length;
    }
    public static void solve(int arr[],int n){
          int fast = 0, slow =  0;

          for(int i=0;i<n;i++){
                fast  = i; slow  = i;

                if( arr[i] == 0){
                    continue;
                }
                 while( arr[slow] * arr[next(arr,slow)] > 0 &&
                    arr[fast] * arr[next(arr,fast)] > 0 &&
                    arr[fast] * arr[next(arr,next(arr,fast))] > 0) {
                           slow = next(arr,slow);
                           fast = next(arr,next(arr,fast));

                           if( fast == slow) {
                                 if(slow == next(arr,slow)){
                                      break;
                                 }
                                 System.out.print(1+"");
                                 return;
                           }
                    }
                slow  = i;
                int v = arr[slow];
                while(v*arr[slow]>0){
                    int x = slow;
                    slow = next(arr,slow);
                    arr[x] = 0;

                }
                    
          }
          System.out.print(0+"");
          return;

    }
}