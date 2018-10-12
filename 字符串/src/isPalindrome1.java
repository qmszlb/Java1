public class isPalindrome1
{
    public static boolean isPalindrome(String s)
    {

        int i = 0, j = s.length() - 1;


        while (i!= j && s.charAt(i) == s.charAt(j))
        {
            i++;
            j--;
        }

        return (i == j);

    }


    public static void main(String[]args)
    {
        System.out.println(isPalindrome("NasabayabasaN"));
    }
}