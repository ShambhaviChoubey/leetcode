class Solution {
    public boolean isValid(String s) {
     Stack<Character> Stack=new Stack<>();
     java.util.Map<Character,Character> close=new java.util.HashMap<>();
      close.put(')','(');
      close.put('}','{');
      close.put(']','[');

       for(char c: s.toCharArray())
       {
        if(close.containsKey(c))
        {
            if(!Stack.isEmpty() && Stack.peek()==close.get(c))
            {
                Stack.pop();
            }
            else
            {
                return false;
            }
        }
            else
            {
                Stack.push(c);
            }
        }
        return Stack.isEmpty();
       }   
    
}
