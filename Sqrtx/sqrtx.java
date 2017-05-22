public class Solution {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        long start = 1;
        long end = x;
        //int mid = start +(end - start)/2;
        while(start + 1 < end){
            
            long mid = start +(end - start)/2;// will overflood if made to int
            //System.out.println("start  = "+start + " mid = "+mid+ " mid*mid = "+mid*mid+"\n");
            if(mid * mid > x)
                end = mid;
            else
                start = mid;
            
            
        }
        return (int)start;
    }
}
/*class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
/*    public int mySqrt(int x) {
        // find the last number which square of it <= x
        long start = 1, end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            System.out.println("start  = "+start + "mid = "+mid+"\n");
            if (mid * mid <= x) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (end * end <= x) {
            return (int) end;
        }
        return (int) start;
    }
}*/