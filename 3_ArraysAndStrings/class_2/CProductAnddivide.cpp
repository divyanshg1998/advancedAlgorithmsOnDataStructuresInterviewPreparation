#include<bits/stdc++.h>
using namespace std;

vector<int> f( vector<int>& arr){
    vector<int> left (arr.size());
    left[0] = 1;
    for( int i = 1; i < arr.size(); i++){
        left[i] = left[i-1] * arr[i-1];
        cout<<left[i]<<" ";
    }cout<<endl;
    int right = 1;
    for( int i = arr.size() - 2 ; i >=0 ; i--){
        right *= arr[i+1];
        left[i] = left[i] * right;
        cout<<right<<" ";
    }cout<<endl;
    return left;
}

int main(){
    vector<int> arr = {1,2,3,4};
    vector<int> arr2 = f(arr);
    for( int ele: arr2){
        cout<<ele<<" ";
    }cout<<endl;
    return 0;
}