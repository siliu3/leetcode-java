public class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }else if(n==1){
            return true;
        }else{
            int length = (int)(Math.log10(n)+1);
            return Math.pow(3,length*2)==n||Math.pow(3,length*2-1)==n;
        }
    }
}
