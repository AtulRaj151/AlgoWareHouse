#include <iostream>
using namespace std;

int main(){
    int arr[100] = {2,4,5,2,6,4,5,6,9};
    int n = sizeof(arr)/sizeof(int);
    int ans = 0;
    for(int i = 0; i < n; i++){
        ans ^= arr[i];
    }
    cout<<ans<<endl;
}