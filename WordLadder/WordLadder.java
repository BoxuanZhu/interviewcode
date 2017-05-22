public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        System.out.println(wordList);
        if(beginWord.equals(endWord))
            return 1;
        int len = beginWord.length();
        HashSet<Character> alpha = new HashSet<Character>();
        HashSet<String> words = new HashSet<String>();
        for(String str: wordList)// use hashSet or contains will cause time limite execeeded
            words.add(str);
        get_alpha(wordList, alpha, len);
        HashMap<String,Integer>visited = new HashMap<String,Integer>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(beginWord);
        visited.put(beginWord, 1);
        while(!queue.isEmpty()){
            String cur = queue.remove();
            int num = visited.get(cur);
            for(int i = 0; i < len; i ++){
                for(Character c : alpha){
                    StringBuilder dup = new StringBuilder(cur);
                    dup.setCharAt(i,c);
                    String tmp = dup.toString();
                    if(tmp.equals(endWord))
                        return num +1;
                    else if(words.contains(tmp) && !visited.containsKey(tmp)){
                        visited.put(tmp, num+1);
                        queue.add(tmp);
                    }
                }
            }
        }
        return 0;
    }
    
    /*get all the alphabets, takes O(n*m), n is number of words in wordList, m is length of words*/
    private void get_alpha(List<String> wordList, HashSet<Character> alpha, int len){
        for(String str:wordList){
            for(int i = 0; i < len; i ++){
                Character c = str.charAt(i);
                if(!alpha.contains(c))
                    alpha.add(c);
            }
        }
    }
    
}