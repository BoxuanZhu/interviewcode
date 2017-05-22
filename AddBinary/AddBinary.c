char* addBinary(char* a, char* b) {
    char * tmp, *result;
    int i,j,val, sum, carry = 0, lenA,lenB;
    lenA = strlen(a);
    lenB = strlen(b);
    if(lenA < lenB){
        tmp = a;
        a = b;
        b = tmp;
        lenA = strlen(a);
        lenB = strlen(b);
    }
    result = malloc((lenA+1)*sizeof(char));
    result[lenA] = '\0';//append the end of string at the end
    i = lenA -1;
    j = lenB -1;
    while(j >= 0){
        sum = (a[i]- '0') + (b[j]- '0') + carry;
        val = sum%2;
        carry = sum/2;
        result[i] = val +'0';
        j --;
        i --;
    }
    
    while(i >= 0){
        sum = (a[i]- '0')  + carry;
        val = sum%2;
        carry = sum/2;
        result[i] = val +'0';
        i --;
    }
    printf("result is %s\n",result);
    if(carry == 1){
        i = strlen(result);
        tmp = malloc((i+ 2)*sizeof(char));
        tmp [0] = '1';
        tmp[1] = '\0';
        printf("tmp is %s", tmp);
        result = strcat(tmp, result);
    }
    return result;
}