class Solution {
    public List<Integer>temp=new ArrayList<>();
    public List<List<Integer>> result=new ArrayList<>();
    public int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates=candidates;
        DFS(0,target);
        return this.result;
    }

    public void DFS(int start,int target)
    {
        int sum=temp.stream().mapToInt(Integer::intValue).sum();
        if(sum>=target)
        {
            if(sum==target)
            {
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            temp.add(candidates[i]);
            DFS(i,target);
            temp.removeLast();
        }
    }
}