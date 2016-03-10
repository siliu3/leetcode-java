public class Solution {
    public int bulbSwitch(int n) {
        int on = 0;
        int sum = 0;
        for(int i=3;sum<n;on++){
            sum = sum + i;
            i = i + 2;
        }
        return on;
    }
}
