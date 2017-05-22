public class LetterCombinationOfPhone {
    public List<String> letterCombinations(String digits) {
	        HashMap<Integer, char[]> map = new HashMap<Integer, char[]>();
	        map.put(2, new char[] {'a','b','c'});
	        map.put(3, new char[] {'d','e','f'});
	        map.put(4, new char[] {'g','h','i'});
	        map.put(5, new char[] {'j','k','l'});
	        map.put(6, new char[] {'m','n','o'});
	        map.put(7,new char[]  {'p','q','r','s'});
	        map.put(8, new char[] {'t','u','v'});
	        map.put(9,new char[] {'w','x','y','z'});
	        int slen = digits.length();
	        Integer dig;
	        ArrayList<String> result = new ArrayList<String>();
	        for(int i = 0; i < slen; i++){
	            dig = Character.getNumericValue(digits.charAt(i));
	            //System.out.println(dig);
	            if(map.containsKey(dig)){
	                System.out.println(dig);
	                if(result.size() == 0){
	                    for(int j = 0 ; j < map.get(dig).length; j ++)
	                        result.add("" + map.get(dig)[j]);
	                }
	                else
	                    result = helper(result, map.get(dig));
	            }
	        }
	        return result;
	    }
	    private ArrayList<String> helper(ArrayList<String> result, char [] cur){
	        ArrayList<String> temp = new ArrayList<String>();
	        for(int i = 0; i < result.size(); i++){
	            String scur = result.get(i);// take out one string of the current list
	            for(int j = 0; j < cur.length; j ++){
	                temp.add(scur + cur[j]);// append the new digit at the end and at that to the list
	            }
	        }
	        return temp;
	    }
}