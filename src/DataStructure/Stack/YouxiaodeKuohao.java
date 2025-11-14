package DataStructure.Stack;

import java.util.ArrayDeque;

class Solution111 {
    public boolean isValid(String s) {
        boolean res = true;
        int len = s.length();
        if (len%2==1){
            return false;
        }
        ArrayDeque<Character> Stack = new ArrayDeque<Character>();
        for (int i=0;i<len;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
                Stack.addLast(s.charAt(i));
            }
            else if((!Stack.isEmpty()&&Stack.peekLast().equals('(')&&s.charAt(i)==')')
                    || (!Stack.isEmpty()&&Stack.peekLast().equals('{')&&s.charAt(i)=='}')
                    || (!Stack.isEmpty()&&Stack.peekLast().equals('[')&&s.charAt(i)==']')){
                Stack.pollLast();
            } else {
                res = false;
            }
        }
        if (!Stack.isEmpty()){
            res = false;
        }
        return res;
    }
}
