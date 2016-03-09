public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }else{
            int length = (int)(Math.log10(n)+1);
            int pow = (length-1)*3;
            while(n>Math.pow(2,pow)){
                pow++;
            }
            return n==Math.pow(2,pow);
        }
    }
}
