public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int zero = -1;
        for(i = 0; i<nums.length; i++){
            if(nums[i]!=0&&zero!=-1){
                nums[zero] = nums[i];
                nums[i] = 0;
                zero++;
            }
            if(nums[i]==0){
                if(zero==-1)
                    zero = i;
                continue;
            }
        }
    }
}
