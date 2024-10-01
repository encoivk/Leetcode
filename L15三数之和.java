class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            int a=i+1,b=nums.length-1;
            while(b>a)
            {
                if(a>i+1&&nums[a]==nums[a-1])
                {
                    a++;
                    continue;
                }
                if(b<nums.length-1&&nums[b]==nums[b+1])
                {
                    b--;
                    continue;
                }
                int num=nums[i]+nums[b]+nums[a];
                if(num==0)
                {
                    List<Integer>temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[a]);
                    temp.add(nums[b]);
                    list.add(temp);
                    a++;
                }
                else if(num>0)
                b--;
                else if(num<0)
                {
                    a++;
                }
            }
        }
        return list;
    }
}