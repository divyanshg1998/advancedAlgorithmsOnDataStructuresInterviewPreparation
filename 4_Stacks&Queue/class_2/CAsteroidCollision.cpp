#include<bits/stdc++.h>
using namespace std;

vector<int> f( vector<int>& arr){
    stack<int> st;

    for( int i = 0 ; i < arr.size(); i++){
        int num = arr[i];
        if( num > 0){
            st.push(i);
        }
        else{
            bool tru = true;
            while( st.size() != 0 && arr[st.top()] > 0){
                if( arr[st.top()] > -num){
                    tru = false;
                    break;
                }
                else if( arr[st.top()] == -num){
                    st.pop();
                    tru = false;
                    break;
                }else{
                    st.pop();
                }
            }   
            if( tru == true){
                st.push(i);
            }
            } 
        }
       
        vector<int> v(0);
        while( st.size() != 0){
            int ele = (int)(st.top());
            st.pop();
            int num2 = arr[ele] ;
            v.push_back(num2);
            }
        reverse(v.begin(), v.end());
        return v;
}

int main(){
    // vector<int> arr {-2, -1, 1, 2};
    vector<int> arr {10, 2, -5};
    vector<int> arr2 = f(arr);   
    for( int ele :arr2){
        cout<<ele<<" ";
    }cout<<endl;
 
    return 0;
}