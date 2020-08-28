#include<bits/stdc++.h>
using namespace std;
int f( vector<int>& a, int k){
unorderedMap<int,int> hm;
int kk = 0;
for( int i = 0 ; i < a.size(); i++){
    if( hm.count(a[i] + k) != hm.end){
        hm.       
    }
    else if( hm.count(a[i] - k) != hm.end){

    }
    else{
        hm[a[i]]++;
    }
}    
return kk;
}

int main(){
    vector<int> a{3, 1, 4, 1, 5};
    cout<<f(a,2);
    return 0;
}