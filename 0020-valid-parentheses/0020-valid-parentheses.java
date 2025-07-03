class Solution {
    public boolean isValid(String s) {
        Stack<Character> check=new Stack<>();
        for(int i: s.toCharArray())
    {
        if(i=='(')
        {
         check.push(')');
        }
        else if(i=='{')
        {
            check.push('}');
        }
        else if(i=='[')
        {
            check.push(']');
        }
        else if(check.isEmpty() || check.pop() !=i )
        return false;

    }
        return check.isEmpty();
    }
}