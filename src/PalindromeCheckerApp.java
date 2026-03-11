public class PalindromeCheckerApp {

    static boolean checkPalindrome(String word){

        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "madam";

        long start = System.nanoTime();

        boolean result = checkPalindrome(word);

        long end = System.nanoTime();

        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        System.out.println("Execution Time: " + (end-start) + " ns");

    }
}