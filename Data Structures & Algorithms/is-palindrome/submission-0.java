class Solution {
    public boolean isPalindrome(String s) {
        String regex = "[^\\w]";
        s = s.replaceAll(regex, "");
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); ++i){
            for (int j = s.length()-1; j >= 0; --j){
                System.out.println("" + s.charAt(i) + s.charAt(j));
                if (s.charAt(i) != s.charAt(j)){
                    return false;
                }
                ++i;
            }
        }
        return true;
    }
}
