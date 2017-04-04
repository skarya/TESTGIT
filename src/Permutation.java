// Java program to print all permutations of a
// given string.
public class Permutation
{
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
    }
 
    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param startIndex starting index
     * @param endIndex end index
     */
    private void permute(String str, int startIndex, int endIndex)
    {
    	System.out.println(" str " +str +" start "+startIndex +"  endIndex "+ endIndex );
        if (startIndex == endIndex)
            System.out.println(str);
        else
        {
            for (int i = startIndex; i <= endIndex; i++)
            {
                str = swap(str,startIndex,i);
                permute(str, startIndex+1, endIndex);
                str = swap(str,startIndex,i);
            }
        }
    }
 
    
    private String swap(String a, int i, int j)
    {
        

        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        //System.out.println(" str " +a +" start "+i +"  endIndex "+ j + "   String.valueOf(charArray)  " + String.valueOf(charArray));
        return String.valueOf(charArray);
    }
 
}