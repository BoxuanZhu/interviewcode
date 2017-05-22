public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        int [] res = new int[len1 + len2 + 2];
        //key part is that the result will always be less than or equal to the sum of two length
        int product, carry, j, i;
        for(i = len1; i >= 0; i --){// go through each string backwards so the number is multiplied from the least digit
            carry = 0;
            for( j = len2; j >= 0; j --){
                product = carry + res[i + j + 1] + (Character.getNumericValue(num1.charAt(i)) *
                    Character.getNumericValue(num2.charAt(j)));
                res[i + j + 1] = (product % 10);
                //System.out.println("i + j +1 = " +(i + j +1 )+ " res[i+j+1]  = "+ res[i+j+1] );
                carry = product /10;
            }
            res[i + j + 1]= carry;
            //System.out.println("i + j +1 = " +(i + j +1 )+ " res[i+j+1]  = "+ res[i+j+1] );
        }
        i = 0;
        while( i < res.length  - 1 && res[i] == 0){// delete all the '0' in front keeping one 0 at the end if the result is 0
            i ++;
        }
        String result = "";
        while(i < res.length )
            result = result +res[i++];
        return result;
    }
    
}