public class Solution {
    public boolean isHappy(int n) {
        if(n==1||n==7){
            return true;
        }else if(n<10){
            return false;
        }else{
            int[] a = new int[(int)(Math.log10(n)+1)];
            int i = 0;
            while(n > 0){
                a[i] = n % 10;
                n = n/10;
                i++;
            }
            int sum = 0;
            for(int num:a){
                sum += Math.pow(num,2);
            }
            return isHappy(sum);
        }
    }
}
