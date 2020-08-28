#include<bits/stdc++.h>
using namespace std; 
vector<int> f( vector<int>& arr){
    int i = 0 , j = 0 , k = arr.size() - 1;
    while( j <= k){

        if( arr[j] == 1)    j++;
        else if( arr[j] == 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++; 
        }
        else //( arr[j] == 2){
            {
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k--;
        }
    }

    return arr;

}

int main(){
vector<int> arr {2,2,0,2,1,1,0};
    vector<int> arr2 = f(arr);
    for( int a : arr2){
        cout<<a<<" ";
    }cout<<endl;
    
    
    return 0;
}