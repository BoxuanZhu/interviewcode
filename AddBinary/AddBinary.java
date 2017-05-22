public class AddBinary {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()){
            String tmp = a;
            a = b;
            b = tmp;   
        }//make string always the longest string
        String res = "";
        int carry = 0;
        int i, j;
        for(i = a.length() - 1 , j = b.length() - 1; i >= 0 && j >=0; i --, j--){
            int sum = carry + (int)(a.charAt(i) - '0')+ (int)(b.charAt(j) - '0');
            int val = sum % 2;
            carry = sum/2;
            res = val+res;
        }
        while(i >= 0){
            int sum = carry + (a.charAt(i) - '0');
            int val = sum % 2;
            carry = sum/2;
            res = val+res;
            i -- ;
        }
        if(carry == 1)
            res = "1"+res;
        return res;
    }
}