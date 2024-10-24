class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i=i+2*k)
        {
            reverse(arr,i,Math.min(i+k-1,s.length()-1));
        }
        return String.valueOf(arr);
    }

    public void reverse(char[] arr,int begin,int end)
    {
        while(begin<end)
        {
            char temp=arr[begin];
            arr[begin]=arr[end];
            arr[end]=temp;
            begin++;
            end--;
        }
    }
}