public class ValidPar {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for(int i = 0; i < s.length();i ++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' ||s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else{
                String temp = stack.empty()? null : stack.pop().toString();// if nly right para are in the string
                temp = temp + s.charAt(i);
                if(!temp.equals("()") && !temp.equals("[]") && !temp.equals("{}"))
                    return false;
            }
        }
        return stack.empty()?true:false;
    }
}