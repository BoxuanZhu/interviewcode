public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);// use Arrays.sort
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        ArrayList<List<String>>rst = new ArrayList<List<String>>();
        for(String key: map.keySet()){
            rst.add(map.get(key));
        }
        return rst;
    }
    
}