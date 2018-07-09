// No.242 Valid Anagram
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();
        Arrays.sort(s_chars);
        Arrays.sort(t_chars);
        return Arrays.equals(s_chars, t_chars);
    }
}
