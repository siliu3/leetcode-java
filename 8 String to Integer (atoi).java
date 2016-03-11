public class Solution {
    public int myAtoi(String str) {
        if(str==null||"".equals(str))
            return 0;
        int rtn = 0;
        str = str.trim();
        boolean minus = (str.charAt(0)=='-');
        int i = (str.charAt(0)=='-' || str.charAt(0)=='+')?1:0;
        while(i<str.length()){
            if('0'<=str.charAt(i)&&'9'>=str.charAt(i)){
                if(214748364<rtn){
                    return minus?-2147483648:2147483647;
                }
                if(214748364==rtn){
                    if(!minus && str.charAt(i)>='7')
                        return 2147483647;
                    if(minus && str.charAt(i)>='8')
                        return -2147483648;
                }
                rtn = rtn*10 + (int)(str.charAt(i)-'0');
            }else{
                break;
            }
            i++;
        }
        rtn = minus?rtn*-1:rtn;
        return rtn;
    }
}
