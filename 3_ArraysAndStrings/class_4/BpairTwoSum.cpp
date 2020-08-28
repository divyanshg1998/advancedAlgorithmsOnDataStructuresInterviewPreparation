#include<bits/stdc++.h>
using namespace std;

vector<int> f( vector<int>& arr, int sum){
    unordered_map<int, int> map ;
    for( int i = 0 ; i < arr.size() ; i++){
        int ele = arr[i];
        int ele2 = sum - ele; 
        if(map.find(ele2) != map.end())
        {
            vector<int> arr2(2,0);
            arr2[0] = map[sum - ele];
            arr2[1] = i;
            return arr2;
        }
        map[ele] = i;
    }
    vector<int> arr3(2);//no initialise
    return arr3;
}

int main(){
    //to check if any two pairs have sum = 16
    vector<int> arr {1 ,4 ,45, 6, 10, 8};
    vector<int> a = f(arr, 16);
    for( int aa : a){
        cout<<aa<<" ";
    }cout<<endl;
    return 0;
}
