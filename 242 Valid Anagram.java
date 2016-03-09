public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ssort = s.toCharArray();
        char[] tsort = t.toCharArray();
        Arrays.sort(ssort);
        Arrays.sort(tsort);
        return Arrays.equals(ssort,tsort)?true:false;
    }
}
