// Given an input string, reverse the string word by word.
// For example, Given s = "the sky is blue", return "blue is sky the".

public class Solution {
    public String reverseWords(String s) {
        if(s == null || s.equals(""))
            return s;
        String arr[] = s.trim().split("\\s+");
        
        StringBuilder res = new StringBuilder("");
        for(int i = arr.length-1; i >-1; i-- ){
            res.append(arr[i]).append(" ");
        }
        return res.toString().trim();
    }
}
