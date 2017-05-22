public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int front, back;
        front = 0; 
        back = s.length() - 1;
        while(front < back){
            if(!validChar(s.charAt(front)))
                front ++;
            if(!validChar(s.charAt(back)))
                back --;
            if (validChar(s.charAt(back)) &&validChar(s.charAt(front))){
                if(Character.toLowerCase(s.charAt(back)) != Character.toLowerCase(s.charAt(front)))// case sensitive
                    return false;
                front++;
                back --;
            }
        }
        return true;
    }
    
    private boolean validChar (char c){
        return Character.isDigit(c)|| Character.isLetter(c);
    }
}