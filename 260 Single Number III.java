public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums)
            xor = xor ^ num;
        int a = 0;
        int b = 0;
        int lowbit = xor & -xor;
        for(int num:nums){
            if((num&lowbit) == lowbit){
                a = a^num;
            }else{
                b = b^num;
            }
        }
        return new int[]{a,b};
    }
}
