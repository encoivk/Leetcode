    public int[] G;
    public int numTrees(int n) {
        G=new int[n+1];
        G[0]=1;
        G[1]=1;
        getNum(n);
        return G[n];
    }

    public void getNum(int n)
    {
        for (int j=2;j<=n;j++)
        {
            int temp=0;
            for(int i=1;i<=j;i++)
            {
                temp+=G[i-1]*G[j-i];
            }
            G[j]=temp;
        }
    }