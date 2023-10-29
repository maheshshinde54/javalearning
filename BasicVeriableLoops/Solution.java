package BasicVeriableLoops;

class Solution
{
    public static String mergeAlternately(String word1, String word2)
    {
        int length1 = word1.length();
        int length2 = word2.length();

        StringBuilder newstring = new StringBuilder(length1+length2);
        StringBuilder longestword=new StringBuilder();
        //int len=(length1>length2)?length1:length2;
        int len = length1+length2;

        //longestword = (length1>length2)?length1:length2;
    /*    for(int i =0 ;i<=len-1;i++)
        {
            if(length1==1){
                longestword.append(word1.charAt(i));
                longestword.append(word2);
                break;
                  }else  if(i<=length1-1)
            {
                longestword.append(word1.charAt(i));
                System.out.println(longestword+"  "+i );
            }
            if(length2==1){
                longestword.append(word2.charAt(i));
                for(int j=i+1;j<len;j++){
                    longestword.append(word1.charAt(j));
                }
                break;

            }else if(i<=length2-1)
            {
                longestword.append(word2.charAt(i));
                System.out.println(longestword+"  "+i );
            }


        }*/
        int i = 0;
        do
        {
            if(i<length1 || length1==1)
            {
                if(length1==1)
                {
                    longestword.append(word1.charAt(i));
                    longestword.append(word2);
                    break;
                }else  if(i<length1)
                {
                    longestword.append(word1.charAt(i));
                    System.out.println(longestword+"  "+i );

                }
            }
            if(i<length2 || length2==1)
            {
                if(length2==1){
                    longestword.append(word2.charAt(i));
                    longestword.append(word1.substring(i+1));
                    break;

                }else if(i<length2)
                {
                    longestword.append(word2.charAt(i));
                    System.out.println(longestword+"  "+i );

                }
            }
            i++;
        }
        while (len>i);
        System.out.println(longestword);
        return longestword.toString();
    }
    public static void main(String args [])
    {
       Solution.mergeAlternately("a","pqr");
    }
}