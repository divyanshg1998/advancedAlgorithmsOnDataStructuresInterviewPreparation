#include<bits\stdc++.h>
using namespace std;

int f( vector<int>& arr){
    if( arr.size() == 0)    return 0;
    int ii = 1;
    for( int i = 1 ; i < arr.size(); i++){
        if( arr[i] == arr[i-1]){}
        else{   
                 arr[ii] = arr[i];  
                 ii++;
            }
    }
    return ii;
}

int main(){
    //we have to return the original arr
    //and take no extra space too
    //and by returning length itself bcz loop there
    vector<int> arr {0,0,1,1,1,2,2,3,3,4};    
    int len = f(arr);
    for( int i = 0 ; i < len ; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}