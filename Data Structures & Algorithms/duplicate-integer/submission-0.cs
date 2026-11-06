public class Solution {
    public bool hasDuplicate(int[] nums) {
        List<int> List = new List<int>();
        foreach(var number in nums)
        {
            if(List.Contains(number))
            {
                return true;
            }else
            {
                List.Add(number);
            }
        }
        return false;
    }
}
