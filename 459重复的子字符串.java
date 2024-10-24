class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //双指针
        if(s.length()<2)return false;
        for(int len=1;len<=s.length()/2;len++)
        {
            if(s.length()%len!=0)continue;
            boolean repeat=true;
            int left=0,right=left+len;
            while(right<s.length())
            {
                if(s.charAt(left)!=s.charAt(right))
                {
                    repeat=false;
                    break;
                }
                left++;
                right++;
            }
            if(!repeat)
                continue;
            return true;
        }
        return false;
    }
}