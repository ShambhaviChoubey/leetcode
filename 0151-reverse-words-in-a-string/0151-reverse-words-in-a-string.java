class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] s1 = s.split("\\s+");
        String h = "";
        for (int i = s1.length - 1; i >= 0; i--) {
            h += s1[i];  // Add the word
            if (i != 0)  // Avoid adding extra space at the end
                h += " ";
        }
        
        return h;
    }
}