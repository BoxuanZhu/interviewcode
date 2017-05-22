int mySqrt(int x) {
    if(x == 0 || x == 1)
        return x;
    long start, end, mid;
    start = 1;
    end = x;
    while((start + 1 )< end){
        printf("start = %d, end = %d", start, end);
        mid = start + (end - start)/2;
        if (mid * mid < x)
            start = mid;
        else
            end = mid;
    }
    printf("start = %d, end = %d", start, end);
    if(end*end == x)
        return end;
    return (int)start;
}