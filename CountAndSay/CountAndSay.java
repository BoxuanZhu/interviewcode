public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";
        int i = 1;
        while(i++ < n){
            String cur = "";
            int count = 1;
            for (int j = 0; j < result.length(); j++){
                if (j + 1 < result.length() &&result.charAt(j) == result.charAt(j+1)){
                    count ++;
                }
                else {
                    cur = cur + count +result.charAt(j);
                    count = 1;
                }
            }
            result = cur.length() >0 ? cur:result;
        }
        return result;
    }
}