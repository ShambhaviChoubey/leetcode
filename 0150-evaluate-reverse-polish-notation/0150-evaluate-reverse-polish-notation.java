class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> check=new Stack<>();
      for(String c:tokens)
      {
        if(c.equals("+"))
        {
            check.push(check.pop() +check.pop());
        }
        else if(c.equals("-"))
        {
            int a=check.pop();
            int b=check.pop();
            check.push(b-a);
        }
        else if(c.equals("*"))
        check.push(check.pop()*check.pop());
        else if(c.equals("/"))
    {
        int a=check.pop();
            int b=check.pop();
            check.push(b/a);
    }
    else
    {
        check.push(Integer.parseInt(c));
    }
      } 
      return check.pop(); 

    }
}
