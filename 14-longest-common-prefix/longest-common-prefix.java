class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=strs[0].length();
        for(int i = 1; i < strs.length; i++)
            {
                if(strs[i].length()<min)
                {
                    min = strs[i].length() ;
                }
            }
        String ans="";
        for(int i=0;i<min;i++)
            {
                boolean found=false;
                for(int j= 1; j < strs.length; j++)
                    {
                        if(strs[0].charAt(i)!=strs[j].charAt(i))
                        {
                            found = true;
                            break;
                        }
                    }
                if(found==true)
                    break;
                 ans = ans+strs[0].charAt(i);
            }
       return ans;
    }
}