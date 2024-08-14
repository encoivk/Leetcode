class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        String N=""+n;
        while(true)
        {
            int num=0;
            for(int i=0;i<N.length();i++)
            {
                num+=(N.charAt(i)-'0')*(N.charAt(i)-'0');
            }
            if(set.contains(num))
            {
                return false;
            }
            else if(num==1)
            {
                return true;
            }
            else
            {
                set.add(num);
                N=String.valueOf(num);
            }
        }
    }

}