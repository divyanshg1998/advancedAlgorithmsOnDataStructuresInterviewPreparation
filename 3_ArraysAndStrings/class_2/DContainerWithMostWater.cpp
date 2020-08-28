#include<bits/stdc++.h>
using namespace std;

int f( vector<int>& arr){
    int i = 0, j = arr.size() - 1, fans = INT_MIN;
    while( i != j){

        int cans = (j-i) * min(arr[i],arr[j]);
        fans = max( fans, cans);
        
        if( arr[i] > arr[j])    j--;
        else if( arr[i] <= arr[j])   i++;

    }
    return fans;

}
int main(){
    vector<int> arr{1,8,6,2,5,4,8,3,7};
    cout<<f(arr)<<endl;   
    return 0;
}