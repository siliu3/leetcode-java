public class Solution {
    public int maxProduct(String[] words) {
        int[] bits = new int[words.length];
        for(int i = 0; i<26; i++){
            for(int j=0; j<words.length; j++){
                if(words[j].contains(""+(char) ('a' + i))){
                    bits[j] = bits[j] | 1<<i;
                }
            }
        }
        //System.out.println(bits[0]+" "+bits[1]+" "+bits[2]+" "+bits[3]);
        int max = 0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                if( (bits[i]&bits[j])==0 && words[i].length()*words[j].length()>max)
                    max = words[i].length()*words[j].length();
            }
        }
        return max;
    }
}
