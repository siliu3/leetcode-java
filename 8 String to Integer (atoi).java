public class Solution {
    public int myAtoi(String str) {
        if(str==null||str=="")
            return 0;
        int rtn = 0;
        str = str.trim();
        int i = (str.charAt(0)=='-')?1:0;
        while(i<str.length()){
            if('0'<=str.charAt(i)&&'9'>=str.charAt(i)){
                rtn = rtn*10 + (int)(str.charAt(i)-'0');
            }else{
                break;
            }
            i++;
        }
        rtn = (str.charAt(0)=='-')?rtn*-1:rtn;
        return rtn;
    }
}
