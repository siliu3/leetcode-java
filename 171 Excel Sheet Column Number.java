public class Solution {
    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        char a = 'A';
        int col = 0;
        for(int i = 0; i<c.length; i++){
            col += (c[i]%a+1)*Math.pow(26,c.length-i-1);
        }
        return col;
    }
}
