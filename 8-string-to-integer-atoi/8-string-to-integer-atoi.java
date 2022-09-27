class Solution {
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
        int i=0;
        boolean negativeSign = false;
        while(i<s.length() && s.charAt(i)==' '){
           i++; 
        }
        if(i<s.length() && s.charAt(i)=='-'){
            negativeSign = true;
            i++;
        }else if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }
        
        while(i<s.length() && s.charAt(i)=='0'){
           i++; 
        }

        long num = 0;
        while(i<s.length() && num<=Integer.MAX_VALUE){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num=(num*10)+Character.getNumericValue(s.charAt(i));
                i++;
                
            }else{
                break;
            }
        }
        num = negativeSign ? -num : num;
        if(num<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if(num > Integer.MAX_VALUE-1){
            return Integer.MAX_VALUE;
        }else{
            return (int)num;
        }
    }
}