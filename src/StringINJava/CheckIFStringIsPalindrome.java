package StringINJava;

public class CheckIFStringIsPalindrome {

    public static void main(String[] args)
    {
        String s ="that";
        char[] charArray = s.toCharArray();
        System.out.println(checkPalindrome(charArray, 0, charArray.length-1));

    }

    private static boolean checkPalindrome(char[] charArray, int start, int end){
        while(start<end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


}
