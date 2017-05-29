public class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int [] count = new int [n+1];//count the number of books at given citation
        for(int i = 0; i < n; i++){
            if(citations[i] >= n)//if citations is greater than number of books, count it as n citation
                count[n]++;
            else
                count[citations[i]]++;
        }
        
        int t = 0;
        for(int i = n; i>-1; i--){
            t += count[i];
            if(t >= i)
                return i;
        }
        return 0;
    }
}