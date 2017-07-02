public class Solution {
    public String numberToWords(int num) {
        String[] units = {""," Thousand"," Million"," Billion"}; 
        String[] ten = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", 			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", 								"Seventeen", "Eighteen", "Nineteen"};  
        String[] hundred = {"","Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", 				"Ninety"};  
        //initialize the arrays
        
        String rst = "";
        int count= 0;// keep track of the unit
        while(num != 0){
            int curDigit = num % 1000;//get the last three digits
            String curName = "";
            if (curDigit > 99){//get the hundred digit
                curName = ten[(curDigit / 100)] + " Hundred";
                curDigit = curDigit % 100;
            }
            if (curDigit < 20 && curDigit > 0) {
                if (curName.length() >0)// add an empty space if necessary
                    curName = curName +" ";
                curName = curName + ten[curDigit];
            }
            else if(curDigit >= 20){
                if (curName.length() >0)
                    curName = curName +" ";
                String tmpTen = hundred[curDigit / 10];
      
                String tmpOne = curDigit % 10 == 0? "" : (ten[curDigit % 10]);
                
                String tmp = "";
                if(tmpTen.length() > 0 && tmpOne.length() > 0)
                    tmp = tmpTen + " "+ tmpOne;
                else 
                    tmp = tmpTen+tmpOne;
                curName = curName + tmp;
            }
           	if (curName.length() >0)
                    curName = curName + units[count];
            
            count ++;
            
            if(rst.length()>0 && curName.length() > 0)
                curName = curName + " ";
            rst = curName + rst;
            num = num / 1000;
        }
        return rst.length() > 0 ?rst: "Zero";
        
    }
}