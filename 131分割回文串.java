    public List<List<String>> partition(String s) {
        this.s=s;
        DFS(0);
        return result;
    }

    public List<String> temp=new ArrayList<>();
    public List<List<String>> result=new ArrayList<>();
    String s;
    public void DFS(int start)
    {
        if(start>=s.length())
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<s.length();i++)
        {
            String tempString=s.substring(start,i+1);
            if(!isReverse(tempString))
            {
                continue;
            }
            temp.add(tempString);
            DFS(i+1);
            temp.removeLast();
        }
    }

    public boolean isReverse(String s)
    {
        StringBuilder builder=new StringBuilder(s);
        StringBuilder reverse = builder.reverse();
        return s.contentEquals(reverse);
    }