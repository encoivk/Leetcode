    List<List<Integer>> result=new ArrayList<>();
    List<Integer>temp=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        BFS(1,n,k);
        return result;
    }

    public void BFS(int start,int n,int k)
    {
        if(temp.size()==k)
        {
            List<Integer>arr=temp.stream().toList();
            result.add(arr);
            return;
        }
        for(int i=start;i<=n-(k-temp.size()-1);i++)
        {
            temp.add(i);
            BFS(i+1,n,k);
            temp.removeLast();
        }
    }