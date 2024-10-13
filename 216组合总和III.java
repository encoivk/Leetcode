    List<Integer> temp=new ArrayList<>();
    List<List<Integer>> result=new ArrayList<>();

    int[] arr={0,1,2,3,4,5,6,7,8,9};
    public List<List<Integer>> combinationSum3(int k, int n) {
        DFS(1,k,n);
        return result;
    }

    public void DFS(int start,int k,int n)
    {
        for(int i=start;i<=arr.length-(k-temp.size()-1);i++)
        {
            if(temp.size()==k)
            {
                int sum=0;
                for(Integer num:temp)
                {
                    sum+=num;
                }
                if(sum==n)
                {
                    List<Integer>list=temp.stream().toList();
                    result.add(list);
                }
                return;
            }
            temp.add(i);
            DFS(i+1,k,n);
            temp.removeLast();
        }
    }