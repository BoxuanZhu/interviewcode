bool validChar(char c);
bool isPalindrome(char* s) {
    int front, back;
    front = 0;
    back = strlen(s) - 1;
    while (front < back){
        if(!validChar(s[front]))
            front ++;
        else if(!validChar(s[back]))
            back --;
        else if(tolower(s[front]) != tolower(s[back]))
            return false;
        else{
            front ++;
            back --;
        }
        
    }
    return true;
    
}
bool validChar(char c){
    return (c >= 'a' && c <= 'z') ||(c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') ;
}