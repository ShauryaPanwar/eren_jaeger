#include <iostream>
using namespace std;

int main(){
    int marks[4]={12,34,56,78};


    int *p=marks;
    cout << *(p) << endl;
    cout << *(p+1) << endl;
    cout << *(p+2) << endl;
    cout << *(p+3) << endl;
    return 0;
    
}


// command for cpp compilation
// g++ -o output.exe file.cpp
// command for running cpp files
// ./output.exe
