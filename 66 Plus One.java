public class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            digits[i] = digits[i] + 1;
            if(digits[i] == 10){
                if(i==0){
                    int[] num = new int[digits.length+1];
                    num[0] = 1;
                    return num;
                }else
                    digits[i] = 0;
            }else{
                break;
            }
        }
        return digits;
    }
}
