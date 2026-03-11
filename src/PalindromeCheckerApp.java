class PalindromeChecker{

    boolean checkPalindrome(String word){

        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String word = "level";

        if(checker.checkPalindrome(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}