public class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            int a = 1;
            int b = 2;
            int tmp;
            for(int i = 0; i<n-2; i++){
                tmp = a;
                a = b;
                b = tmp + b;
            }
            return b;
        }
    }
}
