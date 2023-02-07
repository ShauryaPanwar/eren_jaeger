#include <bits/stdc++.h>
using namespace std;
void printstack(stack<int>j){
    if(j.empty())
       return;
    int x=j.top();

    j.pop();
    printstack(j);

    cout << x << " ";

    j.push(x);


}


int main()
{

    stack<int>s;
    s.push(1);
    s.push(2);
    s.push(3);
    s.pop();
    s.push(4);
    s.push(6);
    s.push(9);
    s.pop();
    s.push(100);

    printstack(s);


}