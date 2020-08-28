#include<bits/stdc++.h>
using namespace std;

int f(int n) {
    vector<bool> arr(n,true);
    int count = 0 ;
    int val = sqrt(n);
    for( int i = 2;  i < arr.size(); i++){

        if(arr[i]){
            if( i < val)   
            {
                for( int j = 2; i*j < arr.size(); j++){
                arr[i*j] = false;                    
                }
            }
            count++;
        }
    }

        // int count = 0;
        // for( int i = 2; i < arr.size(); i++){
        //     cout<<i<<"->"<<arr[i]<<endl;
        //     if(arr[i])  count++;
        // }
        return count-1;
    }
    
    int main(){
    cout<<f(10)<<endl;
    return 0;
}
