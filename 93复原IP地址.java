    List<String> temp=new ArrayList<>();
    List<String> result=new ArrayList<>();
    String s;
    public List<String> restoreIpAddresses(String s) {
        this.s=s;
        DFS(0);
        return result;
    }

    public void DFS(int start)
    {
        if(temp.size()>4)return;
        if(start>=s.length())
        {
            if(temp.size()!=4)return;
            StringBuilder builder=new StringBuilder();
            for(String i:temp)
            {
                builder.append(i).append(".");
            }
            builder.deleteCharAt(builder.lastIndexOf("."));
            result.add(String.valueOf(builder));
        }
        for(int i=start;i<s.length();i++)
        {
            String tempString=s.substring(start,i+1);
            if(!isValid(tempString))return;
            temp.add(new String(tempString));
            DFS(i+1);
            temp.removeLast();
        }
    }

    public boolean isValid(String s)
    {
        Integer num=Integer.parseInt(s);
        if((s.charAt(0)=='0'&&s.length()!=1)||num>255)
        {
            return false;
        }
        return true;
    }