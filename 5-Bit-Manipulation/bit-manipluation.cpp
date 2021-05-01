#include <iostream>
using namespace std;

// get the ith bit of numner num 
int getBit(int num, int i){
    int mask = 1<<i;
    int bit = (num&mask)>0 ?1:0;
    return bit;
}

// set the ith bit
int setBit(int num, int i){
    int mask = 1 << i;
    num = num | mask;
    return num;
}

// clear the ith bit
int clearBit(int n, int i){
    int mask = ~(1<<i);
    n = n & mask;
    return n;
}
// update the ith bit of number num with value v
int updateBit(int n, int i, int v){
    int mask = ~(1<<i);
    int cleared_n = n & mask;
    n = cleared_n | (v<<i);
    return n;
}

// Function print bit of the integer number 
void printBit(int n){
    int i = 0;
    while(i < 64){
        int last_bit = (n&1);
        n = n >> 1;
        cout<<last_bit;
        i++;
    }
}

int clearLastIBit(int n,int i){
    int mask = (-1<<i);
    return n & mask;
}

// clear the bit of number num from ith bit to jth bit
int clearRangeOfBits(int n, int i, int j){
    int ones = (~0);
    int a = ones<<(j+1);
    int b = (i<<i) - 1;
    int mask = a | b;
    int ans = n & mask;
    return ans;
}

// count the total number of set bit 
int countSetBits(int n){
    int count = 0;
    while(n>0){
        int last_bit = n&1;
        count += last_bit;
        n = n >> 1;
    }
    return count;
}

int countSetBitFast(int n){
    int count = 0;
    while(n>0){
        n = n&(n-1);
        count++;
    }
    return count;
}
int main()
{
    int a = 5;
    int b = 10;

    int c = b ^ a;
    cout << "b xor a " << c << endl;
    c = b & a;
    cout << "b and a " << c << endl;
    c = b | a;
    cout << "b or a " << c << endl;

    c = 5 << 1;
    cout<<"Left shift 5 << 1"<<c<<endl;

    c = 5 >> 1;
    cout<<"Right shift 5 >> 1"<<c<<endl;

    cout<<countSetBits(13)<<endl;
    cout<<countSetBitFast(13)<<endl;
    cout<<__builtin_popcount(13)<<endl;
}