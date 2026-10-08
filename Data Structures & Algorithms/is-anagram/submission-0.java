class Solution {
    public boolean isAnagram(String s, String t)
    {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        String s1 = new String(chars);
        String t1 = new String(chart);

        if(s1.equals(t1))
            return true;
        
        else 
            return false;
    }
}