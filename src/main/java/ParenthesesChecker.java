
import java.util.Stack;

public class ParenthesesChecker {
    public boolean checkParentheses(String testString){
        if(testString.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        char c;
        for(int i=0; i<testString.length(); i++){
            c = testString.charAt(i);
            if(c == '(')
                stack.push(c);
            else if(c == '{')
                stack.push(c);
            else if(c == '<')
                stack.push(c);
            else if(c == '[')
                stack.push(c);
            else if(c==')')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if(c == '}')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            else if(c == '>')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '<')
                    stack.pop();
                else
                    return false;
            else if(c == ']')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '[')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }


}

