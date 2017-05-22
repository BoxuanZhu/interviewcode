bool isValid(char* s) {
    char * top = calloc(strlen(s) + 1, sizeof(char));
    int i = 0, j = 0;
    while(s[i] != '\0'){
        if(s[i] == '(' || s[i] == '{' ||s[i] == '['){
            top[j] = s[i];
            /*printf("top[j] =%c\n", top[j]);*/
            j ++;
        }
        else{
            if( j != 0 && ((top[j - 1] == '(' && s[i] == ')') ||(top[j - 1] == '[' && s[i] == ']') ||(top [j - 1] == '{' && s[i] == '}') ))
                j = j - 1;
            else{
                /*printf("from here?\n");
                printf("the current top is %c, s[i] = %c\n", top[j - 1], s[i]);*/
                free(top);
                return false;
            }
        }
        i ++ ;
    }
    free(top);
    return j == 0 ? true : false;
}