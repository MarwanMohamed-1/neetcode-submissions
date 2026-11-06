public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length)
        {
            return false;
        }
        int[]count = new int[26];
        for(int i=0;i<t.Length;i++)
        {
            count[t[i]-'a']++;
            count[s[i]-'a']--;
        }
        foreach(int val in count)
        {
            if(val!=0)
            {
                return false;
            }
        }
        return true;
    }
}
