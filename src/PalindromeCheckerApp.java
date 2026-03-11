interface PalindromeStrategy{
    boolean check(String word);
}

class StackStrategy implements PalindromeStrategy{

    public boolean check(String word){

        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeStrategy strategy = new StackStrategy();

        String word = "radar";

        if(strategy.check(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}