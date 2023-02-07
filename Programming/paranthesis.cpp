#include <iostream>
#include <stack>
using namespace std;
    int main()
{
        string s = "([)]";
        bool m = isValid(s);
        cout << m;
}

bool isValid(string s){
        stack <char> st;
        for(int i=0;i<s.length();i++){
            char ch = s[i];
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else{

                if(!st.empty()){
                    char t = st.top();
                    if((ch==')' && t=='(') ||
                    (ch=='}' && t=='{') ||
                    (ch==']' && t=='[')
                    )
                    {
                        st.pop();

                    }
                    else
                    {
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            
        }
        if(st.empty()){
                return true;
            }
            return false;
    }





     
