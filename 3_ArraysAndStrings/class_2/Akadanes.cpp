#include<bits\stdc++.h>
using namespace std;

int f1( vector<int>& arr){

    int maxSum = arr[0];
    for( int i = 1 ; i < arr.size(); i++){
        //changing in arr itself here
        if(arr[i-1]>0)
        arr[i] += arr[i-1];  
        maxSum = max(arr[i], maxSum);
    }  
    return maxSum;

    }

int f2(vector<int>& arr){
    // int a = 45; int var = 43;
    
    int osum = INT_MIN, os = -1, oe = -1;
    int csum = 0, cs = 0, ce = -1;
    for( int i = 0 ; i < arr.size(); i++){
        if(csum >= 0){
            ce++;
            csum += arr[i];
        }
        else{
            cs = i;
            ce = i;
            csum = arr[i];            
        }
        if( csum > osum){
            osum = max( osum, csum);
            os = cs;
            oe = ce;
        }
    }
    // a++; var++;
 
    return osum;
}

int main(){
    //most most imp class with all ques asked many a times
 
    vector<int> arr {-2,1,-3,4,-1,2,1,-5,4};
    cout<<f1(arr)<<endl;
    cout<<f2(arr)<<endl;
 
    return 0;
}