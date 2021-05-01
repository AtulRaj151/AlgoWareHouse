#include<iostream>
using namespace std;

int main(){
    int n,no;
    cin>>n;
    int sumArr[64] = {0};
    
    for(int i = 0; i<n; i++){
        cin>>no;
        int j = 0;
        while (no>0)
        {
            int last_bit = (no&1);
            sumArr[j] += last_bit;
            j++;
            no = no >> 1;
        }
    }

    int p = 1;
    int ans = 0;
    for(int j = 0; j<64; j++){
        sumArr[j] %= 3;
        ans += (sumArr[j]*p);
        p = p << 1;
    }
    cout<<ans<<endl;

}