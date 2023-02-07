
#include <iostream>
using namespace std;
int main() {
    int k;
    cin>>k;
    while(k--){
        int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
        cin>>a1>>a2>>a3>>a4>>a5>>a6>>a7>>a8>>a9>>a10;
        int t1=a1+a3+a5+a7+a9;
        int t2=a2+a4+a6+a8+a10;
        if(t1>t2)
        {

            cout<<1<<endl;
        }
        else if(t1==t2)
        {
            cout<<0<<endl;
        }
        else{
            cout<<2<<endl;
        }
    }

    return 0;
}