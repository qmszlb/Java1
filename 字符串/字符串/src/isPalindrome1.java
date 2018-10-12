import java.util.Scanner;

public class isPalindrome1 {

    private static boolean isPalindrome(String s) {

        int i = 0, j = s.length() - 1;
        while (i!= j && s.charAt(i) == s.charAt(j)) {

                i++;
                j--;
        }

        return (i == j);

    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串s");
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }
}