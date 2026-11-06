public class Solution {
    public bool IsPalindrome(string s) {
        string newS="";
        foreach(char c in s)
        {
            if(isAlphaNumic(c))
            {
                newS += char.ToLower(c) ;
            }
        }
        int l =0;
        int r = newS.Length-1;
        while(l<r)
        {
            if(newS[l]!=newS[r])
            {
                return false;
            }
            l++;
            r--;
            
        }
        return true;
    }
    public bool isAlphaNumic(char c)
    {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')||(c >= '0' && c <= '9'))
        {
            return true;
        }
        return false ;
    }
}