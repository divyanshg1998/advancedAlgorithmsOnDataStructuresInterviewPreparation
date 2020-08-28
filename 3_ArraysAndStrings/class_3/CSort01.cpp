#include<bits/stdc++.h>
using namespace std;

vector<int> f( vector<int> arr){
    int i = 0, j = 0;
    for( int j = 0 ; j < arr.size(); j++){
        // if( arr[j] == 1)     j++;
        if( arr[j] == 0){
            //swap
            //dont do directly here, swap fully
            int temp = arr[i];
            arr[i] = arr[j]; 
            arr[j] = temp;
            i++;           
        }       
  }  
  return arr;
  }

int main(){
    //for easiest of the easiest codes , always dry run and
    // write on paper code first
    vector<int> arr{1 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,0};
    vector<int> arr2 = f(arr);
    for( int a : arr2){
        cout<<a<<" ";
    }cout<<endl;
    
    return 0;
}

