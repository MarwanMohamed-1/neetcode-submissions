public class Solution {
    public bool IsPalindrome(string s) {
        string newS = "";
        foreach(char c in s)
        {
            if(isAlphaNumic(c))
            {
                newS += char.ToLower(c);
            }
        }
        return newS == new string(newS.Reverse().ToArray());
    }
    public bool isAlphaNumic(char c)
    {
        if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')||((c >= '0' && c <= '9')))
        {
            return true;
        }
        return false;
    }
}
