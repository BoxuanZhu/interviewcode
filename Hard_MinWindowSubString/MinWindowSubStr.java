public class Solution {
    public String minWindow(String s, String t) {
        int [] dest = new int[255];
        //map the target string to an int array
        for (int i = 0; i < t.length(); i ++){
            dest[t.charAt(i)]++;
        }
        
        int minLen = s.length();//keep track of the minimum window
        int begin = -1, end = 0, found = 0;
        int start = 0;
        int [] cur = new int [255];
        for(int i = 0; i < s.length(); i ++){
            char tmp = s.charAt(i);
            cur[tmp]++;
            if(cur[tmp] <= dest[tmp] )//the current char is inside the target string
                found ++;
            if(found == t.length()){//all of the string has been found
            //find the start position of the first found char inside the source string
                while(start < i && cur[(s.charAt(start))] > dest[s.charAt(start)]){
                    cur[s.charAt(start)]--;
                    start ++;
                }
                //update the begin, end and minLen
                if(i - start <minLen){
                    begin = start;
                    end = i;
                    minLen = i - start;
                }
                //take out the first found letter
                cur[s.charAt(start)]--;
                start++;
                found --;
            }
        }
        return begin == -1? "": s.substring(begin,end + 1);
    }
}