        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    StringBuilder temp=new StringBuilder();
    List<String> result=new ArrayList<>();
    String digits;
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.isEmpty())return result;
        this.digits=digits;
        DFS(0);
        return result;
    }

    public void DFS(int start)
    {
        if(temp.length()==digits.length())
        {
            result.add(String.valueOf(temp));
            return;
        }
            String values=phoneMap.get(digits.charAt(start));
            for(int j=0;j<values.length();j++)
            {
                temp.append(values.charAt(j));
                DFS(start+1);
                temp.deleteCharAt(temp.length()-1);
            }

    }