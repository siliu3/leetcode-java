public class Solution {
    public int missingNumber(int[] nums) {
        boolean[] b = new boolean[nums.length+1];
        for(int num:nums){
            b[num] = true;
        }
        int i;
        for(i=0;i<b.length;i++)
            if(!b[i])
                return i;
        return i;
    }
}
