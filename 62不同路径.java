    int[][] dp;
    public int uniquePaths(int m, int n) {
        this.dp =new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0&&j==0)) {
                    dp[0][0]=1;
                    continue;
                }
                if(i==0&&j==1) {
                    dp[0][1] = 1;
                    continue;
                }
                if(i==1&&j==0) {
                    dp[1][0] = 1;
                    continue;
                }
                if(i==0)
                {
                    dp[i][j]= dp[i][j-1];
                    continue;
                }
                if(j==0&&i!=0)
                {
                    dp[i][j]= dp[i-1][j];
                    continue;
                }
                dp[i][j]= dp[i-1][j]+ dp[i][j-1];
            }
        }
        return this.dp[n-1][m-1];
    }