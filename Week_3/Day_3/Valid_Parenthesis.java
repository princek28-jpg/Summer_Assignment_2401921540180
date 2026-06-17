package Week_3.Day_3;
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1) return false;
        for(char ele:s.toCharArray()){
            if(ele=='['||ele=='{'||ele=='('){
                st.push(ele);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if(ele==')' && top!='(') return false;
                if(ele=='}' && top!='{') return false;
                if(ele==']' && top!='[') return false;
                
            }
        }
        return st.isEmpty();
    }
}
