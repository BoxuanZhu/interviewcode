public class Solution {
    public String simplifyPath(String path) {
        Stack st = new Stack();
        String[] sarr = path.split("/");
        int len = sarr.length;
        for(int j = 0; j< len; j++){
            System.out.println("sarr["+j+"] = "+ sarr[j]);
        }
        for (int i = 0 ; i < len; i ++){
            if(!sarr[i].equals(".") &&sarr[i].length()> 0){//don't do anything if it is a .
                if(sarr[i].equals("..")&& !st.empty())// remove the current if it is .. and the stack is not empty
                    st.pop();
                else if(!sarr[i].equals(".."))//psuh in a new path if anything else
                    st.push("/"+sarr[i]);
            }
        }
        String rst = "";
        if(st.empty())// if the stack is empty just return root path
            return "/";
        while(!st.empty())
            rst = st.pop() +rst;
        return rst;
    }
}