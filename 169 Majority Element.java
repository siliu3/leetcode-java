public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int major = nums[0];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==major){
                count++;
                if(count>nums.length/2){
                    break;
                }
            }else{
                major=nums[i];
            }
        }
        return major;
    }
}
