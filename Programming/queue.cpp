#include <iostream>
#include <queue>
using namespace std;

void printqueue(queue <int> q){
    while(!q.empty()){
        cout << q.front() << " ";
        q.pop();
    }
    cout << endl;
}


int main()
{
    queue <int> myqueue;
    myqueue.push(10);
    myqueue.push(20);
    myqueue.push(30);

    cout << "myqueue size: " << myqueue.size() << endl;
    cout << "myqueue front: " << myqueue.front() << endl;
    cout << "myqueue back: " << myqueue.back() << endl;

    cout << "myqueue contains: " << endl; 
    printqueue(myqueue);


}