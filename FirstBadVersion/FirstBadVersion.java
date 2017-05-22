/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
     /*public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }
            
        if (isBadVersion(start)) {
            return start;
        }
        return end;
    }*/
    public int firstBadVersion(int n) {
        int p = 1;
        int q = n;
        int mid = (p+q)/2;
        while(p+1 < q){
            if(isBadVersion(mid))
                q = mid;
            else
                p = mid;
            mid = (p+q)/2;
            System.out.println("p = " + p + "q = "+ q);
        }
        if(isBadVersion(p))
            return p;
        return q;
    }
    
}