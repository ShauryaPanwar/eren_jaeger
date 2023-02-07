
#include <iostream>
using namespace std;
int main() {
    int k;
    cin>>k;
    while(k--){
        int a,b,c,d;
        cin>>a>>b>>c>>d;
        if(a+c==180 && b+d==180){
            cout<<"Yes"<<endl;
        }
        else{
            cout<<"No"<<endl;
        }
    }

    return 0;
}