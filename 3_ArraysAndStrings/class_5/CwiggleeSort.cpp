#include<bits\stdc++.h>
using namespace std; 

void swap( vector<int>& arr, int i, int j){
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
}

void f( vector<int>& arr){

     for( int i = 1 ; i < arr.size(); i++){
         if( (i & 1) && (arr[i-1] > arr[i])){
            //  cout<<i<<" "<<(i&1)<<" "<<arr[i-1]<<">"<<arr[i]<<endl;
            swap(arr,i-1,i);
        //     cout<<"arr: ";
        //     for( int ele : arr ){
        //     cout<<ele<<" ";
        //    }cout<<endl;
 
         }
         else if( ((i & 1) == 0) && (arr[i-1] < arr[i])){
             //in bits , brackets most most imp as
             //without so many brackets, above not working
            //  cout<<i<<" "<<(i&1)<<" "<<arr[i-1]<<"<"<<arr[i]<<endl;
            swap(arr,i-1,i);
        //        for( int ele : arr ){
        // cout<<ele<<" ";
    // }cout<<endl;
 
         }
         else{
            //  cout<<i<<" "<<(i&1)<<" "<<arr[i-1]<<"---"<<arr[i]<<endl;
         }
     }
}

int main(){
     vector<int> arr {3,5,2,1,6,4};
     f(  arr);
    for( int ele : arr ){
        cout<<ele<<" ";
    }cout<<endl;

    return 0;
}