    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<dp.length;i++)
        {
            int max=0;
            for(int j=1;j<i;j++)
            {
                int temp=Math.max(j*(i-j),j*dp[i-j]);
                max= Math.max(temp, max);
            }
            dp[i]=max;
        }
        return dp[n];
    }