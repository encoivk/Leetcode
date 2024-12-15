class Solution {
    public int trap(int[] height) {
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];
        leftMax[0]=0;
        rightMax[rightMax.length-1]=0;
        int max=0;
        for(int i=1;i<leftMax.length;i++)
        {
            max=Math.max(max,height[i-1]);
            leftMax[i]=max;
        }
        max=0;
        for(int i=rightMax.length-2;i>0;i--)
        {
            max=Math.max(max,height[i+1]);
            rightMax[i]=max;
        }
        int result=0;
        for(int i=0;i<height.length;i++)
        {
            int temp=Math.min(leftMax[i],rightMax[i])-height[i];
            if(temp>0)
            {
                result+=temp;
            }
        }
        return result;
    }
}